package nuigalway.app;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.junit.Test;

public class Module_UnitTest { 
	
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
	
	@Test
	public void module_test_set_get_Students_method() {
		String[] students = {John.getName(), Stephan.getName()};
		
		DataSystems.setCourseProgrammes(students);
		String[] studentsConstant = {"John", "Stephan"};
		assertArrayEquals(DataSystems.getCourseProgrammes(), studentsConstant);
	}
	
	@Test
	public void module_test_set_getCourseProgrammes_method() {
		String[] courses = {ElectronicEngineering.getName(), BiomedicalEngineering.getName()};
		
		DataSystems.setCourseProgrammes(courses);
		String[] coursesConstant = {"ElectronicEngineering", "BiomedicalEngineering"};
		assertArrayEquals(DataSystems.getCourseProgrammes(), coursesConstant);
	}
	
	@Test
	public void module_test_getName_method() {
		assertEquals(DataSystems.getName(), "DataSystems");
	}
	
	@Test
	public void module_test_getId_method() {
		assertEquals(DSP.getId(), 100);
	}
}
