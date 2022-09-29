package mobile_sim;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDetails {
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		mobile.setName("Nokia");
		mobile.setCost(12000);
		
		Sim sim1 = new Sim();
		sim1.setName("Airtel sim");
		sim1.setProvider("Airtel");
		sim1.setMobile(mobile);
		
		Sim sim2 = new Sim();
		sim2.setName("Jio");
		sim2.setProvider("Reliance");
		sim2.setMobile(mobile);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityTransaction.commit();
	}
}
