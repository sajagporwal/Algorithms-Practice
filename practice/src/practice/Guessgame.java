package practice;
class Player{
	int guess;
	public void numguess()
	{
		int x = (int)(10*Math.random());
		guess=x;
		System.out.println("the number i guessed is "+x);
	}
}

 

public class Guessgame 
	
{
	    Player p1;		
		Player p2 ;
		Player p3;
		public void startgame()
		{
			p1 = new Player();
			p2=new Player();
			p3 = new Player();
			int tabbo;
		
			
			
			while(true)
			{
				
				tabbo = (int)(10*Math.random());
				boolean p1p=false;
				 boolean p2p=false;
			 boolean p3p=false;
				System.out.println(" to guess : " +tabbo );
				p1.numguess();
				p2.numguess();
				p3.numguess();
				if(p1.guess==tabbo)
					p1p=true;
				if(p2.guess==tabbo)
					p2p=true;
				if(p3.guess==tabbo)
					p3p=true;
				if(p1p||p2p||p3p)
				{
					System.out.println("p1 : "+p1p);
				System.out.println("p2 : "+p2p);System.out.println("p3 : "+p3p);
			}
		}

		}
}



