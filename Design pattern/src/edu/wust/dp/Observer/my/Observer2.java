package edu.wust.dp.Observer.my;

public class Observer2 implements Observer {

	public Observer2(subject Sub)
	{
		Sub.regObserver(this);
	}
	public Observer2(){}
	@Override
	public void update() {
		System.out.println("Obs2 get meg");

	}

}