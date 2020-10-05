package week3.day1.mobilephones;

public class SmartPhone extends AndroidPhone
{
	//Smart Phone(connectWhatsApp)
	public void connectWhatsApp()
	{
		System.out.println("Smart Phone - Connect Whats App");
	}
	public void takeVideo()
	{
		System.out.println("Smart Phone - Take Photo (overridden the Android phone Method");
	}
	public static void main(String[] args)
	{
		SmartPhone myMobile = new SmartPhone();
		myMobile.sendMsg();
		myMobile.makeCall();
		myMobile.saveContact();
		myMobile.takeVideo();
		myMobile.connectWhatsApp();
	}
}
