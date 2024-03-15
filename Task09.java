package another;

 
class bike{
	  public void bikeSound11() {
		  System.out.println("bike Sound");
	  }
}
class hero extends bike{
	  public void bikeSound11() {
		  System.out.println("hero Sound");
	  }
}
	
class ktm extends bike{
	  public void bikeSound11() {
		  System.out.println("ktm Sound");
	  }
	  
}

public class Task09 {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		bike s=new hero();
		bike s1=new ktm();
		s.bikeSound11();
		s1.bikeSound11();
	}

}
