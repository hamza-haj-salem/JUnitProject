package Calcul;

import java.util.ArrayList;
import java.util.List;

import java.util.AbstractMap;
public class StudentService {
	
	private List<Student> students = new ArrayList<Student>();
	
	public List<Student> getStudents(){
		return this.students;
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public Student getStudentByID(int studentId) {
		return students.stream()
				.filter((std)-> std.getId() == studentId)
				.findFirst()
				.orElse(null);
		
				
	}
	
	public Student getStudentByName(String name) {
		return students.stream()
				.filter((std)-> std.getName().equals(name))
				.findFirst()
				.orElseThrow(()->new StudentNotFoundException("Student Not"
						+ " found with name : "+ name));
	}
	
	
	public List<Student> getAllStuden(){
		return students;
	}

}
