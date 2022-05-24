package com.Portfolio.Api.controller;

import com.Portfolio.Api.dto.UserDto;
import com.Portfolio.Api.model.User;
import com.Portfolio.Api.service.UserService;
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
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    
    @Autowired
    UserService userService;
    
    @GetMapping("/all")
    public ResponseEntity<List<User>> getUser() {
        List<User> users = userService.findUser();
        return new ResponseEntity(users, HttpStatus.OK);
    }
    
    @GetMapping("/getiduser/{idUser}")
    public ResponseEntity<User> getUser(@PathVariable("idUser") Long idUser) {
        User user = userService.getOneUser(idUser).orElse(null);
        return new ResponseEntity(user, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<?> createUser(@RequestBody UserDto userDto) {
        User user = new User (userDto.getNameUser(), userDto.getTitleUser(), userDto.getImgbannerUser(), userDto.getImgprofileUser(), userDto.getText01User(), userDto.getText02User(), userDto.getText03User());
        userService.addUser(user);
        return new ResponseEntity(user, HttpStatus.OK);
    }
    
    @PutMapping("/edit/{idUser}")
    public ResponseEntity<?> editUser(@PathVariable("idUser") Long idUser,
                                             @RequestBody UserDto userDto) {
        
        User user = userService.getOneUser(idUser).orElse(null);
        
        user.setNameUser(userDto.getNameUser());
        user.setTitleUser(userDto.getTitleUser());
        user.setImgbannerUser(userDto.getImgbannerUser());
        user.setImgprofileUser(userDto.getImgprofileUser());
        user.setText01User(userDto.getText01User());
        user.setText02User(userDto.getText02User());
        user.setText03User(userDto.getText03User());
        
        userService.addUser(user);
        return new ResponseEntity(user, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{idUser}")
    public ResponseEntity<?> deleteUser(@PathVariable("idUser") Long idUser) {
        userService.deleteUser(idUser);
        return new ResponseEntity(HttpStatus.OK);
    }
    
}
