package Test;

import java.text.SimpleDateFormat;
import java.util.*;


public class te {
	public static boolean isvalid(String date, String formatter) {
		
	SimpleDateFormat sdf=new SimpleDateFormat(formatter);
	sdf.setLenient(false);
		
		try {
			sdf.parse(date);
			return true;
	   }catch(Exception e) {
			return false;
		}
	}
	
	

public static void main(String[] args) {
	String formatter="yyyy-MM-dd";
	String date="2024-13-31";
	System.out.println(isvalid(date,formatter));
	
}

}
