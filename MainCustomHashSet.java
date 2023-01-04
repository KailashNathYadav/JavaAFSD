package dataStructure.hashSet;
import java.util.*;

class Student{
	private int rollNo;
	private String name;
	
	public Student() {}
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class MainCustomHashSet {

	public static void main(String[] args) {
		Set<Student> batch = new HashSet<>();
		batch.add(new Student(10,"Kailash"));
		batch.add(new Student(20,"Satyam"));
		Iterator<Student> it = batch.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
