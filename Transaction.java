package com.org.streamapijava;

public class Transaction
{
   Trader trader;
   int year,value;
public Transaction(Trader trader, int year, int value) 
{
	this.trader = trader;
	this.year = year;
	this.value = value;
}
public Trader getTrader() {
	return trader;
}
public int getYear() {
	return year;
}
public int getValue() {
	return value;
}

   
}
