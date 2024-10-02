package Sample;
public class Instancemethd 
{
int mark;
String name;
public static void main(String[] args) 
	{
		
	Instancemethd obj=new Instancemethd(100,"priya");
	obj.print();
			}

public Instancemethd(int mark,String name)
{
	this.mark=mark;
	this.name=name;
}	
	
public void print()
{
	System.out.println("mark  is "  +mark);
	System.out.println("name is"   +name);


}}