package com.executivePOS.RestAPI.services;

import com.executivePOS.RestAPI.domains.entities.UserEntity;

public interface UserService {
    UserEntity createUser(UserEntity userEntity);
    void deleteUser(Long id);
    Boolean userExists(Long id);
}
