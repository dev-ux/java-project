package fr.visiplus.validsrp;

public class EmployeeProvider {
	
	private EmployeeData data;
	
	public EmployeeProvider(EmployeeData data) {
		this.data = data;
	}
	
	public int providerHoursPerWeek() {
		return data.getDaysPerWeek() * data.getHoursPerDay();
	}

}
