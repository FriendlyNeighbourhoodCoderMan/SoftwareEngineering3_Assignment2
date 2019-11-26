package nuigalway.app;

public class Module {

	private String name;
	private int id;
	private String[] students;
	private String[] courseprogrammes;
	
	public Module(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public String[] getCourseProgrammes() {
		return courseprogrammes;
	}
	
	public void setCourseProgrammes(String[] courseprogrammes) {
		this.courseprogrammes = courseprogrammes;
	}
	
	public void setStudents(String[] students) {
		this.students = students;
	}
}
