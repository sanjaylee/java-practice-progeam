package oops;

class AA extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
		System.out.println("sanjay");
		try{Thread.sleep(500);}catch(Exception e) {};
	}
}
}
class B extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
		System.out.println("lee");
		try {Thread.sleep(500);}catch(Exception e) {};
		
		
	}
	}
}

public class Threas {
	public static void main(String[] args) {
		
		AA obj1=new AA();
		B obj2=new B();	
		obj1.start();
		obj2.start();
		
		

		
	}

}
