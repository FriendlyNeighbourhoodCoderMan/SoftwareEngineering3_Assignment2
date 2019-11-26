package nuigalway.app;
import java.util.ArrayList;

public class Student {

	private String name;
	private int age;
	private String course;
	private ArrayList<Module> modules;
	private int id;
	
	public Student (String name, int age, String course, ArrayList<Module> modules, int id) {
		this.name = name;
		this.age = age;
		this.course = course;
		this.modules = modules;
		this.id = id;		
	}

	public String getUsername() {
		return name + age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCourse() {
		return course;
	}
	
	public ArrayList<Module> getModules() {
		return modules;
	}
	
	public int getID() {
		return id;
	}
}
