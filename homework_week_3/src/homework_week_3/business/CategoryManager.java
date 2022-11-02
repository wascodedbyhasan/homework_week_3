package homework_week_3.business;

import homework_week_3.core.logging.CategoryLogger;
import homework_week_3.dataAccess.CategoryDao;
import homework_week_3.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private CategoryLogger[] categoryLoggers;

	public CategoryManager(CategoryDao categoryDao, CategoryLogger[] categoryLoggers) {
		this.categoryDao = categoryDao;
		this.categoryLoggers = categoryLoggers;
	}
	
	public void add(Category category) throws Exception {
		for(int i=0; i<CategoryDao.categoryArrayList.size(); i++) {
			if(category.getCategoryName().equals(CategoryDao.categoryArrayList.get(i).getCategoryName())) {
				throw new Exception("Kategori adı mevcut.");
			}
		}
		categoryDao.add(category);
		for (CategoryLogger categoryLogger : categoryLoggers) {
			categoryLogger.log(category);
		}
		for (CategoryLogger categoryLogger : categoryLoggers) {
			categoryLogger.log(category);
		}
	}
	
	public void delete(Category category) {
		categoryDao.delete(category);
	}
	
	public void getAllCategoryList() {
		categoryDao.getAllCategoryList();
	}
	
	
}
