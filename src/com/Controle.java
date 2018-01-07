/**
 * 
 */
package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Bruno
 *
 */
public class Controle {
	
	/***
	 * Padrao singleton aplicado a classe
	 * EntityManager sera protected
	 * 
	 */
	private static Controle instance;
	protected EntityManager entityManager;
	
	public static Controle getInstance() {
		if (instance == null) {
			instance = new Controle();
		}
		return instance;
	}
	
	private Controle() {
		entityManager = getEntityManager();
	}
	
	private EntityManager getEntityManager(){
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("LivrosCRUD");
		if(entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
		
	}
	
	
}
