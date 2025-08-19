package com.executivePOS.RestAPI.services.impl;

import com.executivePOS.RestAPI.domains.entities.UserEntity;
import com.executivePOS.RestAPI.exceptions.UserExceptions.UserExceptions;
import com.executivePOS.RestAPI.respositories.UserRepository;
import com.executivePOS.RestAPI.services.UserService;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    @Transactional
    public UserEntity createUser(UserEntity userEntity) {
        if(userRepository.existsByEmail(userEntity.getEmail())){
            throw new UserExceptions.EmailExistsException("Email Already Exists, " +userEntity.getEmail());
        }
        return userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(Long id) {
        if(!userRepository.existsById(id)){
            throw new UserExceptions.UserDoesNotExistException("User "+id+ " does not exist");
        }
        userRepository.deleteById(id);
    }

    @Override
    public Boolean userExists(Long id) {
        return userRepository.existsById(id);
    }

    @Override
    public UserEntity updateUserInfo(Long id, UserEntity userEntity) {
        userEntity.setId(id);
        return userRepository.findById(id).map(mapEntity ->{
            Optional.ofNullable(userEntity.getPersonalNumber()).ifPresent(mapEntity::setPersonalNumber);
            Optional.ofNullable(userEntity.getFirstName()).ifPresent(mapEntity::setFirstName);
            Optional.ofNullable(userEntity.getLastName()).ifPresent(mapEntity::setLastName);
            Optional.ofNullable(userEntity.getAddress()).ifPresent(mapEntity::setAddress);
            Optional.ofNullable(userEntity.getGovtInfo()).ifPresent(mapEntity::setGovtInfo);
            Optional.ofNullable(userEntity.getContactPerson()).ifPresent(mapEntity::setContactPerson);
            Optional.ofNullable(userEntity.getContactPersonNumber()).ifPresent(mapEntity::setContactPersonNumber);
            Optional.ofNullable(userEntity.getBirthday()).ifPresent(mapEntity::setBirthday);
            return userRepository.save(mapEntity);
        }).orElseThrow(() -> new UserExceptions.UserDoesNotExistException("User "+id+ " does not exist"));
    }

    @Override
    public Boolean emailExists(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public UserEntity getUser(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new UserExceptions.UserDoesNotExistException("User "+id+ " does not exist"));
    }


}
