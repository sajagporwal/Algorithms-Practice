package practice;
class Dog
{
	int size;
	String breed;
	void bark()
	{
		System.out.println("bhow bhow" + breed);
	}
}
public class prac1 {
public static void main(String[] args )
{
	Dog d = new Dog();
	d.size=3;
	d.breed="pomerian";
	d.bark();
	Dog e=new Dog();
	e.size=8;
}
}
