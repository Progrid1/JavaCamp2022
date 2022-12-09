package kodlamaioDay3Homework3.dataAccess;

import kodlamaioDay3Homework3.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile eklendi: "+course.getName());
		
	}

}
