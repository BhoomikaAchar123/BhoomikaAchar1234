package New;

class facebook{
	private String pwd="bhoomi";
	public String getpwd(){
return pwd;
	}
	public void setpwd(String pwd)
	{
		this.pwd=pwd;
	}
}
		public class encapsulation
		{
			public static void main(String[] args)
			{
				facebook f1=new facebook();
				System.out.println(f1.getpwd());
				f1.setpwd("hello");
				System.out.println(f1.getpwd());
				
			}
			}
