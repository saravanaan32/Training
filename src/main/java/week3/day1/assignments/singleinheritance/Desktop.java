package week3.day1.assignments.singleinheritance;

public class Desktop extends Computer
{
	public void desktopSize()
	{
		System.out.println("Desktop - The Desktop Size");
	}
	public static void main(String[] args) 
	{
		Desktop objDesktop = new Desktop();
		objDesktop.computerModel();
		objDesktop.desktopSize();
		
	}

}
