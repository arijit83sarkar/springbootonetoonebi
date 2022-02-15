package com.raven.springbootonetoonebi.entity;

import javax.persistence.*;

@Entity
@Table(name = "OWNER")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "owner_name")
    private String ownerName = "";

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "house_id")
    private House house;

    public Owner() {
    }

    public Owner(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "Id=" + Id +
                ", ownerName='" + ownerName + '\'' +
                ", house=" + house +
                '}';
    }
}
