package nuigalway.app;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.junit.Test;

public class Student_UnitTest {

	ArrayList<Module> electronicEngModules = new ArrayList<Module>();
	ArrayList<Module> biomedicalEngModules = new ArrayList<Module>();
	
	Student John = new Student("John", 18, "Electronic Engineering", electronicEngModules, 16431034);
	Student Stephan = new Student("Stephan", 20, "Biomedical Engineering", biomedicalEngModules, 18431734);
	Student Mary = new Student("Mary", 19, "Biomedical Engineering", biomedicalEngModules, 15431134);
	Student Aoife = new Student("Aoife", 20, "Electronic Engineering", electronicEngModules, 17433034);
	
	CourseProgramme ElectronicEngineering = new CourseProgramme("ElectronicEngineering", new DateTime(2019, 8, 1, 0, 0, 0, 0), new DateTime(2020, 4, 22, 0, 0, 0, 0));
	CourseProgramme BiomedicalEngineering = new CourseProgramme("BiomedicalEngineering", new DateTime(2019, 8, 2, 0, 0, 0, 0), new DateTime(2020, 4, 23, 0, 0, 0, 0));
	
	Module DataSystems = new Module("DataSystems", 197);
	Module HumanStuff = new Module("HumanStuff", 140);
	
	Module DSP = new Module("DSP", 100);
	Module CellBiology = new Module("Cell Biology", 14);
	
	public void populateArrays() {
		electronicEngModules.add(DataSystems);
		electronicEngModules.add(DSP);
		
		biomedicalEngModules.add(CellBiology);
		biomedicalEngModules.add(HumanStuff);
	}
	
	@Test
	public void student_test_getName_method() {
		assertEquals(John.getName(), "John");
	}

	@Test
	public void student_test_getAge_method() {
		assertEquals(Stephan.getAge(), 20);
	}
	
	@Test
	public void student_test_getCourse_method() {
		assertEquals(Mary.getCourse(), "Biomedical Engineering");
	}
	
	@Test
	public void student_test_getID_method() {
		assertEquals(Aoife.getID(), 17433034);
	}
	
	@Test
	public void student_test_getModules_method() {
		populateArrays();
		ArrayList<Module> johnModules = new ArrayList<Module>();
		johnModules.add(DataSystems);
		johnModules.add(DSP);
		
		assertEquals(John.getModules(), johnModules);
	}
	
	@Test
	public void student_test_getUsername_method() {
		assertEquals(Aoife.getUsername(), "Aoife" + 20);
	}
}
