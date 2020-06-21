package myfirstproject;

public class Vehicle {

void property()
{
	System.out.println("Because it has wheels");
	
}

}
class Bike extends Vehicle
{
	void run()
	{
		System.out.println("Bike is Running");
		
	}
}
class SimpleInheri
{
	public static void main(String args[])
	{
		Bike d= new Bike();
		d.run();
		d.property();
		Vehicle v = new Vehicle();
	
		v.property();
	}
}