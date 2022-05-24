package com.Portfolio.Api.controller;

import com.Portfolio.Api.dto.ComputerSkillDto;
import com.Portfolio.Api.model.ComputerSkill;
import com.Portfolio.Api.service.ComputerSkillService;
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
@RequestMapping("/computerskill")
@CrossOrigin(origins = "http://localhost:4200")
public class ComputerSkillController {
    
    @Autowired
    ComputerSkillService computerskillService;
    
    @GetMapping("/all")
    public ResponseEntity<List<ComputerSkill>> getComputerSkills(){
        List<ComputerSkill> computerskills = computerskillService.findComputerSkill();
        return new ResponseEntity(computerskills, HttpStatus.OK);
    }
    
    @GetMapping("/getidcomputerskill/{idComputerSkill}")
    public ResponseEntity<ComputerSkill> getComputerSkillById(@PathVariable("idComputerSkill") Long idComputerSkill) {
        ComputerSkill computerskill = computerskillService.getIdComputerSkill(idComputerSkill).orElse(null);
        return new ResponseEntity(computerskill, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<?> createComputerSkill(@RequestBody ComputerSkillDto computerskillDto) {
        ComputerSkill computerskill = new ComputerSkill (computerskillDto.getTitleComputerSkill(), computerskillDto.getImgComputerSkill());
        computerskillService.addComputerSkill(computerskill);
        return new ResponseEntity(computerskill, HttpStatus.OK);
    }
    
    @PutMapping("/edit")
    public ResponseEntity<ComputerSkill> editComputerSkill(@RequestBody ComputerSkill computerskill) {
        
        ComputerSkill editComputerSkill = computerskillService.editComputerSkill(computerskill);
        return new ResponseEntity<>(editComputerSkill, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{idComputerSkill}")
    public ResponseEntity<?> deleteComputerSkill(@PathVariable("idComputerSkill") Long idComputerSkill){
        computerskillService.deleteComputerSkill(idComputerSkill);
        return new ResponseEntity(HttpStatus.OK);
    }
    
}
