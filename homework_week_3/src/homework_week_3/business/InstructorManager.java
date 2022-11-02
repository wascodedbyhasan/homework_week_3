package homework_week_3.business;

import homework_week_3.core.logging.InstructorLogger;
import homework_week_3.dataAccess.InstructorDao;
import homework_week_3.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private InstructorLogger[] instructorLoggers;
	
	public InstructorManager(InstructorDao instructorDao, InstructorLogger[] instructorLoggers) {
		this.instructorDao = instructorDao;
		this.instructorLoggers = instructorLoggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (InstructorLogger instructorLogger : instructorLoggers) {
			instructorLogger.log(instructor);
		}
	}
	
	public void delete(Instructor instructor) {
		instructorDao.delete(instructor);
	}
	
	public void getAllInstructorList() {
		instructorDao.getAllCategoryList();
	}

}
