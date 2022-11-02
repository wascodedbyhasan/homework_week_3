package homework_week_3.dataAccess;

import java.util.ArrayList;

import homework_week_3.entities.Instructor;

public interface InstructorDao {
	
	public static ArrayList<Instructor> instructorArrayList = new ArrayList<Instructor>();
	
	void add(Instructor instructor);
	void delete(Instructor instructor);
	void update(Instructor instructor);
	void getAllCategoryList();
}
