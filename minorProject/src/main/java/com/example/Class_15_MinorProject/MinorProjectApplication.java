package com.example.Class_15_MinorProject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MinorProjectApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(MinorProjectApplication.class);
//	@Autowired
//	AdminDao adminDao;


	public static void main(String[] args) {
		log.info("Here in main");
		SpringApplication.run(MinorProjectApplication.class, args);
		log.info("Here after run");
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Here while run");
//		Admin admin = Admin.builder()
//				.name("Manish")
//				.email("manish1@gmail.com")
//				.build();
//
//		adminDao.save(admin);
	}
}
