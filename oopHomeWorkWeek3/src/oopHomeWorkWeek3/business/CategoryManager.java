package oopHomeWorkWeek3.business;


import java.util.ArrayList;
import java.util.List;

import oopHomeWorkWeek3.dataAccess.CategoryDao;
import oopHomeWorkWeek3.entities.Category;
import oopHomeWorkWeek3.logging.Logger;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	public List<Category> categories = new ArrayList<>();
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		for (Category _category : categories) {
			
			if (_category.getName().toLowerCase() == category.getName().toLowerCase()) {
				throw new Exception("Bu kategori daha önce eklenmiş.");
			}
		} 
		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
	

}
