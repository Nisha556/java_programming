package myfirstproject;

public class Vehicle4 {
void run3()
{
	System.out.println("Vehicle is the class");
	
}
}
  class Bike4 extends Vehicle4
{
	void run2()
	{
		System.out.println("Bike has some other property");
		
	}
}

  class Cycle extends Bike4
{
	void run1()
	{
		System.out.println("Cycle has some other poperty");
		
	}
}
 class Multiinheri
{
	public static void main(String args[])
	{
		Cycle c= new Cycle();
		c.run1();
		c.run2();
		c.run3();
		
	}
}