package methods;

public class Sample4_MWP_MWOP 
{
	//method with parameter
	public void Addition(int a, int b, int c)
	{
		int d= a+b+c;
		System.out.println(d);
	}
	
	//method without parameter
	public static void Subtraction()
	{
		int s=80-20;
		System.out.println(s);
	}
	
	public static void main(String[] args) 
	{
		Sample4_MWP_MWOP s4=new Sample4_MWP_MWOP();
		s4.Addition(20, 40, 60);
		
		Sample4_MWP_MWOP.Subtraction();
	}
	
}
