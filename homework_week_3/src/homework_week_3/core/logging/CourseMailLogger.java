package homework_week_3.core.logging;

import homework_week_3.entities.Course;

public class CourseMailLogger implements CourseLogger {

	@Override
	public void log(Course course) {
		System.out.println(course.getCourseName() + " mail yoluyla başarıyla loglandı.");
		
	}
	

}
