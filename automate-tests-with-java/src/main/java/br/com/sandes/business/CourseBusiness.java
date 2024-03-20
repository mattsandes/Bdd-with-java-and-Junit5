package br.com.sandes.business;

import java.util.ArrayList;
import java.util.List;

import br.com.sandes.service.CourseService;

public class CourseBusiness {

	private CourseService service;
	
	public CourseBusiness(CourseService service) {
		this.service = service;
	}
	
	public List<String> retriveCoursesRelatedToSpring(String student){
		List<String> filteredCourses = new ArrayList<String>();
		
		if("Foo Bar".equals(student)) {
			return filteredCourses;
		}
		
		List<String> allCourses = service.retriveCourses(student);
		
		for(String course: allCourses) {
			if(course.contains("Spring")) {
				filteredCourses.add(course);
			}
		}
		
		return filteredCourses;
	}
}
