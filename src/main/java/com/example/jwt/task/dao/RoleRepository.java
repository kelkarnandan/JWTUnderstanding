package com.example.jwt.task.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwt.entity.RoleEntity;

/**
 *
 * @author nandan_kelkar
 */
@Transactional
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

}
