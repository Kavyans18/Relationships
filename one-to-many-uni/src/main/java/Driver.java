import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.setName("Nokia");
		mobile.setCost(6000);
		
		Mobile mobile2 = new Mobile();
		mobile2.setName("Iphone");
		mobile2.setCost(69999);
		
		Sim sim1 = new Sim();
		sim1.setName("Airtel sim");
		sim1.setProvider("Airtel");
		
		Sim sim2 = new Sim();
		sim2.setName("BSNL sim");
		sim2.setProvider("BSNL");
		
		List<Sim> sims = new ArrayList<Sim>();
		sims.add(sim1);
		sims.add(sim2);
		
		mobile.setSim(sims);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(mobile2);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityTransaction.commit();
	}
}
