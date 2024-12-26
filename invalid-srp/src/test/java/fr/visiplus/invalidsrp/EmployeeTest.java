package fr.visiplus.invalidsrp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EmployeeTest {
	
	@Test
	public void testProvideToEmployeeHoursPerWeek() {
		int expected = 35;
		Employee employee = new Employee();
		int result = employee.provideToEmployeeHoursPerWeek();
		
		assertEquals(expected, result);
		
	}

}
