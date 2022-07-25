package com.BSIT.JPAdemo.StudentRepository;

import org.springframework.data.repository.CrudRepository;

import com.BSIT.JPAdemo.model.Student;

public interface StudentDAO extends CrudRepository<Student, Integer>  {

}
