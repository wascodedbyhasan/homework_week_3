package homework_week_3.dataAccess;

import homework_week_3.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc kullanarak veritabanına eklendi: " + category.getCategoryName() + " " + category.getId());
		CategoryDao.categoryArrayList.add(category);
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Jdbc kullanarak veritabanından silindi: " + category.getCategoryName() + " " + category.getId());
		CategoryDao.categoryArrayList.remove(category);
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Jdbc kullanarak veritabanında güncellendi: " + category.getCategoryName() + " " + category.getId());
		
	}

	@Override
	public void getAllCategoryList() {
		for(int i=0; i<CategoryDao.categoryArrayList.size(); i++) {
			System.out.println(CategoryDao.categoryArrayList.get(i).getCategoryName());
		}
		
	}

}
