package manyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestItemDriver {
public static void main(String[] args) {
	
	FoodOrder foodOrder = new FoodOrder();
	foodOrder.setToName("kalyan");
	foodOrder.setStatus("Processing");
	
	Item item = new Item();
	item.setName("Burger");
	item.setQuantity(2);
	item.setCost(450);
	item.setFoodOrder(foodOrder);

	Item item2 = new Item();
	item2.setName("French Fries");
	item2.setQuantity(3);
	item2.setCost(250);
	item2.setFoodOrder(foodOrder);
	
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	entityTransaction.begin();
	entityManager.persist(foodOrder);
	entityManager.persist(item);
	entityManager.persist(item2);
	entityTransaction.commit();
}
}
