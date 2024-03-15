package another; 

 

import java.util.Scanner;

 
class perent{
		String n=("jjjjjjjj");
		
		public void myfunc1() {
			System.out.println("my name is ppppppppppp");
		}
		
	}
 class child extends perent{
	String n1= "my name is cccccccccc";
	 
 }
public class Demo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner
	System.out.println("enter the value");
		Scanner f=new Scanner(System.in);
		String t=f.nextLine();
		//System.out.println(t);
		
		// array value get to  user
		int size=f.nextInt();
      int []arr=new int[size];
     for(int i=0;i<size;i++) {
    	 System.out.println("enter the array value");
    	  int arrVal=f.nextInt();
    	  arr[i]=arrVal;
     }
     int[] arr1= {2,5,7,8,6};
 	
 	for(int i = 0;i<arr1.length;i++) {
 		System.out.println(arr1[i]);
    
	}
	
	
	
	
	
		
	}
	

}