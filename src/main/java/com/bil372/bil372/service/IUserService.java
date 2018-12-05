package com.bil372.bil372.service;

import com.bil372.bil372.model.RoleEntity;
import com.bil372.bil372.model.UserEntity;

import java.util.List;
import java.util.Optional;

public interface IUserService {


    UserEntity findByUsername(String usarname);

    Optional<UserEntity> findById(Long id);

    List<UserEntity> findAll();

    List<RoleEntity> findAllRoles();

    public UserEntity save(UserEntity userEntity);

}