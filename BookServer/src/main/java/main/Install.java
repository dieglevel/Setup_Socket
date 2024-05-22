package main;

import dao.Exam_Dao;
import dao_Implement.Exam_Implement;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Install {
	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("SQL_Server");
		Exam_Dao ie = new Exam_Implement(emf);
	}
}
