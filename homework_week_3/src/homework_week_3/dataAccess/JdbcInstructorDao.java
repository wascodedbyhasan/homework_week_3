package homework_week_3.dataAccess;

import homework_week_3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc kullanarak veritabanına eklendi: " + instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getAge() + " " + instructor.getPhoto());
		InstructorDao.instructorArrayList.add(instructor);
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Jdbc kullanarak veritabanına eklendi: " + instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getAge() + " " + instructor.getPhoto());
		InstructorDao.instructorArrayList.remove(instructor);
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Jdbc kullanarak veritabanında güncellendi: " + instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getAge() + " " + instructor.getPhoto());
		
	}

	@Override
	public void getAllCategoryList() {
		for(int i=0; i<InstructorDao.instructorArrayList.size(); i++) {
			System.out.println(InstructorDao.instructorArrayList.get(i).getFirstName() + " " + InstructorDao.instructorArrayList.get(i).getLastName() + " " + InstructorDao.instructorArrayList.get(i).getAge() + " " + InstructorDao.instructorArrayList.get(i).getPhoto());
		}
		
	}

}
