package com.niit;

import java.util.Scanner;

public class Program20 {
	public static void main(String[] args){
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number from the user");
		num=sc.nextInt();
		if(num<0){
			System.out.println("number entered is negative");
		}else{
			System.out.println("number entered is positive");
		}
	}

}
