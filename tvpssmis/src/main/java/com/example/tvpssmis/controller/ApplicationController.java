package com.example.tvpssmis.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.tvpssmis.entity.Program;
import com.example.tvpssmis.entity.StudentApplication;
import com.example.tvpssmis.entity.User;
import com.example.tvpssmis.repository.UserRepository;
import com.example.tvpssmis.service.ProgramService;
import com.example.tvpssmis.service.application.ApplicationDAO;

@Controller
@RequestMapping("/application")
public class ApplicationController {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);

    @Autowired
    private ApplicationDAO applicationDAO;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProgramService programService;

    @PostMapping("/submitApplication")
    public String submitApplication(@RequestParam("userId") int userId,
                                     @RequestParam("programId") int programId,
                                     @RequestParam("skills") String skills,
                                     @RequestParam("interests") String interests) {
        logger.info("Received application submission: userId={}, programId={}, skills={}, interests={}", userId, programId, skills, interests);

        StudentApplication application = new StudentApplication();
        
        User user = userRepository.findById(userId).orElse(null);
        Program program = programService.getProgramById(programId);
        
        if (user != null && program != null) {
            application.setUser(user);
            application.setProgramID(program);
            application.setSkills(skills);
            application.setInterest(interests);
            application.setApplyDate(new Date());

            applicationDAO.save(application);
            logger.info("Application saved successfully for userId={}", userId);
            return "redirect:/application/success";
        } else {
            logger.error("User or Program not found: userId={}, programId={}", userId, programId);
            return "redirect:/application/error";
        }
    }
}
