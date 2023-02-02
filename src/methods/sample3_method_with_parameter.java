package methods;

public class sample3_method_with_parameter 
{
	public static void main(String[] args) 
	{
		sample3_method_with_parameter.Addition(15, 25);
		
		sample3_method_with_parameter s3=new sample3_method_with_parameter();
		s3.division(45, 9);
		s3.name("nitish", 100,'A',75.4f);
				
	}
	
	public static void Addition(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void division(int c, int d)
	{
		System.out.println(c/d);
	}
	
	public void name(String name, int rollNum, char grade, float percentage)
	{
		System.out.println("student name: "+name);
		System.out.println("student roll num: "+rollNum);
		System.out.println("student grade: "+grade);
		System.out.println("student percentage: "+percentage+"%");
	}
	
}
