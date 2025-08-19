package com.executivePOS.RestAPI.repositories;

import com.executivePOS.RestAPI.TestDataUtil;
import com.executivePOS.RestAPI.domains.entities.UserEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class UserRepositoryIntegrationTests {
    private UserRepository underTest;

    @Autowired
    public UserRepositoryIntegrationTests(UserRepository underTest){
        this.underTest = underTest;
    }

    @Test
    public void createUserTest(){
        UserEntity userEntity = TestDataUtil.user1();
        userEntity.setId(null);
        underTest.save(userEntity);
        underTest.findById(userEntity.getId());
        Optional<UserEntity> result = underTest.findById(userEntity.getId());

        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(userEntity);
    }
}
