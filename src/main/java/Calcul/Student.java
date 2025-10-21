package Calcul;

public class Student {
	
	public int id;
	public String name;
	public String departement;
	
	public Student(int id, String name, String departement) {
		super();
		this.id = id;
		this.name = name;
		this.departement = departement;
	}
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id "+id+" name "+name + " departement : "+departement;
	}
	
	

}
