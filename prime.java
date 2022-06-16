package New;

public class prime {
	public static void main(String[] args)
	{
		int no=5;
		boolean flag=true;
		for(int i=2;i<=no;i++) {
			if(no%i==0)
			{
				flag=false;
				break;
				
			}
		}
if(flag==true)
{
	System.out.println("it is a prime number");
}
else
{
	System.out.println("it is not a prime number");
	
}
	
	}

}
