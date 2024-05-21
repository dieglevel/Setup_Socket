package dao_Implement;

import jakarta.persistence.EntityManagerFactory;

public class Exam_Implement implements dao.Exam_Dao {
	private EntityManagerFactory entityManagerFactory;
	
	public Exam_Implement(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
	
	
}
