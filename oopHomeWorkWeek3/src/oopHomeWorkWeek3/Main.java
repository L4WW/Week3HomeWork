package oopHomeWorkWeek3;

import oopHomeWorkWeek3.business.CategoryManager;
import oopHomeWorkWeek3.business.CourseManager;
import oopHomeWorkWeek3.business.InstructorManager;
import oopHomeWorkWeek3.dataAccess.hibernate.HibernateCategoryDao;
import oopHomeWorkWeek3.dataAccess.hibernate.HibernateCourseDao;
import oopHomeWorkWeek3.dataAccess.hibernate.HibernateInstructorDao;
import oopHomeWorkWeek3.dataAccess.jdbc.JdbcCategoryDao;
import oopHomeWorkWeek3.dataAccess.jdbc.JdbcCourseDao;
import oopHomeWorkWeek3.dataAccess.jdbc.JdbcInstructorDao;
import oopHomeWorkWeek3.entities.Category;
import oopHomeWorkWeek3.entities.Course;
import oopHomeWorkWeek3.entities.Instructor;
import oopHomeWorkWeek3.logging.DataBaseLogger;
import oopHomeWorkWeek3.logging.FileLogger;
import oopHomeWorkWeek3.logging.Logger;
import oopHomeWorkWeek3.logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new DataBaseLogger(),new FileLogger(),new MailLogger()};
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Yapay Zeka");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		CategoryManager categoryManager2 = new CategoryManager(new JdbcCategoryDao(),loggers);
		categoryManager.add(category1);
		categoryManager2.add(category2);
		
		Instructor instructor = new Instructor(1,"Engin Demiroğ");
		Instructor instructor2 = new Instructor(2,"Sedat");
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		InstructorManager instructorManager2 = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor);
		instructorManager2.add(instructor2);
		
		
		
		
		
		Course course1 = new Course(1,"Java Programlama","Açıklama",instructor.getName(),"course.jpg",100);
		Course course2 = new Course(2, "C# Programlama","Açıklama",instructor2.getName(),"course2.jpg", 150);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		CourseManager courseManager2 = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course1);
		courseManager2.add(course2);
		
	}

}
