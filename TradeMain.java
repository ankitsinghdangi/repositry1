package com.org.teststreamjava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.org.streamapijava.Trader;

public class TradeMain
{
	public static void main(String[] args) {
		List<Trader> list=new ArrayList<>();
		list.add(new Trader("raj", "Pune"));
		list.add(new Trader("haresh","Hyderabad"));
		list.add(new Trader("harsh", "Indore"));
		list.add(new Trader("kiki", "Delhi"));
		list.add(new Trader("maahi", "Indore"));
		list.add(new Trader("ankit", "Bhopal"));
		list.add(new Trader("vijay", "Pune"));
		list.add(new Trader("aakarsh", "Indore"));
		list.add(new Trader("akshay", "Pune"));
		list.add(new Trader("yakya", "Indore"));
		
		
		System.out.println("Assignment 9 --------------------");
		System.out.println("Unique Cities are>>>>>");
		List<String> names3=list.stream()
				.map(Trader::getCity)
				.distinct()
				.collect(Collectors.toList());
		names3.forEach(System.out::println);
		
		
		System.out.println("Assignment 10 --------------------");
		List<Trader> names=list.stream()
				.filter(p->p.getCity()=="Pune")
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
		names.forEach(System.out::println);
		
		System.out.println("Assignment 11 --------------------");
		System.out.println("Traders names are>>>>>");
		List<Trader> names4=list.stream()
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
		String S=names4.stream()
				.map(Trader::getName)
				.collect(Collectors.joining(", "));
		System.out.println(S);
		
		
		System.out.println("Assignment 12 --------------------");
		System.out.println("Traders based in Indore are_>>>>>");
		List<String> names2=list.stream()
				.filter(p->p.getCity()=="Indore")
				.map(Trader::getName)
				.collect(Collectors.toList());
		names2.forEach(System.out::println);
		
		
	}

}
