package com.org.teststreamjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.org.streamapijava.News;

public class TestNews 
{ public static void main(String[] args) 
{
//	List<News> list=new ArrayList<>();
//	News n1=new News(11, "user posted1", "user1 coomented", "shows average news");
//	News n2=new News(22, "user posted2", "user2 coomented", "shows regional news");
//	News n3=new News(33, "user posted3", "user3 coomented", "shows highlighted news");
//	News n4=new News(44, "user posted4", "user4 coomented", "shows regional news");
//	
//	list.add(n1);
//	list.add(n2);
//	list.add(n3);
//	list.add(n4);
//	List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//	List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//	System.out.println(filtered);
	List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

	//get list of unique squares
	List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
	System.out.println(squaresList);
//	List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//
//	//get count of empty string
////	long count = strings.stream().filter(string -> string.isEmpty()).count();
////	System.out.println(count);
//	List<String>strings1 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//	List<String> filtered = strings1.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//
//	System.out.println("Filtered List: " + filtered);
//	String mergedString = strings1.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining());
//	System.out.println("Merged String: " + mergedString);
//}
}
}
