import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCompanyGST {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	System.out.println(entityManagerFactory);
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	//Company company = entityManager.find(Company.class,1);
	GST gst = entityManager.find(GST.class,1);
	Company company = gst.getCompany();
	if(gst != null) {
		System.out.println("================COMPANY DETAILS===================");
		System.out.println("ID of company:" +company.getId());
		System.out.println("Name of the company: "+company.getName());
		System.out.println("Address: "+company.getAddress());
		
		
		//GST gst = new GST();
		System.out.println("==================GST DETAILS====================");
		System.out.println("ID of the company : "+gst.getId());
		System.out.println("Number : "+ gst.getNumber());
		System.out.println("status: "+ gst.getStatus());
	}
	else {
		System.out.println("ID not available");
	}
}
}
