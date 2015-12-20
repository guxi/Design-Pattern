package edu.wust.dp.Observer.my;

public interface subject {
	public void regObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
