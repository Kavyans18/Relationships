package manyToOne;

import java.lang.management.ManagementFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ItemDisplay {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas"); 
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Item item = entityManager.find(Item.class, 1) ;
			System.out.println("====================ITEM DETAILS======================");
			System.out.println("Item id :" +item.getId());
			System.out.println("Item name :" +item.getName());
			System.out.println("Item quantity: "+item.getQuantity());
			System.out.println("Item cost: "+ item.getCost());
			
			FoodOrder foodOrder = item.getFoodOrder();
			System.out.println("==================FOOD ORDER DETAILS==================");
			System.out.println("Food Order ID: "+foodOrder.getId());
			System.out.println("Food Order Name: "+foodOrder.getToName());
			System.out.println("Food Order Status"+foodOrder.getStatus());
		}
		
	}

