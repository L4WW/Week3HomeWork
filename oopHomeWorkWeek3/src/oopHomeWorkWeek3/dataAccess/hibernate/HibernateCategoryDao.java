package oopHomeWorkWeek3.dataAccess.hibernate;

import oopHomeWorkWeek3.dataAccess.CategoryDao;
import oopHomeWorkWeek3.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile eklendi: "+ category.getName());
	}

}
