package fr.visiplus.validisp;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	
	public static Logger logger = LoggerFactory.getLogger(Main.class);
	
	
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Employee("Marvin"));
		persons.add(new Director("Junior"));
		persons.add(new Contractor("Kassi"));
		
		for(Person person : persons) {
			logger.info(person.getName());
			
			if(person instanceof Director) {
				IDirector director = (IDirector) person;
				
				int ca = director .getCA();
				logger.info("CA: " + ca);
			}
		}
		
		IContractor contractor = new Contractor("Kassi");
		logger.info(contractor.getOriginalCompagny());
	}
	
	
	

}
