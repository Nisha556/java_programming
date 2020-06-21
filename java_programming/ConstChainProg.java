package myfirstproject;

public class ConstChainProg {
public String sName;
public int sMarks;
 public ConstChainProg()
 {
	 this("Meghan");
	 
 }
 public ConstChainProg(String name)
 {
	 this(name, 70);
	 
 }
 public ConstChainProg(String name, int marks)
 {
	 this.sName=name;
	 this.sMarks=marks;
	 
 }
 void disp()
 {
	 System.out.println("Student Name:"+sName);
	 System.out.println("Student Marks:"+sMarks);
 }
	 public static void main(String args[])
	 {
		 ConstChainProg s=new ConstChainProg();
		 s.disp();
	 }
	 
 
}
