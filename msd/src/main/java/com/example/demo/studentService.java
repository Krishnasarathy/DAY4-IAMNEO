package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentService {
	@Autowired
	studentrespository repository;
	public Optional<student> getStudent(int id){
		return repository.findById(id);
		
	}
	public String updateDetails(student stu) {
		repository.save(stu);
		return "updated";
	}
	public String deleteDetails(int id) {
		repository.deleteById(id);
		return "Id deleted";
	}

}
