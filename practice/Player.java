package practice;
public class Player 

{
	int guess;
	public void numguess()
	{
		int x = (int)(10*Math.random());
		guess=x;
		System.out.println("the number i guessed is "+x);
	}
}
