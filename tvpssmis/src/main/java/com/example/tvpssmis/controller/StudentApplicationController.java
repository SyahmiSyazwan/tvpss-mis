package com.example.tvpssmis.controller;

import com.example.tvpssmis.entity.StudentApplication;
import com.example.tvpssmis.service.StudentApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/studentApplication")
public class StudentApplicationController {

    private final StudentApplicationService studentApplicationService;

    @Autowired
    public StudentApplicationController(StudentApplicationService studentApplicationService) {
        this.studentApplicationService = studentApplicationService;
    }

    @GetMapping("/manage")
    public String manageApplications(Model model) {
        List<StudentApplication> applications = studentApplicationService.getAllApplications();
        model.addAttribute("applications", applications);
        return "studentApplication/application";
    }

    @PostMapping("/accept")
    public String acceptApplication(@RequestParam("application_Id") int application_Id) {
        studentApplicationService.updateApplicationStatus(application_Id, "Accepted");
        return "redirect:/studentApplication/application";
    }

    @PostMapping("/reject")
    public String rejectApplication(@RequestParam("application_Id") int application_Id) {
        studentApplicationService.updateApplicationStatus(application_Id, "Rejected");
        return "redirect:studentApplication/application";
    }
}
