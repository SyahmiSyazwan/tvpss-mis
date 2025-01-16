package com.example.tvpssmis.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.tvpssmis.entity.Program;
import com.example.tvpssmis.entity.StudentApplication;
import com.example.tvpssmis.service.ApplicationService;
import com.example.tvpssmis.entity.User;
import com.example.tvpssmis.repository.UserRepository;
import com.example.tvpssmis.service.ProgramService;
import com.example.tvpssmis.service.ApplicationDAO;

@Controller
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    private ApplicationDAO applicationDAO;

    @Autowired
    private UserRepository userRepository; // Add UserRepository to fetch User

    @Autowired
    private ProgramService programService; // Add ProgramService to fetch Program

    @PostMapping("/submitApplication")
    public String submitApplication(@RequestParam("userId") int userId,
                                     @RequestParam("programId") int programId,
                                     @RequestParam("skills") String skills,
                                     @RequestParam("interests") String interests) {
        StudentApplication application = new StudentApplication();
        
        // Fetch User and Program from the database
        User user = userRepository.findById(userId).orElse(null); // Fetch User
Program program = programService.getProgramById(programId); // Fetch Program
        
        if (user != null && program != null) {
            application.setUser(user);
            application.setProgramID(program);
            application.setSkills(skills);
            application.setInterest(interests);
            application.setApplyDate(new Date());

            applicationDAO.save(application);
            return "redirect:/application/success"; // Redirect to a success page or dashboard
        } else {
            // Handle the case where user or program is not found
            return "redirect:/application/error"; // Redirect to an error page
        }
    }
}