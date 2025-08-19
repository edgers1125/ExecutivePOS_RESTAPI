package com.executivePOS.RestAPI.repositories;

import com.executivePOS.RestAPI.respositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class UserRepositoryIntegrationTests {
    private UserRepository userRepository;

    @Autowired
    public UserRepositoryIntegrationTests(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Test
    public void existsByEmailTest(){

    }
}
