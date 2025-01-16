package com.example.tvpssmis.repository;

import com.example.tvpssmis.entity.StudentForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentFormRepository extends JpaRepository<StudentForm, Integer> {
}
