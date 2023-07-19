package com.kash;

import com.kash.model.manytomany.bidirectional.BiCategory;
import com.kash.model.manytomany.bidirectional.BiProduct;
import com.kash.model.onetomany.bidirectional.BiOTMAddress;
import com.kash.model.onetomany.bidirectional.BiOTMStudent;
import com.kash.model.onetoone.bidirectionalmapping.BiLaptop;
import com.kash.model.onetoone.bidirectionalmapping.BiStudent;
import com.kash.repo.CategoryRepo;
import com.kash.repo.ProductRepo;
import com.kash.repo.StudentOTMRepo;
import com.kash.repo.StudentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringOrmApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringOrmApplication.class, args);
	}


	@Autowired
	private StudentRepo studentRepo;

	@Autowired
	private StudentOTMRepo studentOTMRepo;

	@Autowired
	private CategoryRepo categoryRepo;

	@Autowired
	private ProductRepo productRepo;

	private Logger logger = LoggerFactory.getLogger(SpringOrmApplication.class);

	@Override
	public void run(String... args) throws Exception {

		//-------------One to One-----------------//


//		//-----------------Save Info---------------------//
//
//		/*// =>> save student data:
//		BiStudent student = new BiStudent();
//		student.setStudentName("Kumar");
//		student.setAbout("i'm student");
//
//
//		// =>> laptop data:
//		BiLaptop laptop = new BiLaptop();
//		laptop.setBrand("HP");
//		laptop.setModelName("BEC345");
//
//		// set a student inside the laptop table:
//		laptop.setBiStudent(student);
//
//		// set a laptop inside the student table:
//		student.setLaptop(laptop);
//
//		// simply save the student then automatically laptop will save
//		// because we are using cascade = CascadeType.ALL:
//		BiStudent saveStudent = studentRepo.save(student);
//		logger.info("student: {}",  saveStudent.getStudentName());*/
//
//
//		//-------------Fetch Info---------------------//
//		BiStudent fetchStudent = studentRepo.findById(2).get();
//		logger.info("student: {}", fetchStudent.getStudentName());
//		logger.info("laptop: {}", (fetchStudent.getLaptop()).getBrand());



		//------------One To Many--------------------------//

/*		BiOTMStudent student = new BiOTMStudent();
		student.setStudentName("Kamal");
		student.setAbout("Student");

		BiOTMAddress address1 = new BiOTMAddress();
		address1.setCity("spj");
		address1.setStreet("sarairanjan");
		address1.setCountry("india");


		BiOTMAddress address2 = new BiOTMAddress();
		address2.setCity("pnb");
		address2.setStreet("patna");
		address2.setCountry("india");

		BiOTMAddress address3 = new BiOTMAddress();
		address3.setCity("koa");
		address3.setStreet("west bengal");
		address3.setCountry("india");

		// add a student into address:
		address1.setBiOTMStudent(student);
		address2.setBiOTMStudent(student);
		address3.setBiOTMStudent(student);


		// add a list of addresses to a student:
		student.setAddresses(Arrays.asList(address1, address2, address3));

		// simply save:
		studentOTMRepo.save(student);


		// fetch student from db:
		BiOTMStudent fetchStudent = studentOTMRepo.findById(1).get();
		logger.info("Student: {}", fetchStudent.getStudentName());

		List<BiOTMAddress> addresses = fetchStudent.getAddresses();
		for (BiOTMAddress address : addresses) {
			logger.info("Address: {}", address.getCity());
		}*/


		//----------ManyToMany-----------------//

		/*// =>> Create BiProduct:
		BiProduct product = new BiProduct();
		product.setPId("1");
		product.setProductName("Iphone");

		BiProduct product1 = new BiProduct();
		product1.setPId("2");
		product1.setProductName("Sumsung");

		BiProduct product2 = new BiProduct();
		product2.setPId("3");
		product2.setProductName("Nothing Phone");


		// =>> Create Category:
		BiCategory category = new BiCategory();
		category.setCId("1");
		category.setTitle("Electronics");

		BiCategory category1 = new BiCategory();
		category1.setCId("2");
		category1.setTitle("Books");



		// set the list of product and list of category:
		category.setBiProducts(Arrays.asList(product, product1));
		category1.setBiProducts(Arrays.asList(product1, product2));

		product.setBiCategories(Arrays.asList(category, category1));
		product1.setBiCategories(List.of(category1));
		product2.setBiCategories(List.of(category));


		// now save the category object then automatically save the product object
		// because we are using cascade property
		categoryRepo.save(category);
		categoryRepo.save(category1);*/

		//--------Fetch Info---------//
		BiCategory fetchCategory = categoryRepo.findById("1").get();
		System.out.println("How many products present: " + fetchCategory.getBiProducts().size());

		BiCategory fetchCategory1 = categoryRepo.findById("2").get();
		System.out.println("How many products present: " + fetchCategory1.getBiProducts().size());

		BiProduct fetchProduct = productRepo.findById("1").get();
		System.out.println("How many categories present: " + fetchProduct.getBiCategories().size());

	}
}
