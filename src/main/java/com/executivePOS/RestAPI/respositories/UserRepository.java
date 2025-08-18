package com.executivePOS.RestAPI.respositories;

import com.executivePOS.RestAPI.domains.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
