package com.raven.springbootonetoonebi.repository;

import com.raven.springbootonetoonebi.entity.Owner;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {

}
