package com.repository;

import com.entity.PasswordsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordRepository extends CrudRepository<PasswordsEntity, Integer> {
    PasswordsEntity findByPassword(String password);

    PasswordsEntity findByUserId(Integer userId);
}
