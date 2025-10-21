package Assertions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import Calcul.Student;
import Calcul.StudentNotFoundException;
import Calcul.StudentService;

class StudentServiceTest {
	
	//############################################################################
	//############################################################################
	//##############################  assertTrue  ###############################
	

	@Test
	public void getStudentsTest() {
		
		StudentService studentService = new StudentService();
		List<Student> listOfStudents = studentService.getStudents();
		Student s = new Student(1, "Hamza");
		listOfStudents.add(s);
		boolean actualResult = listOfStudents.isEmpty();
		
		//assertTrue(actualResult);
		
		//assertTrue(()-> actualResult);
		
		//assertTrue(actualResult, "List of Student Must be Empty !");
		
		//assertTrue(()-> actualResult, "List of Student Must be Empty !");
		
		//assertTrue(actualResult,()-> "List of Student Must be Empty !");
		
		//assertTrue(()-> actualResult,()-> "List of Student Must be Empty !");
		
	}
	
	//############################################################################
	//############################################################################
	//##############################  assertFalse  ###############################
	
	@Test
	public void getStudentsTestUsingAssertFalse() {
		
		StudentService studentService = new StudentService();
		List<Student> listOfStudents = studentService.getStudents();
		Student s = new Student(1, "Hamza");
		listOfStudents.add(s);
		boolean actualResult = listOfStudents.isEmpty();
		
		//assertFalse(actualResult);
		
		//assertFalse(()-> actualResult);
		
		//assertFalse(actualResult, "List of Student Must NOT be Empty !");
		
		//assertFalse(()-> actualResult, "List of Student Must NOT be Empty !");
		
		//assertFalse(actualResult,()-> "List of Student Must NOT be Empty !");
		
		//assertFalse(()-> actualResult,()-> "List of Student Must NOT be Empty !");
		
	}
	
	//############################################################################
	//############################################################################
	//##############################  assertNull  ###############################
	
	@Test
	public void getStudentByIdTestUsingAssertNull() {
		
		StudentService studentService = new StudentService();
		Student s = new Student(1, "Hamza");
		studentService.addStudent(s);
		
		Student actualObject = studentService.getStudentByID(1);
		
		//System.out.println(studentService.getAllStuden());
		
		//assertNull(actualObject);
		
		//assertNull(actualObject, "Student Obj Must Be Null");
		
		//assertNull(actualObject, ()->"Student Obj Must Be Null");
		
	}
	
	//############################################################################
	//############################################################################
	//##############################  assertNotNull  #############################
	
	@Test
	public void getStudentByIdTestUsingAssertNotNull() {
		
		StudentService studentService = new StudentService();
		Student s = new Student(1, "Hamza");
		studentService.addStudent(s);
		
		Student actualObject = studentService.getStudentByID(2);
		
		//assertNotNull(actualObject);
		
		//assertNotNull(actualObject, "Student Obj Must Be NOT Null");
		
		//assertNotNull(actualObject, ()->"Student Obj Must Be NOT Null");
		
	}
	
	//############################################################################
	//############################################################################
	//##############################  assertEquals  #############################
		
		@Test
		public void getStudentByIdTestUsingAssertEquals() {
			StudentService studentService = new StudentService();
			Student s = new Student(1, "Hamza");
			studentService.addStudent(s);
			
			Student actualObject = studentService.getStudentByID(1);
			
			//assertEquals(1, actualObject.getId());
			
			//assertEquals("Hamza", actualObject.getName());
			
			//assertEquals(s, actualObject);
			
			//assertEquals(1, actualObject.getId(), "Student Id is NOT Equals");
			
			//assertEquals("Hamza", actualObject.getName()), "Student Name is NOT Equals");
			
		}
		
		//############################################################################
		//############################################################################
		//##############################  assertNotEquals  #############################
			
			@Test
			public void getStudentByIdTestUsingAssertNotEquals() {
				StudentService studentService = new StudentService();
				Student s = new Student(1, "Hamza");
				studentService.addStudent(s);
				
				Student actualObject = studentService.getStudentByID(1);
				
				//assertNotEquals(1, actualObject.getId());
				
				//assertNotEquals("Hamza", actualObject.getName());
				
				//assertEquals(s, actualObject);
				
				//assertEquals(1, actualObject.getId(), "Student Id is Equals");
				
				//assertEquals("Hamza", actualObject.getName()), "Student Name is Equals");
				
			}
			
			//############################################################################
			//############################################################################
			//##############################  assertThrow #############################
				
				@Test
				public void getStudentByNameTestUsingAssertThrow() {
					StudentService studentService = new StudentService();
					Student s = new Student(1, "Hamza","info");
					studentService.addStudent(s);
					
					//assertThrows(StudentNotFoundException.class, ()-> {studentService.
						//	getStudentByName("Hamzaa");
					//});
					
				//	assertThrows(StudentNotFoundException.class, ()-> {studentService.
					//	getStudentByName("Hamza");
				//},"This student exist. Student must be NOT found to test the exception");
					
					assertThrows(StudentNotFoundException.class, ()-> {studentService.
						getStudentByName("Hamza");
				},()->"This student exist. Student must be NOT found to test the exception");
					
				}
	

}
