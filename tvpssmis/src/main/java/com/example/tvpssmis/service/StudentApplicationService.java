package com.example.tvpssmis.service;

import com.example.tvpssmis.entity.StudentApplication;
import com.example.tvpssmis.service.StudentApplicationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentApplicationService {

    private final StudentApplicationDAO studentApplicationDAO;

    @Autowired
    public StudentApplicationService(StudentApplicationDAO studentApplicationDAO) {
        this.studentApplicationDAO = studentApplicationDAO;
    }

    @Transactional
    public List<StudentApplication> getAllApplications() {
        return studentApplicationDAO.findAll();
    }

    @Transactional
    public void updateApplicationStatus(int application_Id, String status) {
        studentApplicationDAO.updateStatus(application_Id, status);
    }
}
