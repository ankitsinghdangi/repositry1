package com.org.teststreamjava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.org.streamapijava.Fruit;

public class TestFruit 
{
	public static void main(String[] args) 
	{
       List<Fruit> list=new ArrayList<>();
	    
	    list.add(new Fruit("Apple","Red",100,50));
	    list.add(new Fruit("PineApple","Yellow",100,50));
	    list.add(new Fruit("Banana","Yellow",60,105));
	    list.add(new Fruit("Blueberry","Blue",85,150));
	    list.add(new Fruit("Grapes","Black",65,50));
	    list.add(new Fruit("Pomegranate","Red",100,90));
	    
	    System.out.println("---------------------------------------------");
	   
	    List<String> list2=list.stream()
	    		.filter(p->p.getCalories()<100)
	    		.sorted(Comparator.comparing(Fruit::getCalories).reversed())
	    		.map(Fruit::getName)
	    		.collect(Collectors.toList());
	    list2.forEach(System.out::println);
	    
	    System.out.println("-----------------------------");
	    List<String> list3=list.stream()
	    		//.filter(p->p.getColor())
	    		.sorted(Comparator.comparing(Fruit::getColor))
	    		.map(Fruit::getName)
	    		.collect(Collectors.toList());
	    list3.forEach(System.out::println);
	    		
	    
	    System.out.println("---------------------------------");
	    
	    List<String> list4=list.stream()
	    		.filter(p->p.getColor()=="Red")
	    		.sorted(Comparator.comparing(Fruit::getPrice))
	    		.map(Fruit::getName)
	    		.collect(Collectors.toList());
	    list4.forEach(System.out::println);
	    		
	 
	   
	    
		
	
	}


}
