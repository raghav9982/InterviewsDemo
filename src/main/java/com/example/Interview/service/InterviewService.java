package com.example.Interview.service;

import com.example.Interview.Entity.Countries;
import com.example.Interview.repository.CountryRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterviewService {


    @Autowired
    CountryRepository countryRepository;

    public Countries getCountries(int id) {
      Countries countries = countryRepository.findById(id).get();
        // Countries countries = countryRepository.findTest();
      return countries;

    }

    public Countries saveCountries(Countries country) {
        Countries countries = countryRepository.save(country);
        // Countries countries = countryRepository.findTest();
        return countries;

    }

    public void deleteCountries(int id) {
        countryRepository.deleteById(id);
        // Countries countries = countryRepository.findTest();

    }
}
