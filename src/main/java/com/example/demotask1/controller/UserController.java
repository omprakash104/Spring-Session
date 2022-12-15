package com.example.task1.controller;

import com.example.task1.model.userModels;
import com.example.task1.repository.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepo userRepo;
    @GetMapping
    public ResponseEntity<List<userModels>> getAllUsers(){
        List<userModels> usersList = userRepo.findAll();
        return new ResponseEntity<>(usersList, HttpStatus.OK);
    }
}
