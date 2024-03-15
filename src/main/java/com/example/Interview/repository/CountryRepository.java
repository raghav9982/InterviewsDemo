package com.example.Interview.repository;

import com.example.Interview.Entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Countries, Integer> {


    @Query(value = "select id, name from Countries where id = 1", nativeQuery = true)
    public Countries findTest();
}
