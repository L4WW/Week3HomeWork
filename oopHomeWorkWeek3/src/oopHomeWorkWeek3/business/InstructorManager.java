package oopHomeWorkWeek3.business;

import oopHomeWorkWeek3.dataAccess.InstructorDao;
import oopHomeWorkWeek3.entities.Instructor;
import oopHomeWorkWeek3.logging.Logger;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor){
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}
	

}
