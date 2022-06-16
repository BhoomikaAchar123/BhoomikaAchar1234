package New;

public class Demo 
{
	public static void main(String[] args) 
	{
Pemo d1=new Pemo();
System.out.println(d1.a);
d1.disp();
	}
}
class Sample
{
	int a=10;
}
class Pemo extends Sample
{
	void disp()
	{
		System.out.println("hii");
	}
}