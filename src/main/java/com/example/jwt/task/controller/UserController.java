package com.example.jwt.task.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.constants.RoleEnum;
import com.example.jwt.entity.RoleEntity;
import com.example.jwt.entity.UserEntity;
import com.example.jwt.task.dao.UserEntityRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserEntityRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserController(UserEntityRepository userRepository,
            BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody UserEntity user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setBonusPoints(Long.valueOf(0));
        user.setRoles(getDefaultRoles());

        userRepository.save(user);
    }

    private Set<RoleEntity> getDefaultRoles() {
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setName(RoleEnum.USER.getRoleName());
        roleEntity.setDescription(RoleEnum.USER.getRoleDesc());
        Set<RoleEntity> roleSet = new HashSet<>();
        roleSet.add(roleEntity);
        return roleSet;
    }
}
