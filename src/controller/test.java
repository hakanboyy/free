package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.company;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		company com=new company();
<<<<<<< HEAD
		com.setName("eti");
		System.out.println("asds");
=======
		com.setName("danone");
		System.out.println();
>>>>>>> refs/remotes/origin/master
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(com);
		session.getTransaction().commit();
	}

}
