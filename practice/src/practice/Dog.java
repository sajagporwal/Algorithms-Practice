package practice;

class Dogg
{
	private int size;
	private int hair;
	public void bark()
	{
		System.out.println("bOW BOW");
	}
	public void setint(int d)
	{
		size=d;
	}
}

public class Dog
{
	public static void main(String[] args)
	{
		Dogg[] d= new Dogg[6];
		d[0]=new Dogg();
		d[0].setint(5);
		System.out.println("Size: "+ 5);
		int e=(int)(Math.random()*5);
		System.out.println(e);
		 
	}
}