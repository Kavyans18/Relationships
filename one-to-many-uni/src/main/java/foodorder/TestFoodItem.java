package foodorder;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestFoodItem {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
	
		FoodOrder food = entityManager.find(FoodOrder.class,1);
		if (food != null) {
		System.out.println("===================FOOD DELIVERY=======================");
		System.out.println("Food Order ID: "+food.getId());
		System.out.println("Food Orderd To: "+food.getToName());
		System.out.println("Food Order status: "+food.getStatus());
		
		List<Item> list = food.getItem();
		for(Item item : list) {
			System.out.println("=====================ITEM===========================");
			System.out.println(item.getId());
			System.out.println(item.getName());
			System.out.println(item.getQuantity());
			System.out.println(item.getCost());
		}
		}
		
		else {
			System.out.println("Id not found");
		}
		
		
		
	}
}
