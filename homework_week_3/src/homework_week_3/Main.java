package homework_week_3;

import homework_week_3.business.CategoryManager;
import homework_week_3.business.CourseManager;
import homework_week_3.business.InstructorManager;
import homework_week_3.core.logging.CategoryDatabaseLogger;
import homework_week_3.core.logging.CategoryFileLogger;
import homework_week_3.core.logging.CategoryLogger;
import homework_week_3.core.logging.CourseDatabaseLogger;
import homework_week_3.core.logging.CourseLogger;
import homework_week_3.core.logging.InstructorDatabaseLogger;
import homework_week_3.core.logging.InstructorFileLogger;
import homework_week_3.core.logging.InstructorLogger;
import homework_week_3.core.logging.InstructorMailLogger;
import homework_week_3.dataAccess.HibernateCourseDao;
import homework_week_3.dataAccess.HibernateInstructorDao;
import homework_week_3.dataAccess.JdbcCategoryDao;
import homework_week_3.dataAccess.JdbcInstructorDao;
import homework_week_3.entities.Category;
import homework_week_3.entities.Course;
import homework_week_3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Course course1 = new Course(1, "Java Programming", "Engin Demiroğ", 250, "Back-End Software");
		CourseLogger[] loggers = {new CourseDatabaseLogger()};
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		courseManager.getAllCourseList();
		
		System.out.println(" ");
		
		CategoryLogger[] categoryLoggers = {new CategoryDatabaseLogger(), new CategoryFileLogger()};
		Category category1 = new Category(1, "Beck-End Software");
		Category category2 = new Category(2, "Front-End Software");
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), categoryLoggers);
		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.getAllCategoryList();
		
		System.out.println(" ");
		
		InstructorLogger[] instructorLoggers = {new InstructorDatabaseLogger(), new InstructorFileLogger(), new InstructorMailLogger()};
		Instructor instructor = new Instructor(1, 25, "Engin", "Demiroğ", "Photo");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), instructorLoggers);
		instructorManager.add(instructor);
		Instructor instructor2 = new Instructor(2, 31, "Mehmet", "Ali", "Photo");
		InstructorManager instructorManager2 = new InstructorManager(new JdbcInstructorDao(), instructorLoggers);
		instructorManager2.add(instructor2);
		instructorManager.getAllInstructorList();
		
	}

}
