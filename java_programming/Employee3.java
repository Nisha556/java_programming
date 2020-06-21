package myfirstproject;

public class Employee3 {
int id;
int salary;
static String company="SRT Traders";
Employee3(int i, int s)
{
	id=i;
	salary=s;
}

void display()
{
	System.out.println(id+" "+salary+" "+company);
	
}
}
 class StaticKey {
	public static void main(String args[])
	{
		Employee3 e1= new Employee3(25,25000);
		Employee3 e2= new Employee3(30,30000);
		e1.display();
		e2.display();
		
	}
}