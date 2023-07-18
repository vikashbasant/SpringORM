package com.kash;

import com.kash.model.onetoone.bidirectionalmapping.BiLaptop;
import com.kash.model.onetoone.bidirectionalmapping.BiStudent;
import com.kash.repo.StudentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class SpringOrmApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringOrmApplication.class, args);
	}


	@Autowired
	private StudentRepo studentRepo;

	private Logger logger = LoggerFactory.getLogger(SpringOrmApplication.class);

	@Override
	public void run(String... args) throws Exception {

		//-----------------Save Info---------------------//

		/*// =>> save student data:
		BiStudent student = new BiStudent();
		student.setStudentName("Kumar");
		student.setAbout("i'm student");


		// =>> laptop data:
		BiLaptop laptop = new BiLaptop();
		laptop.setBrand("HP");
		laptop.setModelName("BEC345");

		// set a student inside the laptop table:
		laptop.setBiStudent(student);

		// set a laptop inside the student table:
		student.setLaptop(laptop);

		// simply save the student then automatically laptop will save
		// because we are using cascade = CascadeType.ALL:
		BiStudent saveStudent = studentRepo.save(student);
		logger.info("student: {}",  saveStudent.getStudentName());*/


		//-------------Fetch Info---------------------//
		BiStudent fetchStudent = studentRepo.findById(2).get();
		logger.info("student: {}", fetchStudent.getStudentName());
		logger.info("laptop: {}", (fetchStudent.getLaptop()).getBrand());

	}
}
