package edu.wust.dp.Adapter;

public class i_WrapperTest {

	public static void main(String[] args) {  
	        i_Sourceable source1 = new i_SourceSub1();  
	        i_Sourceable source2 = new i_SourceSub2();  
	          
	        source1.method1();  
	        source1.method2();  
	        source2.method1();  
	        source2.method2();  
	    }  
	 }  


