package com.Day3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Day3.entity.Student;
import com.Day3.repository.StudentRepository;

@SpringBootApplication
public class ExcelRDay3SpringbootSmsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ExcelRDay3SpringbootSmsApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
//		Student s1 = new Student("Sakshi","Goyal","Sakshi@gmail.com");
////		studentRepository.save(s1);
//		
//		Student s2 = new Student("Sakshi2","Goyal2","Sakshi2@gmail.com");
//		studentRepository.save(s2);
//		
//		
//		Student s3 = new Student("Sakshi3","Goyal3","Sakshi3@gmail.com");
//		studentRepository.save(s3);
//		
//		Student s4 = new Student("Sakshi4","Goyal4","Sakshi4@gmail.com");
//		studentRepository.save(s4);
//		
//		Student s5 = new Student("Sakshi5","Goyal5","Sakshi5@gmail.com");
//		studentRepository.save(s5);
		
	}
	
	
	

}
