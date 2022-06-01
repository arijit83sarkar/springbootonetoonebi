package com.raven.springbootonetoonebi.controller;

import com.raven.springbootonetoonebi.entity.Owner;
import com.raven.springbootonetoonebi.repository.OwnerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepository;

    @PostMapping("/saveOwner")
    public Owner saveOwner(@RequestBody Owner owner) {
        System.out.println("Owner save called...");
        Owner ownerOut = ownerRepository.save(owner);
        System.out.println("Saved Owner :: " + ownerOut);

        return ownerOut;
    }

    @GetMapping("/getOwner/{id}")
    public String getOwner(@PathVariable(name = "id") String id) {
        System.out.println("Owner get called...");
        Owner ownerOut = ownerRepository.getById(Integer.valueOf(id));
        System.out.println("Owner with house :: " + ownerOut);

        return "Owner fetched...";
    }
}
