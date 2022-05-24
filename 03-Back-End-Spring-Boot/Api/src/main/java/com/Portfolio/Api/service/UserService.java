package com.Portfolio.Api.service;

import com.Portfolio.Api.model.User;
import com.Portfolio.Api.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    
    @Autowired
    UserRepository userRepo;
    
    public List<User> findUser(){
        return userRepo.findAll();
    }
    
    public Optional<User> getOneUser(Long idUser) {
        return userRepo.findById(idUser);
    }
    
    public void addUser(User user) {
        userRepo.save(user);
    }
    
    public void deleteUser(Long idUser){
        userRepo.deleteById(idUser);
    }
    
}
