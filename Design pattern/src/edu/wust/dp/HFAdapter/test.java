package edu.wust.dp.HFAdapter;

public class test {
static void testduck(Duck duck){
	duck.quack();
	duck.fly();
}
public static void main(String[] str){
	wildTurkey turkey=new  wildTurkey();
	TurkeyAdapter turkeyAdapter=new TurkeyAdapter(turkey);
	testduck(turkeyAdapter);
}
}
