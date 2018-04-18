package com.niit;

import java.util.Calendar;
import java.util.Date;

public class Program17 {
public static void main(String[] args){
	Calendar cal=Calendar.getInstance();
	Date today=cal.getTime();
	cal.add(Calendar.YEAR,1);
	Date nextYear=cal.getTime();
}
}
