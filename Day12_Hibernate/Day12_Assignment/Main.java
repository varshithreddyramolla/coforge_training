package com.coforge.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.coforge.model.Course;
import com.coforge.model.Student;

public class Main {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		/*Insert
		
		Student s1 = new Student();
		s1.setSid(101);
		s1.setSname("Varshith");

		Student s2 = new Student();
		s2.setSid(102);
		s2.setSname("Rahul");

		Course c1 = new Course();
		c1.setCid(1);
		c1.setCname("Java");

		Course c2 = new Course();
		c2.setCid(2);
		c2.setCname("Hibernate");

		s1.getCourses().add(c1);
		s1.getCourses().add(c2);

		s2.getCourses().add(c1);

		session.save(s1);
		session.save(s2);

		System.out.println("Data Inserted Successfully");
		*/

		/*HQL SELECT

		Query query = session.createQuery("from Student");
		List<Student> list = query.list();
		System.out.println(list);
        */

		/*HQL STATIC SELECT

		Query query = session.createQuery("from Student where s_id=101");
		List<Student> list = query.list();
		System.out.println(list);
		*/

		/*HQL DYNAMIC SELECT 

		Query query = session.createQuery("from Student where s_id=:id");
		query.setParameter("id", 101);

		List<Student> list = query.list();
		System.out.println(list);
		*/

		/*HQL SPECIFIC COLUMN

		Query query = session.createQuery("select s_name from Student");
		List<String> list = query.list();
		System.out.println(list);
		*/

		/*HQL UPDATE

		Query query = session.createQuery(
				"update Student set s_name=:name where s_id=:id");

		query.setParameter("name", "Rohit");
		query.setParameter("id", 101);

		int result = query.executeUpdate();

		System.out.println(result + " Row Updated");
		*/

		/*HQL DELETE

		Query query = session.createQuery(
				"delete from Student where s_id=102");

		int result = query.executeUpdate();

		System.out.println(result + " Row Deleted");
		*/

		transaction.commit();

		session.close();
		factory.close();

		System.out.println("Completed");
	}
}