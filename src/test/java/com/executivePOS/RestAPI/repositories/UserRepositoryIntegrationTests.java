package com.executivePOS.RestAPI.repositories;

import com.executivePOS.RestAPI.TestDataUtil;
import com.executivePOS.RestAPI.domains.entities.UserEntity;
import com.executivePOS.RestAPI.respositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

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
    public void createUserTest(){
        UserEntity userEntity = TestDataUtil.user1();
        userEntity.setId(null);
        userRepository.save(userEntity);
        userRepository.findById(userEntity.getId());
        Optional<UserEntity> result = userRepository.findById(userEntity.getId());
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(userEntity);
    }
    @Test
    public void existsByEmailTest(){

    }
}
