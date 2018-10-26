package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.company;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		company com=new company();
		com.setName("eti");
		System.out.println("asd");
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(com);
		session.getTransaction().commit();
	}

}
