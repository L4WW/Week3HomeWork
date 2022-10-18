package oopHomeWorkWeek3.dataAccess.jdbc;

import oopHomeWorkWeek3.dataAccess.CategoryDao;
import oopHomeWorkWeek3.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile eklendi: "+category.getName());
	}


}
