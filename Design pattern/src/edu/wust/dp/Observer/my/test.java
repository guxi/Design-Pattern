package edu.wust.dp.Observer.my;

public class test {
	public static void main(String[] arg){
	mySubject ms=new mySubject();
	//// ¹Û²ìÕß¶Ë×¢²á
	Observer1 obs1=new Observer1(ms);
	Observer2 obs2=new Observer2(ms);
	
	//////  Ö÷Ìâ¶Ë×¢²á    ///////////
	//ms.regObserver(obs1);
	//ms.regObserver(obs2);
	
	ms.imchange();
	
	ms.removeObserver(obs2);
	
	ms.imchange();
	}
}
