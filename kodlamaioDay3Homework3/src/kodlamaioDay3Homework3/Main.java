package kodlamaioDay3Homework3;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDay3Homework3.business.CourseManager;
import kodlamaioDay3Homework3.core.DatabaseLogger;
import kodlamaioDay3Homework3.core.EmailLogger;
import kodlamaioDay3Homework3.core.FileLogger;
import kodlamaioDay3Homework3.core.Logger;
import kodlamaioDay3Homework3.dataAccess.HibernateCourseDao;
import kodlamaioDay3Homework3.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {

		List<Course> courses = new ArrayList<Course>();

		Course course1 = new Course(1, "Java", 3000, "Back-End Programlama");
		Course course2 = new Course(2, "Java Script", 2500, "Front-End Programlama");

		CourseManager manager = new CourseManager(new HibernateCourseDao(), new Logger[] { new DatabaseLogger(), new FileLogger(), new EmailLogger() });
		manager.add(courses, course1);
		manager.add(courses, course2);

	}

}
