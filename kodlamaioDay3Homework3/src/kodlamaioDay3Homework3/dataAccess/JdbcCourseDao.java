package kodlamaioDay3Homework3.dataAccess;

import kodlamaioDay3Homework3.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile eklendi: "+course.getName());
		
	}

}
