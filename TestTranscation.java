package com.org.teststreamjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.org.streamapijava.Trader;
import com.org.streamapijava.Transaction;

public class TestTranscation 
{
	public static void main(String[] args) 
	{
		List<Transaction> al=new ArrayList<>();
		al.add(new Transaction(new Trader("manu", "Singapore"), 2011, 1000));
		al.add(new Transaction(new Trader("Mahesh", "Pune"), 2041, 10400));
		al.add(new Transaction(new Trader("haresh", "Hydernagar"), 2001, 10050));
		al.add(new Transaction(new Trader("kanna", "Pune"), 2008, 10060));
		al.add(new Transaction(new Trader("manu3", "Pune"), 2019, 10700));
		al.add(new Transaction(new Trader("madnu", "Delhi"), 2017, 5000));
		al.add(new Transaction(new Trader("manur", "Pune"), 2015, 8000));
		al.add(new Transaction(new Trader("manus", "Bangalore"), 2014, 9000));
		List<Transaction> names8=al.stream()
		                   .filter(p->p.getTrader().getCity()=="Delhi")
							.collect(Collectors.toList());
		            names8.forEach(e->System.out.println("Assignment 13            transaction: "+e.getValue()+" by "+e.getTrader().getName()));

		           Transaction max=al.stream()
		            		.max((p1,p2)->Integer.compare(p1.getValue(), p2.getValue()))
		            				.get();
		             System.out.println("Assignment 14 = "+  max.getValue());
		             Transaction min=al.stream()
		             		.min((p1,p2)->Integer.compare(p1.getValue(), p2.getValue()))
		             				.get();
		              System.out.println("Assignment 15 ="+ min.getValue());
			
		
	}

}
