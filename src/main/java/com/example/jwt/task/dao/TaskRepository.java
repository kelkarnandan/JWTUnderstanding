package com.example.jwt.task.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jwt.task.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}