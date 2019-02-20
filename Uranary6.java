package com.org.assign3;

import java.util.ArrayList;

public class Uranary6 
{
	public static void main(String[] args) 
	{
       ArrayList<String> color_list;
	    MyOperator<String> operator;
	  
	  color_list = new ArrayList<> ();
	  operator = new MyOperator<> ();
	  
	  operator.varc1 = "White";
	  
	 // use add() method to add values in the list
	    color_list.add("White");
	    color_list.add("Black");
	    color_list.add("Red");
	    color_list.add("White");
		color_list.add("Yellow");
		color_list.add("White");
	  
	    System.out.println("List of Colors");
	    System.out.println(color_list);
	  
	 // Replace all colors with White color 
	    color_list.replaceAll(operator);
	    System.out.println("Color list, after replacing all colors with White color :");
	    System.out.println(color_list);    
}
}


