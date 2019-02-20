package com.org.assign3;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) 
	{
		List <String> list=new ArrayList<>();
		list.add("rama");
		list.add("jspiders");
		list.add("java");
		list.add("python");
		System.out.println(list);
		  list.removeIf(ele->(ele.length()%2==0));
		  	  System.out.println(list);
		
			

	}

}
