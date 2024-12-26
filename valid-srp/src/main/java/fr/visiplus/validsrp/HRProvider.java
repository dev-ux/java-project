package fr.visiplus.validsrp;

public class HRProvider {
	
	private  EmployeeData data;
	
	
	public HRProvider(EmployeeData data) {
		this.data = data;
		
	}
	
	
	public int provideHoursPerWeek() {
		return data.getDaysPerWeek() * data.getWorkedHoursPerDay();
	}

}
