package com.example.tvpssmis.service.application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.tvpssmis.entity.StudentApplication;

@Repository
public class ApplicationDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void save(StudentApplication application) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(application);
    }

    @Transactional
    public StudentApplication findById(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.get(StudentApplication.class, id);
    }

    // Additional methods can be added as needed
}
