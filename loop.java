package com.conditional.dec18;

public class loop 

{
	
	public static void main (String[] args) 
	
 {	
	int num = 10;
	
	if (num % 5 ==0 && num % 3 == 0) 
	{
		System.out.print("FizzBuzz");
		
	}
	else if (num % 3 == 0)
	{
		System.out.print("Fizz");
	}
	else if (num % 5 == 0)
	{
		System.out.print("Buzz");
	}
	
	else 
	{
		System.out.print("Not divisible by both numbers");
	}
	
 }

}	

//HW = WAP to print Fizz, Buzz, and FizzBuzz for 
//if given no is divisible by 3 then print Fizz
//if given no divisible by 5 print buzz
//divisible by 3 as well as 5 print fizzbuzz
