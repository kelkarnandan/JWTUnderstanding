package com.example.jwt.task.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwt.entity.UserRoleEntity;

/**
 *
 * @author nandan_kelkar
 */
@Transactional
public interface UserRoleRepository extends JpaRepository<UserRoleEntity, String> {

}
