package Test;

import java.util.ArrayList;
import java.util.HashMap;

public class Per{
	
	public static void main(String[] args) {
		
		
		String str="sanjay";
		char[] ch=str.toCharArray();
		char temp = 0;
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch.length;j++) {
				if(ch[i]<ch[j]) {
				 temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				
			}
		}
		}
		
	  for(int i=0;i<ch.length;i++) {
		  System.out.print(ch[i]);
	  }
		
		
	  System.out.println();
		int number =10;
		for(int i=1;i<=2;i++) {
			System.out.println(number+" *"+i+" ="+number*i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
		
	
	
	
	
	
		
		
	}

}
