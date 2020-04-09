package com.example.springbootDemoProject.Controllers;

import com.example.springbootDemoProject.Models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentReport extends CrudRepository<Student, Integer> {

}
