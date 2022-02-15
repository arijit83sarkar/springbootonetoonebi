package com.raven.springbootonetoonebi.repository;

import com.raven.springbootonetoonebi.entity.House;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Integer> {

}
