package com.example.Interview.resource;

import com.example.Interview.Entity.Countries;
import com.example.Interview.model.Employee;
import com.example.Interview.service.InterviewService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
public class InterviewResource {

    @Autowired
    InterviewService interviewService;


    @GetMapping("/{id}")
    public Countries getEmployeeById(@PathVariable("id") int id) {
        return interviewService.getCountries(id);
    }



   @PostMapping("country")
   @PutMapping("country")
    public Countries saveNewCountry(@RequestBody Countries countries ) {
       return interviewService.saveCountries(countries);

    }

    @DeleteMapping("/{id}")
    public void deleteNewCountry(@PathVariable("id") int id) {
         interviewService.deleteCountries(id);
    }
}
