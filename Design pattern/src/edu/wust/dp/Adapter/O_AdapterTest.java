package edu.wust.dp.Adapter;

public class O_AdapterTest {

 public static void main(String[] args) {  
        C_Source source = new C_Source();  
        C_Targetable target = new Wrapper(source);  
        target.method1();  
        target.method2();  
    }  
}  

