package com.heraizen.cj.day2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num =sc.nextInt();
		int fact=1;
		for(int i = 1; i <= num; ++i)
        {
            fact*=i;
        }
		System.out.println("The factorial of "+num+" is :"+fact);
		sc.close();
	}

}
