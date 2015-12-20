package edu.wust.dp.HFCommand;

public class light {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
	public light(String s){
		setName(s);		
	}
	public void on() {
		System.out.println(getName()+" light on!");
	}

	public void off() {
		System.out.println(getName()+" light off!");
	}
}
