package homework_week_3.dataAccess;

import homework_week_3.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate kullanarak veritabanına eklendi: " + course.getCourseName() + " " + course.getId());
		CourseDao.courseArrayList.add(course);
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Hibernate kullanarak veritabanından silindi: " + course.getCourseName() + " " + course.getId());
		CourseDao.courseArrayList.remove(course);
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Hibernate kullanarak veritabanında güncellendi: " + course.getCourseName() + " " + course.getId());
		
	}

	@Override
	public void getAllCategoryList() {
		for(int i=0; i<CourseDao.courseArrayList.size(); i++) {
			System.out.println(CourseDao.courseArrayList.get(i).getCourseName());
		}
		
	}
	

}
