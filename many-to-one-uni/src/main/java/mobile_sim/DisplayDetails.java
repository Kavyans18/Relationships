package mobile_sim;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DisplayDetails {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Sim sim = entityManager.find(Sim.class, 2);
		if (sim != null) {

			System.out.println("===========SIM DETAILS===============");
			System.out.println("Sim id: " + sim.getId());
			System.out.println("Sim name: " + sim.getName());
			System.out.println("Sim provider name: " + sim.getProvider());

			Mobile mobile = sim.getMobile();
			System.out.println("===============MOBILE DETAILS=================");
			System.out.println("Mobile id: " + mobile.getId());
			System.out.println("Mobile name: " + mobile.getName());
			System.out.println("Mobile cost: " + mobile.getCost());
		} else {
			System.out.println("ID not available");
		}

	}
}
