package com.example.jwt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_hotel", schema = "TRIVAGOSEARCH")
public class UserHotelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "USER_ID")
    private Long userID;
    @Column(name = "HOTEL_ID")
    private Long hotelID;
    @Column(name = "STATUS")
    private String status;

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
     * @return The hotelID
     */
    public Long getHotelID() {
        return hotelID;
    }

    /**
     * @param hotelID The hotelID to set
     */
    public void setHotelID(Long hotelID) {
        this.hotelID = hotelID;
    }

    /**
     * @return The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
