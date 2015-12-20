package edu.wust.dp.Observer.my;

import java.util.ArrayList;

public class mySubject implements subject {
	//private static final Object o = null;
	private ArrayList<Observer> observers;
	
	public mySubject(){
		observers=new ArrayList<Observer>();
	}
	public void regObserver(Observer o){
		observers.add(o);
	}
	public void removeObserver(Observer o)
	{
		//System.out.println(i);
		int i=observers.indexOf(o);
		System.out.println(i);
		if(i!=-1)
			observers.remove(i);			
	}
	
	public void notifyObservers(){
		for(int i=0;i<observers.size();i++)
		{
			Observer o=(Observer)observers.get(i);
			o.update();
		}
	}
	
	public void imchange(){
		notifyObservers();
	}
	
}
