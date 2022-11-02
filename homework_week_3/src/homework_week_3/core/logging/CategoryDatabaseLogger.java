package homework_week_3.core.logging;

import homework_week_3.entities.Category;

public class CategoryDatabaseLogger implements CategoryLogger {

	@Override
	public void log(Category category) {
		System.out.println(category.getCategoryName() + " veritabanına başarıyla loglandı.");
		
	}
	
}
