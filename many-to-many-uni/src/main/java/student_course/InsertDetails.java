package student_course;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDetails {
public static void main(String[] args) {
	Student student = new Student();
	student.setName("kalyan");
	student.setEmail("kalyan@123");
	
	Student student2 = new Student();
	student2.setName("Sandeep");
	student2.setEmail("sandeep@456");
	
	Student student3 = new Student();
	student3.setName("Manohar");
	student3.setEmail("Manohar@111");
	
	Student student4 = new Student();
	student4.setName("Sudha");
	student4.setEmail("sudha@1234");

	Course course = new Course();
	course.setName("Math");
	course.setCost(50000);
	
	Course course2 = new Course();
	course2.setName("Science");
	course2.setCost(60000);

			
	List<Course> list = new ArrayList<Course>();
		list.add(course);
		list.add(course2);

	
	
	//student.setCourse(list);
	//student2.setCourse(list);
	  
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
		Course course4 = entityManager.find(Course.class,1);
		List<Course> cour = new ArrayList<Course>();
		cour.add(course4);
		student4.setCourse(cour);
		
	entityTransaction.begin();
	//entityManager.persist(student);
	//entityManager.persist(course);
	//entityManager.persist(course2);
	//entityManager.persist(student2);
	entityManager.persist(student4);
	entityTransaction.commit();
}
}
