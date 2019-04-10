package com.example.jwt.task.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jwt.entity.UserEntity;

@Transactional
public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {

    @Query("SELECT u FROM UserEntity u WHERE u.username = ?1")
    UserEntity findByUsername(String username);

    @Query("SELECT u FROM UserEntity u WHERE u.id = ?1")
    UserEntity findByID(Long id);
}