package week3.day2;

public class College extends University
{
	public static void main(String[] args) 
	{
		College obj = new College();
		obj.pg();
		obj.ug();
		
	}

	@Override
	public void ug() 
	{
		// TODO Auto-generated method stub
		System.out.println("BE-Computer Science");
		
	}

}
