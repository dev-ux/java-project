package fr.visiplus.validisp;

public class Director implements Person, IDirector{
	
	private String name;
	
	
	public Director(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getCA() {
		return 1000000;
	}

}
