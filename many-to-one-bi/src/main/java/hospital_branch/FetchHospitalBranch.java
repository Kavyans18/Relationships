package hospital_branch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchHospitalBranch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Branch branch = entityManager.find(Branch.class,1);
		if (branch != null) {
		System.out.println("====================BRANCH DETAILS======================");
		System.out.println("Branch Id :" +branch.getId());
		System.out.println("Branch location : "+ branch.getLocation());
		System.out.println("Branch City :" +branch.getCity());
		System.out.println("Branch Phone number :" +branch.getPhone());
		
		Hospital hospital = branch.getHospital();
		System.out.println("=======================HOSPITAL DETAILS============================");
		System.out.println("Hospital ID : "+ hospital.getId());
		System.out.println("Hospital name: "+hospital.getName());
		System.out.println("Hospital website: "+hospital.getWebsite());
		}
		else {
			System.out.println("Invalid Id");
		}
	}
}
