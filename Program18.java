package com.niit;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Program18 {
public static void main(String[] args){
	Date date=new Date();
	System.out.println(date);
	SimpleDateFormat formatter=new SimpleDateFormat("dd-mm-yy");
	String format=formatter.format(date);
	System.out.println(format);
	
}
}
