package hospital_branch;

import javax.net.ssl.ManagerFactoryParameters;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDetails {
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.setName("Appolo");
		hospital.setWebsite("www.appolo.com");
		
		Branch branch = new Branch();
		branch.setLocation("Vijaynagar");
		branch.setCity("Bangalore");
		branch.setPhone(4578638l);
		branch.setHospital(hospital);
		
		Branch branch2 = new Branch();
		branch2.setLocation("abcd nagar");
		branch2.setCity("Mumbai");
		branch2.setPhone(767988979l);
		branch2.setHospital(hospital);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch);
		entityManager.persist(branch2);
		entityTransaction.commit();
		
	}
}
