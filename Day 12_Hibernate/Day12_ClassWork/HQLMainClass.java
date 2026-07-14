package com.coforge.main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;                    
import com.coforge.model.Employee;

import com.coforge.model.Employee;

public class HQLMainClass {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		/* HQL Select
		Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();
		System.out.println(list);
		*/
		
		/*HQL Static select
		Query query = session.createQuery("from Employee where eid = 101");
		List<Employee> list = query.list();
		System.out.println(list);
		*/
		

		/*HQL Dynamic select
		Query query = session.createQuery("from Employee where eid =: empid");
		query.setParameter("empid", 301);
		List<Employee> list = query.list();
		System.out.println(list);
		*/
		
		/*HQL Specific column select
		Query query = session.createQuery("select ename from Employee");
		List<Employee> list = query.list();
		System.out.println(list);
		*/
		
		/*HQL Update
		Query query = session.createQuery("update Employee set esalary = :salary where eid = :id");
		query.setParameter("salary", 50000);
		query.setParameter("id", 101);
		int result = query.executeUpdate();
		System.out.println(result);
		*/
		
		//HQL Delete
		Query query = session.createQuery("delete from Employee where eid=102");
		int result = query.executeUpdate();
		
		

		transaction.commit();
		session.close();
		factory.close();

	}

}
