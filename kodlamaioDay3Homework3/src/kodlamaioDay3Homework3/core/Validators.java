package kodlamaioDay3Homework3.core;

import java.util.List;

import kodlamaioDay3Homework3.entities.Course;

public class Validators {

	public static boolean isCourseNameExist(List<Course> courses, Course course) throws Exception {
		for (Course kurs : courses) {
			if (kurs.getName().equals(course.getName())) {
				throw new Exception("Bu isim daha once kullanilmis.");
			}
		}
		return true;

	}

	public static boolean isCategoryNameExist(List<Course> courses, Course course) throws Exception {
		for (Course kurs : courses) {
			if (kurs.getCategoryName().equals(course.getCategoryName())) {
				throw new Exception("Bu kategori ismi daha once kullanilmis.");
			}
		}
		return true;
	}

	public static boolean isPriceValid(Course course) throws Exception {
		if (course.getPrice() <= 0) {
			throw new Exception("Gecersiz fiyat.");

		}
		return true;

	}

}
