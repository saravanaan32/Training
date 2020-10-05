package week3.day1.motorvechicles;

public class MyVechicle 
{
	/*
	 * Public - Global Access - 
	 * [(Inside Package (extends, Object) + Outside Package (extends, Object)]
	 * 
	 * Protected - [(Inside Package (extends, Object) + Outside Package (extends)]
	 * 
	 * Default - [(Inside Package (extends, Object)]
	 * 
	 * Private - Class Level Access Only
	 */
	public static void main(String[] args) 
	{
		BMW myCar=new BMW();
		myCar.bmwLogo();
		myCar.accelerate();
		//Override Method by Car Class
		myCar.applyBrake();
		myCar.soundHorn();
		myCar.sunRoof();
		myCar.steeringWheel();
		Benz objCar=new Benz();
		objCar.benzLogo();
		objCar.applyBrake();
	}

}
