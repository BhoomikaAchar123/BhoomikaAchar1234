package New;

interface animal{
void noise();
}
class cat implements animal{
	public void noise()
	{
		System.out.println("meow meow");
	}
}
class dog implements animal
{
	public void noise()
	{
		System.out.println("bow bow");
	}
}
class snake implements animal
{
	public void noise()
	{
		System.out.println("buss buss");
	}
}
class stimulator
{
	static void ansim(animal a1)
	{
		a1.noise();
	}
}
class abstraction

{
	public static void main(String[] args)
	{
		cat c1=new cat();
		dog d1=new dog();
		snake s1=new snake();
		stimulator.ansim(c1);
		stimulator.ansim(d1);
		stimulator.ansim(s1);

	}
}

	 
