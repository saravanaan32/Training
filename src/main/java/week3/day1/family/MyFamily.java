package week3.day1.family;

public class MyFamily {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Father MF=new Father();
		System.out.println(MF.duplexVilla);
		MF.giveAwayFather();
		
		//It will access all the method in the GrandFather Class - Inheritance
		
		System.out.println(MF.villa);
		MF.giveAwayGrandFather();

	}

}
