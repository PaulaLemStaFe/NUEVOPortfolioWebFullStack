package com.Portfolio.Api.service;

import com.Portfolio.Api.model.Experience;
import com.Portfolio.Api.repository.ExperienceRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienceService {
    
    @Autowired
    ExperienceRepository experienceRepo;
    
    public List<Experience> findExperience(){
        return experienceRepo.findAll();
    }
    
    public Optional<Experience> getIdExperience(Long idExperience) {
        return experienceRepo.findById(idExperience);
    }
    
    public void addExperience(Experience experience) {
        experienceRepo.save(experience);
    }
    
    public void deleteExperience(Long idExperience){
        experienceRepo.deleteById(idExperience);
    }
    
    public Experience editExperience(Experience experience) {
        return experienceRepo.save(experience);
    }
    
}
