package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPersonAdhar {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("shiva");
		person.setAge(22);
		person.setGender("male");
		person.setPhno(7093982712l);
		
		Person person1=new Person();
		person1.setName("vashi");
		person1.setAge(23);
		person1.setGender("male");
		person1.setPhno(7093986712l);
		
		AdharCard adharCard=new AdharCard();
		adharCard.setId(6056);
		adharCard.setAddress("Yemmiganur");
		
		AdharCard adharCard1=new AdharCard();
		adharCard1.setId(9810);
		adharCard1.setAddress("Kurnool");
		
		person.setCard(adharCard);
		person1.setCard(adharCard1);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(person1);
		entityManager.persist(adharCard);
		entityManager.persist(adharCard1);
		entityTransaction.commit();
		
		


	}

}
