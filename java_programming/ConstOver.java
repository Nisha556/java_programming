package myfirstproject;

public class ConstOver {
int itemid;
int price;
String name;
ConstOver(int a,int b)
{
	itemid=a;
	price=b;
	name="XYZ";
	System.out.println(itemid+" "+price+" "+name);
}
	ConstOver(int i, int p, String n)
	{
		itemid=i;
		price=p;
		name=n;
		System.out.println(itemid+" "+price+" "+name);
		
			
		
	}
}
	class constover2
	{
		public static void main(String args[])
		{
			ConstOver s1= new ConstOver(1,100);
			ConstOver s2= new ConstOver(2,200,"john");
	}
		
	

}
