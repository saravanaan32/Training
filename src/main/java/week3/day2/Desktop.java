/**
 * 
 */
package week3.day2;

/**
 * @author saravananjeganathan
 *
 */
public class Desktop implements Hardware, Software 
{

	/**
	 * @param args
	 */
	public void desktopModel()
	{
		System.out.println("The Mac 55inch Desktop");
	}
	public void softwareResources() 
	{
		// TODO Auto-generated method stub
		System.out.println("The Mac OS:- Mac OS Catalina");
	}
	public void hardwareResources() 
	{
		// TODO Auto-generated method stub
		System.out.println("Hardwares:- I7 processor, 8GB Ram");	
	}
	public static void main(String[] args) 
	{
		Desktop obj = new Desktop();
		obj.desktopModel();
		obj.hardwareResources();
		obj.softwareResources();
		
	}
}
