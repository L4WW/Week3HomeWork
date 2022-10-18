package oopHomeWorkWeek3.dataAccess.hibernate;

import oopHomeWorkWeek3.dataAccess.CourseDao;
import oopHomeWorkWeek3.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile eklendi: "+ course.getName());
		
	}

}
