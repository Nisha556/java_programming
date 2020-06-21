package myfirstproject;

public class Vehicle3 {
void move()
{
	System.out.println("Vehicle is moving");
	
}
}
 class bikes extends Vehicle3
{
	void changeGear()
	{
		System.out.println("Bike has 2 wheels");
		
	}
}
  class Cars extends Vehicle3
{
	void run()
	{
		System.out.println("Cars has 4 wheels");
		
	}
}
  class inheri2
{
	public static void main(String args[])
	{
		Cars c=new Cars();
		c.run();
		c.move();
		
	}
}