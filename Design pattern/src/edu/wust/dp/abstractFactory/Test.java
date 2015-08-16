package edu.wust.dp.abstractFactory;

import java.util.List;

public class Test {


	  public static void main(String[] args) {  
	         Provider provider = new SendMailFactory();  
	         Sender sender = provider.produce();  
	         sender.Send();  
	         
	         //builder

	     	 Builder builder = new Builder();  
	     	List<Sender> list=builder.produceMailSender(10);
	     	         


	     }  
	 }  

