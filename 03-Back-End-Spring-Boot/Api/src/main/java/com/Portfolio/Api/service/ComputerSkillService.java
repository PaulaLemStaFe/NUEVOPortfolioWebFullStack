package com.Portfolio.Api.service;

import com.Portfolio.Api.model.ComputerSkill;
import com.Portfolio.Api.repository.ComputerSkillRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ComputerSkillService {
    
    @Autowired
    ComputerSkillRepository computerskillRepo;
    
    public List<ComputerSkill> findComputerSkill(){
        return computerskillRepo.findAll();
    }
    
    public Optional<ComputerSkill> getIdComputerSkill(Long idComputerSkill) {
        return computerskillRepo.findById(idComputerSkill);
    }
    
    public void addComputerSkill(ComputerSkill computerskill) {
        computerskillRepo.save(computerskill);
    }
    
    public void deleteComputerSkill(Long idComputerSkill){
        computerskillRepo.deleteById(idComputerSkill);
    }
    
    public ComputerSkill editComputerSkill(ComputerSkill computerskill) {
        return computerskillRepo.save(computerskill);
    }
    
}
