package Assertions;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	public void getStudentsTest() throws SQLException {
		
		  // 1. Connexion H2
        Connection connection = DriverManager.getConnection(
                "jdbc:h2:mem:testdb", "sa", ""
        );

        // 2. Créer table + données (si pas déjà fait)
        Statement stmt = connection.createStatement();

        stmt.execute("CREATE TABLE students (id INT PRIMARY KEY, name VARCHAR(255))");
        stmt.execute("INSERT INTO students VALUES (1, 'Hamza H2')");

        // 3. Test SELECT
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        
        
        System.out.println("données de la db H2 : ");
        
        boolean actualResult = false;
        
		while (rs.next()) {
			 // 4. Vérification
	        actualResult = true;

		    int id = rs.getInt("id");
		    String name = rs.getString("name");
		
		    System.out.println("id = " + id + ", name = " + name);
		}

               
       
        
        System.out.println("actualResult = " + actualResult);

        assertTrue(actualResult, "La table students doit contenir des données !");
		
		//assertTrue(actualResult);
		
		//assertTrue(()-> actualResult);
		
		//assertTrue(actualResult, "List of Student Must be Empty !");
		
		//assertTrue(()-> actualResult, "List of Student Must be Empty !");
		
		//assertTrue(actualResult,()-> "List of Student Must be Empty !");
		
		//assertTrue(()-> actualResult,()-> "List of Student Must be Empty !");
		
	}
	
	//############################################################################
	//###   Juste POUR LE TEST DE COMMIT VERS GIT avec branch 0001    ############
	//##############    assertTrue2  ###############################
			

			@Test
			public void getStudentsTest2() {
				
				StudentService studentService = new StudentService();
				List<Student> listOfStudents = studentService.getStudents();
				Student s = new Student(1, "Hamza");
				//listOfStudents.add(s);
				boolean actualResult = listOfStudents.isEmpty();
				
				//assertTrue(actualResult);
				
				//assertTrue(()-> actualResult);
				
				//assertTrue(actualResult, "List of Student Must be Empty !");
				
				//assertTrue(()-> actualResult, "List of Student Must be Empty !");
				
				//assertTrue(actualResult,()-> "List of Student Must be Empty !");
				
				assertTrue(()-> actualResult,()-> "List of Student Must be Empty !");
				
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
						getStudentByName("Hamzaa");
				},()->"This student exist. Student must be NOT found to test the exception");
					
				}
	

}
