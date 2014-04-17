package edu.fousac.crm_clinicas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import edu.fousac.crm_clinicas.dto.UserDetails;

public class HibernateTest {
	
	
	public HibernateTest(){
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUsername("First User");
		

		Configuration configuration = new Configuration().configure(); 
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder(). applySettings(configuration.getProperties()); 
		SessionFactory factory = configuration.buildSessionFactory(builder.build()); 
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();

		
	}

}
