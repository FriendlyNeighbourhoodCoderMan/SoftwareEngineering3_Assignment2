package nuigalway.app;

import org.joda.time.DateTime;

public class CourseProgramme {

	private String name;

	private String[] students;
	private String[] courses;
	
	private DateTime startDate;
	private DateTime endDate;
	
	public CourseProgramme(String name, DateTime startDate, DateTime endDate) {
		this.name = name;

		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public String getName() {
		return name;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public String[] getCourses() {
		return courses;
	}
	
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	public void setStudents(String[] students) {
		this.students = students;
	}
	
	
	public DateTime getStartDate() {
		return startDate;
	}
	
	public DateTime getEndDate() {
		return endDate;
	}
}
