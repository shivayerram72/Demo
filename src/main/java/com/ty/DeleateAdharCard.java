package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleateAdharCard {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		AdharCard adharcard1=entityManager.find(AdharCard.class,6056);
		
		if(adharcard1!=null) {
			entityTransaction.begin();
			entityManager.remove(adharcard1);
			entityTransaction.commit();
			
			
		}
		else {
			System.out.println("data already deleated");
		}
		
		

	}

}
