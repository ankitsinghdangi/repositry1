package com.org.interfacepackage;

public class TestInf2
{
	public static void main(String[] args) 
	{
		OrederInf2 o=a->(a>10000)?1:-1;
	int o1=	o.order(100001);
	
	     if(o1==1)
	    	 System.out.println("order status is completed");		
	     else
	    	 System.out.println("order status is declined");
	     OrederInf2.m1();
	     

}
}