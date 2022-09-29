package teacher_student;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDetails {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setName("Kalyan");
		teacher.setGender("Male");
		
		Teacher teacher2 = new Teacher();
		teacher2.setName("Sudha");
		teacher2.setGender("Female");
		
		Subject subject = new Subject();
		subject.setName("Maths");
		subject.setDays("Monday");
		
		Subject subject2 = new Subject();
		subject2.setName("Science");
		subject2.setDays("Tuesday");
		
		List<Subject> list = new ArrayList<Subject>();
		list.add(subject);
		list.add(subject2);
		
		
		teacher.setSubject(list);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Subject sub = entityManager.find(Subject.class,1);
		List<Subject> list2 = new ArrayList<Subject>();
		list2.add(sub);
		teacher2.setSubject(list2);
		
		entityTransaction.begin();
		entityManager.persist(teacher2);
		//entityManager.persist(subject);
		//entityManager.persist(subject2);
		entityTransaction.commit();
	}
}
