package com.example.jwt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotel", schema = "TRIVAGOSEARCH")
public class HotelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "ROOM_TYPE")
    private String roomType;
    /*
     * @Column(name = "NO_OF_ROOMS_AVAILABLE") private int noOfRoomsAvailable;
     * 
     * @Column(name = "NO_OF_ROOMS_BOOKED") private int noOfRoomsBooked;
     */
    @Column(name = "BOOKING_AMOUNT")
    private Long bookingAmount;
    @Column(name = "BONUS_POINTS")
    private Long bonusPoints;

    /**
     * @return The id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id The id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The roomType
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * @param roomType The roomType to set
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /* *//**
          * @return The noOfRoomsAvailable
          */
    /*
     * public int getNoOfRoomsAvailable() { return noOfRoomsAvailable; }
     * 
     *//**
        * @param noOfRoomsAvailable The noOfRoomsAvailable to set
        */
    /*
     * public void setNoOfRoomsAvailable(int noOfRoomsAvailable) { this.noOfRoomsAvailable =
     * noOfRoomsAvailable; }
     * 
     *//**
        * @return The noOfRoomsBooked
        */
    /*
     * public int getNoOfRoomsBooked() { return noOfRoomsBooked; }
     * 
     *//**
        * @param noOfRoomsBooked The noOfRoomsBooked to set
        *//*
           * public void setNoOfRoomsBooked(int noOfRoomsBooked) { this.noOfRoomsBooked =
           * noOfRoomsBooked; }
           */

    /**
     * @return The bookingAmount
     */
    public Long getBookingAmount() {
        return bookingAmount;
    }

    /**
     * @param bookingAmount The bookingAmount to set
     */
    public void setBookingAmount(Long bookingAmount) {
        this.bookingAmount = bookingAmount;
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

}
