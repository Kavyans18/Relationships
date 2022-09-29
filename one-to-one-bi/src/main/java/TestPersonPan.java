import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPersonPan {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		System.out.println(entityManagerFactory);
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = entityManager.find(Person.class,2);
		if(person !=null) {
		System.out.println("=============PERSON DETAILS==================");
		System.out.println("ID is : "+person.getId());
		System.out.println("Name : "+ person.getName());
		System.out.println("Gender : "+ person.getGender());
		
		Pan pan = person.getPan();
		System.out.println("==============PAN DETAILS==================");
		System.out.println("Pan Id : "+pan.getId());
		System.out.println("Pan number : "+pan.getNumber());
		System.out.println("Pan  type: " +pan.getType());
		}
		else {
			System.out.println("Id not available");
		}
		
	}

}
