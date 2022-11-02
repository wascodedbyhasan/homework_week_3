package homework_week_3.business;

import homework_week_3.core.logging.CourseLogger;
import homework_week_3.dataAccess.CourseDao;
import homework_week_3.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private CourseLogger[] courseLoggers;
	
	public CourseManager(CourseDao courseDao, CourseLogger[] courseLoggers) {
		this.courseDao = courseDao;
		this.courseLoggers = courseLoggers;
	}
	
	public void add(Course course) throws Exception {
		if(course.getPrice() < 0) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz.");
		}
		for(int i=0; i<CourseDao.courseArrayList.size(); i++) {
			if(course.getCourseName() == CourseDao.courseArrayList.get(i).getCourseName()) {
				throw new Exception("Kurs ismi tekrar edemez.");
			}
		}
		for (CourseLogger courseLogger : courseLoggers) {
			courseLogger.log(course);
		}
	}
	
	public void delete(Course course) {
		courseDao.delete(course);
	}
	
	public void getAllCourseList() {
		courseDao.getAllCategoryList();
	}
}
