package com.example.jwt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ROLES", schema = "HOTELSEARCH")
public class UserRoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "USER_ID")
    private Long userID;
    @Column(name = "ROLE_ID")
    private Long roleID;

    /**
     * @return The id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id The id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return The userID
     */
    public Long getUserID() {
        return userID;
    }

    /**
     * @param userID The userID to set
     */
    public void setUserID(Long userID) {
        this.userID = userID;
    }

    /**
     * @return The roleID
     */
    public Long getRoleID() {
        return roleID;
    }

    /**
     * @param roleID The roleID to set
     */
    public void setRoleID(Long roleID) {
        this.roleID = roleID;
    }

}
