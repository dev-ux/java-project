package fr.visiplus.validsrp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HRProviderTest {
	
	@Test
	public void testProvideHoursPerWeek() {
		int expected = 40;
		EmployeeData data = new EmployeeData();
		HRProvider provider = new HRProvider(data);
		
		int result = provider.provideHoursPerWeek();
		
		assertEquals(expected, result);
	}

}
