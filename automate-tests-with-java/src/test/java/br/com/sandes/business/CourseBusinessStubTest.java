package br.com.sandes.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.sandes.service.CourseService;
import br.com.sandes.service.stubs.CourseServiceStub;

class CourseBusinessStubTest {

	@Test
	void TestCourseRelatedToSpring_When_UsingAStub() {
		//Given (Arrange)
		
		CourseService stubService = new CourseServiceStub();
		
		CourseBusiness business = new CourseBusiness(stubService);
		
		//When (Act)
		
		List<String> filteredCourses = 
				business.retriveCoursesRelatedToSpring("Leandro");
		
		//Then (Assert)
		assertEquals(4, filteredCourses.size());
	}
	
	@Test
	void TestCourseRelatedToSpring_When_UsingFooBarStudent() {
		//Given (Arrange)
		
		CourseService stubService = new CourseServiceStub();
		
		CourseBusiness business = new CourseBusiness(stubService);
		//When (Act)
		
		List<String> filteredCourses = 
				business.retriveCoursesRelatedToSpring("Foo Bar");
		
		//Then (Assert)
		assertEquals(0, filteredCourses.size());
	}

}
