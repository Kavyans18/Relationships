package BikeCharcy;

import java.awt.event.PaintEvent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Bike bike = entityManager.find(Bike.class,1);
		System.out.println("========BIKE DETAILS==========");
		System.out.println(bike.getId());
		System.out.println(bike.getName());
		System.out.println(bike.getCost());
		
		Charcy charcy = bike.getCharcy();
		System.out.println("===========CHARCY DETAILS==========");
		System.out.println(charcy.getId());
		System.out.println(charcy.getType());
	}
}
