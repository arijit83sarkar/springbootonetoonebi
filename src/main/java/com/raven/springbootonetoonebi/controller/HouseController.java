package com.raven.springbootonetoonebi.controller;

import com.raven.springbootonetoonebi.entity.House;
import com.raven.springbootonetoonebi.repository.HouseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseRepository houseRepository;

    @GetMapping("/getHouse/{id}")
    public String getHouse(@PathVariable(name = "id") String id) {
        System.out.println("House get called...");
        House houseOut = houseRepository.getById(Integer.valueOf(id));
        System.out.println("House :: " + houseOut);
        System.out.println("Owner :: " + houseOut.getOwner());

        return "House fetched...";
    }
}
