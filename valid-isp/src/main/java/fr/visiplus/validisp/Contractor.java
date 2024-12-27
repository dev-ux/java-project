package fr.visiplus.validisp;

public class Contractor implements IContractor{
	
	
	
	private String name;
	
	public Contractor(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	
	public String getOriginalCompagny() {
		return "My Compagny";
	}

}
