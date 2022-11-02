package homework_week_3.dataAccess;

import java.util.ArrayList;

import homework_week_3.entities.Course;

public interface CourseDao {
	
	public static ArrayList<Course> courseArrayList = new ArrayList<Course>();
	
	void add(Course course);
	void delete(Course course);
	void update(Course course);
	void getAllCategoryList();
}
