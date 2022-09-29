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
	
	Sim sim = entityManager.find(Sim.class, 1);
	if(sim != null) {
		System.out.println("=======================SIM DETAILS==========================");
		System.out.println("Sim ID : " +sim.getId());
		System.out.println("Sim Name : "+ sim.getName());
		System.out.println("Sim Provider: " +sim.getProvider());
	
	List<Mobile> mobile = (List<Mobile>) sim.getMobile();
	for(Mobile mobiles : mobile) {
		System.out.println("====================MOBILE DETAILS=======================");
		System.out.println("Mobile ID : "+mobiles.getId());
		System.out.println("Mobile Name : "+mobiles.getName());
		System.out.println("Mobile Cost: " +mobiles.getCost());
	
	}
	}
	
	else {
		System.out.println("Enter valid ID");
	}
	}
}
