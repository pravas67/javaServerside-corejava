package com.heraizen.cj.day2;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		 int rows = sc.nextInt();
	        for (int i = 1; i <= rows; i++) 
	        {
	            for (int j = 1; j <= i; j++) 
	            { 
	                System.out.print(j+" "); 
	            }
	            for (int j = i-1; j >= 1; j--)
	            {
	                System.out.print(j+" ");
	            }
	             
	            System.out.println();
	        }
	        sc.close();

	}

}
