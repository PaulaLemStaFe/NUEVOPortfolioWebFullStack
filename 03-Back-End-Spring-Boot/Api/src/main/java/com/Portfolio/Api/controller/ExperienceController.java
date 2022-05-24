package com.Portfolio.Api.controller;

import com.Portfolio.Api.dto.ExperienceDto;
import com.Portfolio.Api.model.Experience;
import com.Portfolio.Api.service.ExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/experience")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienceController {
    
    @Autowired
    ExperienceService experienceService;
    
    @GetMapping("/all")
    public ResponseEntity<List<Experience>> getExperiences(){
        List<Experience> experiences = experienceService.findExperience();
        return new ResponseEntity(experiences, HttpStatus.OK);
    }
    
    @GetMapping("/getidexperience/{idExperience}")
    public ResponseEntity<Experience> getExperienceById(@PathVariable("idExperience") Long idExperience) {
        Experience experience = experienceService.getIdExperience(idExperience).orElse(null);
        return new ResponseEntity(experience, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<?> createExperience(@RequestBody ExperienceDto experienceDto) {
        Experience experience = new Experience (experienceDto.getEnterpriseExperience(), experienceDto.getDateExperience(), experienceDto.getDescriptionExperience());
        experienceService.addExperience(experience);
        return new ResponseEntity(experience, HttpStatus.OK);
    }
    
    @PutMapping("/edit")
    public ResponseEntity<Experience> editExperience(@RequestBody Experience experience) {
        
        Experience editExperience = experienceService.editExperience(experience);
        return new ResponseEntity<>(editExperience, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{idExperience}")
    public ResponseEntity<?> deleteExperience(@PathVariable("idExperience") Long idExperience){
        experienceService.deleteExperience(idExperience);
        return new ResponseEntity(HttpStatus.OK);
    }
    
}
