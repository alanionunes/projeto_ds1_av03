package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Cliente;

public class Programa {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(null, "Alanio Araujo Nunes", true);
		Cliente c2 = new Cliente(null, "Jade Nunes", false);
		Cliente c3 = new Cliente(null, "Maria Elena Araújo", true);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.getTransaction().commit();
		
		System.out.println("Feito.");
		
		em.close();
		emf.close();
	}
}
