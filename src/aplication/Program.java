package aplication;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		
		Funcionario f1 = new Funcionario(null, "Jo�o Chimpa", "chimpa@joao.com");
		
		Funcionario f2 = new Funcionario(null, "Maria Chimpa", "chimpa@maria.com");
		
		Funcionario f3 = new Funcionario(null, "Mario Chimpa", "chimpa@mario.com");
		
		//System.out.println(f1);
		//System.out.println(f2);
		//System.out.println(f3);
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		em.persist(f1);
		em.persist(f2);
		em.persist(f3);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		System.out.println("ok.");
		
	}
	
}
