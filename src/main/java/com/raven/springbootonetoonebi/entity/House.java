package com.raven.springbootonetoonebi.entity;

import javax.persistence.*;

@Entity
@Table(name = "HOUSE")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "no_of_floor")
    private int noOfFloor = 0;

    @Column(name = "no_of_bed_room")
    private int noOfBedRoom = 0;

    @Column(name = "area")
    private String area = "";

    @OneToOne(mappedBy = "house", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Owner owner;

    public House() {
    }

    public House(int noOfFloor, int noOfBedRoom, String area) {
        this.noOfFloor = noOfFloor;
        this.noOfBedRoom = noOfBedRoom;
        this.area = area;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getNoOfFloor() {
        return noOfFloor;
    }

    public void setNoOfFloor(int noOfFloor) {
        this.noOfFloor = noOfFloor;
    }

    public int getNoOfBedRoom() {
        return noOfBedRoom;
    }

    public void setNoOfBedRoom(int noOfBedRoom) {
        this.noOfBedRoom = noOfBedRoom;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "Id=" + Id +
                ", noOfFloor=" + noOfFloor +
                ", noOfBedRoom=" + noOfBedRoom +
                ", area='" + area + '\'' +
                '}';
    }
}
