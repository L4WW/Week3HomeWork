package oopHomeWorkWeek3.dataAccess.hibernate;

import oopHomeWorkWeek3.dataAccess.InstructorDao;
import oopHomeWorkWeek3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile eklendi: "+ instructor.getName());
		
	}

}
