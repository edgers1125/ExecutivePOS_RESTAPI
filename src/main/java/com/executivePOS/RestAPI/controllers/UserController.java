package com.executivePOS.RestAPI.controllers;

import com.executivePOS.RestAPI.domains.DTO.UserDTO;
import com.executivePOS.RestAPI.domains.entities.UserEntity;
import com.executivePOS.RestAPI.mappers.Mapper;
import com.executivePOS.RestAPI.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService userService;
    private Mapper<UserEntity, UserDTO> userMapper;

    public UserController(UserService userService, Mapper<UserEntity,UserDTO> userMapper){
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping("/users")
    public ResponseEntity<UserDTO> createUser (@RequestBody UserDTO userDTO){
        UserEntity userEntity = userMapper.mapFrom(userDTO);
        UserEntity createdUser = userService.createUser(userEntity);
        return new ResponseEntity<>(userMapper.mapTo(createdUser), HttpStatus.CREATED);
    }

    @PatchMapping("/users/{id}")
    public ResponseEntity<UserDTO> updateUserInfo(@RequestBody UserDTO userDTO, @PathVariable("id") Long id){
        UserEntity userEntity = userMapper.mapFrom(userDTO);
        UserEntity savedUser = userService.updateUserInfo(id, userEntity);
        return new ResponseEntity<>(userMapper.mapTo(savedUser), HttpStatus.OK);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Long id){
        return new ResponseEntity<>(userMapper.mapTo(userService.getUser(id)), HttpStatus.FOUND);
    }

    @GetMapping("/users/check-email")
    public ResponseEntity<Boolean> checkEmailExists(@RequestParam String email){
        boolean exists = userService.emailExists(email);
        return ResponseEntity.ok(exists);
    }




}
