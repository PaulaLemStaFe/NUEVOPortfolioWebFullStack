package com.Portfolio.Api.service;

import com.Portfolio.Api.model.Project;
import com.Portfolio.Api.repository.ProjectRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectService {
    
    @Autowired
    ProjectRepository projectRepo;
    
    public List<Project> findProject(){
        return projectRepo.findAll();
    }
    
    public Optional<Project> getIdProject(Long idProject) {
        return projectRepo.findById(idProject);
    }
    
    public void addProject(Project project) {
        projectRepo.save(project);
    }
    
    public void deleteProject(Long idProject){
        projectRepo.deleteById(idProject);
    }
    
    public Project editProject(Project project) {
        return projectRepo.save(project);
    }
    
}
