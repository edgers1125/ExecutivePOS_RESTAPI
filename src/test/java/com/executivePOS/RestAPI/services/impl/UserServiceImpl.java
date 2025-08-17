package com.executivePOS.RestAPI.services.impl;

import com.executivePOS.RestAPI.domains.entities.UserEntity;
import com.executivePOS.RestAPI.respositories.UserRepository;
import com.executivePOS.RestAPI.services.UserService;
import org.springframework.transaction.annotation.Transactional;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    @Transactional
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public Boolean userExists(Long id) {
        return userRepository.existsById(id);
    }


}
