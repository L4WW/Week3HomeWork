package oopHomeWorkWeek3.business;

import java.util.ArrayList;
import java.util.List;

import oopHomeWorkWeek3.dataAccess.CourseDao;
import oopHomeWorkWeek3.entities.Course;
import oopHomeWorkWeek3.logging.Logger;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	public List<Course> courses = new ArrayList<>();
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {

		for (Course _course : courses) {
			if (_course.getName().toLowerCase() == course.getName().toLowerCase()) {
				throw new Exception("Bu kurs daha önce eklenmiş.");

			}
		}
		if (course.getPrice() < 0) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz.");
		}

		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

}
