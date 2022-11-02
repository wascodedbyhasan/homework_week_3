package homework_week_3.core.logging;

import homework_week_3.entities.Instructor;

public class InstructorMailLogger implements InstructorLogger {

	@Override
	public void log(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " mail yoluyla başarıyla loglandı.");
		
	}

}
