package edu.wust.dp.Adapter;

public class Wrapper implements C_Targetable{

	private C_Source source;  
	       
	   public Wrapper(C_Source source){  
	         super();  
        this.source = source;  
	     }  
	     @Override  
	     public void method2() {  
	         System.out.println("this is the targetable method!");  
	     }  
	   
	     @Override  
	     public void method1() {  
	         source.method1();  
	     }  
	 }  



