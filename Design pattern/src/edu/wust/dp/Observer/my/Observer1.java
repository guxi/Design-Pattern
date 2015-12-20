package edu.wust.dp.Observer.my;

public class Observer1 implements Observer {
	
	
	public Observer1(subject Sub)
	{
		Sub.regObserver(this);
	}
	public Observer1(){}
	@Override
	public void update() {
		System.out.println("Obs1 get meg");

	}

}
