package Manage_Student;

import java.util.ArrayList;
import java.util.Comparator;

public class Manage_Student implements Comparator<Manage_Student>{
	String id;
	String name;
	String semester;
	String coursename;//java, .net, c/c++
	
	
	public Manage_Student(String id, String name, String semester, String coursename) {
		super();
		this.id = id;
		this.name = name;
		this.semester = semester;
		this.coursename = coursename;
	}
	
	
	public Manage_Student() {
		super();
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "ID: " + this.id +
				"\tNAME: " + this.name +
				"\tSEMESTER: " + this.semester +
				"\tCOURSENAME: " + this.coursename +"\n";
	}


	@Override
	public int compare(Manage_Student o1, Manage_Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}



		
}
class sortByName implements Comparator<Manage_Student>{

	@Override
	public int compare(Manage_Student o1, Manage_Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
	
}