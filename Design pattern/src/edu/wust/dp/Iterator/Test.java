package edu.wust.dp.Iterator;

public class Test {


	  public static void main(String[] args) {  
	         Collection collection = new MyCollection();  
	         Iterator it = collection.iterator();  
	           
	         while(it.hasNext()){  
	             System.out.println(it.next());  
	         }  
	     }  
	 }  

