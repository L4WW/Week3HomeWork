package oopHomeWorkWeek3.dataAccess.jdbc;

import oopHomeWorkWeek3.dataAccess.CourseDao;
import oopHomeWorkWeek3.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile eklendi: "+course.getName());
	}

}
