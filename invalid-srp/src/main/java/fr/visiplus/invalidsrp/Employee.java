package fr.visiplus.invalidsrp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Employee {
	
	
	public static Logger logger = LoggerFactory.getLogger(Employee.class);
	
	private int daysPerWeek = 5;
	
	private int hoursPerDay = 7;
	
	private int workedHoursPerDay = 8;

	public int getDaysPerWeek() {
		return daysPerWeek;
	}

	public void setDaysPerWeek(int daysPerWeek) {
		this.daysPerWeek = daysPerWeek;
	}

	public int getHoursPerDay() {
		return hoursPerDay;
	}

	public void setHoursPerDay(int hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}
	
	private int calculateHoursPerWeek() {
		return daysPerWeek * workedHoursPerDay;
	}
	
	public int provideToEmployeeHoursPerWeek() {
		return calculateHoursPerWeek();
	}
	
	
	public int provideToHRHoursPerWeek() {
		return calculateHoursPerWeek()
;	}

}
