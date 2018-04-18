package com.niit;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Program14 {
	public static void main(String[] args) throws Exception{
		System.out.println("isValid-dd.mm.yyyy=" + isValidFormat("dd/MM/yyyy"));
		System.out.println("isValid-dd/mm/yyyy=" + isValidFormat("dd/MM/yyyy"));
		System.out.println("isValid-dd-mm-yyyy=" + isValidFormat("dd/MM/yyyy"));
	}

	public static boolean isValidFormat(String isValidformat) throws Exception {
		Date d=null;
		try{
			SimpleDateFormat sdf=new SimpleDateFormat(isValidformat);
			d=sdf.parse(isValidformat);
			if(!isValidformat.equals(sdf.format(d))){
				d=null;
			}
		}
			catch(ParseException e){
				e.printStackTrace();
			}
		
		return d!=null;
	

}
}
