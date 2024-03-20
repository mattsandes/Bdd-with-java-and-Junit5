package br.com.sandes.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.sandes.service.CourseService;

class CourseBusinessMockTest {
	
	CourseService mockService;
	CourseBusiness business;
	
	@BeforeEach
	void setUp() {
		mockService = mock(CourseService.class); //criando um mock da classe CourseService;
		
		business = new CourseBusiness(mockService);
		
	}
	
	@Test
	void TestCourseRelatedToSpring_When_UsingAMock() {
		//When (Act)
		
		List<String> filteredCourses = 
				business.retriveCoursesRelatedToSpring("Leandro");
		
		//Then (Assert)
		assertEquals(4, filteredCourses.size());
	}
}
