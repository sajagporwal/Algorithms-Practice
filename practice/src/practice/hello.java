package practice;

import java.util.ArrayList;

public class hello
{
	public static void main(String[] args)
	{
		ArrayList<String> mylist = new ArrayList<String>();
		String a = new String("woohoo");
		mylist.add(a);
		String b= new String("hola");
		mylist.add(b);
		System.out.println(mylist);
	}
}