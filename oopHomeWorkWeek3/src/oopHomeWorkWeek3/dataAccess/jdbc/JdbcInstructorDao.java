package oopHomeWorkWeek3.dataAccess.jdbc;

import oopHomeWorkWeek3.dataAccess.InstructorDao;
import oopHomeWorkWeek3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile eklendi: "+instructor.getName());
	}

}
