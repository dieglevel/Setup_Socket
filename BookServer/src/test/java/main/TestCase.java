package main;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


import dao.Exam_Dao;
import dao_Implement.Exam_Implement;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestCase {
	private static EntityManagerFactory emf;
	private static Exam_Dao exam;

	@BeforeAll
	 void init() throws Exception {
		this.emf =  Persistence.createEntityManagerFactory("");
		this.exam = new Exam_Implement(emf);
		
	}
	
	@Test
	void test() {

	}

	@AfterAll
	 void teardown() throws Exception {
		emf.close();
	}
	
	

}
