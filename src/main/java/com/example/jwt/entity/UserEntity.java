package com.example.jwt.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "USER", schema = "HOTELSEARCH")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "BONUS_POINTS")
    private Long bonusPoints;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLES", joinColumns = {
            @JoinColumn(name = "USER_ID") }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") })
    private Set<RoleEntity> roles;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_HOTEL", joinColumns = {
            @JoinColumn(name = "USER_ID") }, inverseJoinColumns = {
                    @JoinColumn(name = "HOTEL_ID") })
    private Set<HotelEntity> hotelEntity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleEntity> roles) {
        this.roles = roles;
    }

    /**
     * @return The bonusPoints
     */
    public Long getBonusPoints() {
        return bonusPoints;
    }

    /**
     * @param bonusPoints The bonusPoints to set
     */
    public void setBonusPoints(Long bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    /**
     * @return The hotelEntity
     */
    public Set<HotelEntity> getHotelEntity() {
        return hotelEntity;
    }

    /**
     * @param hotelEntity The hotelEntity to set
     */
    public void setHotelEntity(Set<HotelEntity> hotelEntity) {
        this.hotelEntity = hotelEntity;
    }
}
