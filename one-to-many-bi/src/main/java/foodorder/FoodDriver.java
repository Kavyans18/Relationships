package foodorder;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FoodDriver {
	public static void main(String[] args) {
		FoodOrder food = new FoodOrder();
		food.setToName("Sandeep");
		food.setStatus("Processing");
		
		Item item = new Item();
		item.setName("Pizza");
		item.setQuantity(5);
		item.setCost(5000);
		
		Item item2 = new Item();
		item2.setName("Pepsi");
		item2.setQuantity(3);
		item2.setCost(2500);
		
		List<Item> list1 = new ArrayList<Item>();
		list1.add(item);
		list1.add(item2);
		food.setItem(list1);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		 
		entityTransaction.begin();
		entityManager.persist(food);
		entityManager.persist(item);
		entityManager.persist(item2);
		entityTransaction.commit();
		
	}
}
