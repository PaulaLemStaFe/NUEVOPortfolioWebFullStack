package com.Portfolio.Api.repository;

import com.Portfolio.Api.model.ComputerSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerSkillRepository extends JpaRepository<ComputerSkill, Long> {
    
}
