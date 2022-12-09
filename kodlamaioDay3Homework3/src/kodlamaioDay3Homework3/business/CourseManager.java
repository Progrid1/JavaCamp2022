package kodlamaioDay3Homework3.business;

import java.util.List;

import kodlamaioDay3Homework3.core.Logger;
import kodlamaioDay3Homework3.core.Validators;
import kodlamaioDay3Homework3.dataAccess.CourseDao;
import kodlamaioDay3Homework3.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers=loggers;
		
	}

	public void add(List<Course> courses, Course course) throws Exception {

		if (Validators.isCourseNameExist(courses, course) && Validators.isPriceValid(course)
				&& Validators.isCategoryNameExist(courses, course)) {
			courses.add(course);
			courseDao.add(course);
			for (Logger logger:loggers) {
				logger.log();
			}
		}

	}
}
