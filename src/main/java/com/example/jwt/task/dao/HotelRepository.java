package com.example.jwt.task.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwt.entity.HotelEntity;

/**
 *
 * @author nandan_kelkar
 */
@Transactional
public interface HotelRepository extends JpaRepository<HotelEntity, Long> {

}
