package com.techgeeknext.controller;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techgeeknext.model.User;
import com.techgeeknext.repository.UserRepository;

@RestController
public class UserController {
    @Autowired
    private UserRepository repo;
     
    @GetMapping("/users")
    public ArrayList<User> listAll(Model model) {
    	ArrayList<User> listUsers = (ArrayList) repo.findAll();
        model.addAttribute("listUsers", listUsers);
        return listUsers;
    }
     
  
}