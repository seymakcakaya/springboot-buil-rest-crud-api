package com.seyma.springboot.cruddemo.dao;

import com.seyma.springboot.cruddemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "members")
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
