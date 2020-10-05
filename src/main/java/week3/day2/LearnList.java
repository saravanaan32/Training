package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List fruit = new ArrayList();
		fruit.add("Mango");
		fruit.add("Apple");
		fruit.add("JackFruit");
		fruit.add("Pineapple");
		fruit.add("Cherry");
		fruit.add("Mango");
		fruit.add("Apple");
		int size = fruit.size();
		System.out.println(size);
		System.out.println(fruit);
		for (int i = 0; i < fruit.size()-1; i++) 
		{
			System.out.println(fruit.get(i)	);
		}
		for (Object fruits : fruit) 
		{
			System.out.println(fruits);
			
		}
		

	}

}
