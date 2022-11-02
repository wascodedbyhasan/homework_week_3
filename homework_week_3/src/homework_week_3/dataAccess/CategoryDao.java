package homework_week_3.dataAccess;

import java.util.ArrayList;

import homework_week_3.entities.Category;

public interface CategoryDao {
	
	public static ArrayList<Category> categoryArrayList = new ArrayList<Category>();
	
	void add(Category category);
	void delete(Category category);
	void update(Category category);
	void getAllCategoryList();
}
