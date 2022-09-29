import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMobileSim {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Mobile mobile = entityManager.find(Mobile.class, 1);
	if(mobile != null) {
	System.out.println("====================MOBILE DETAILS=======================");
	System.out.println("Mobile ID : "+mobile.getId());
	System.out.println("Mobile Name : "+mobile.getName());
	System.out.println("Mobile Cost: " +mobile.getCost());
	
	List<Sim> sims = mobile.getSim();
	for(Sim s : sims) {
	System.out.println("=======================SIM DETAILS==========================");
	System.out.println("Sim ID : " +s.getId());
	System.out.println("Sim Name : "+ s.getName());
	System.out.println("Sim Provider: " +s.getProvider());
	}
	}
	
	else {
		System.out.println("Enter valid ID");
	}
	}
}
