package com.executivePOS.RestAPI.controllers;

import com.executivePOS.RestAPI.domains.DTO.UserDTO;
import com.executivePOS.RestAPI.domains.entities.UserEntity;
import com.executivePOS.RestAPI.mappers.Mapper;
import com.executivePOS.RestAPI.services.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@AutoConfigureMockMvc
public class UserControllerIntegrationTests {
    private MockMvc mockMvc;
    private ObjectMapper objectMapper;
    private UserService userService;
    private Mapper<UserEntity, UserDTO> userMapper;

    @Autowired
    public UserControllerIntegrationTests(MockMvc mockMvc, UserService userService, Mapper<UserEntity, UserDTO> userMapper){
        this.mockMvc = mockMvc;
        this.objectMapper = new ObjectMapper();
        this.userService = userService;
        this.userMapper = userMapper;
    }

}
