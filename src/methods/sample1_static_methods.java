package methods;

public class sample1_static_methods
{
	public static void main(String[] args) //pre-defined method
	{
		//static method call from same class
		
		sample1_static_methods.m1();
		sample1_static_methods.m2();
		
		//non-static method call from same class
		
		sample1_static_methods s1=new sample1_static_methods();
		s1.m3();
		s1.m4();
		
		//static method call from different class
		
		sample2.m5();
		sample2.m6();
		
		//non-static method call from same class
		
		sample2 s2=new sample2();
		s2.m7();
		s2.m8();
		
		
	}
	
	public static void m1() //user-defined method
	{
		System.out.println("static method m1 from same class");
	}
	
	public static void m2()
	{
		System.out.println("static method m2 from same class");
	}
	public void m3()
	{
		System.out.println("non-static method m3 from same class");
	}
	public void m4()
	{
		System.out.println("non-static method m4 from same class");
	}
	
	
}