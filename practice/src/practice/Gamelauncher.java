package practice;

import java.util.ArrayList;
public class Gamelauncher
{
    private ArrayList<Simple> simplelist=new ArrayList<Simple>();
    private int numofg=0;
    private GameHelper helper = new GameHelper();
    private void Setupgame()
    {
    	Simple one=new Simple();
    	one.setname("pets");
    	Simple two= new Simple();
    	two.setname("grass");
    	Simple three= new Simple();
    	three.setname("apple");
    	simplelist.add(one);
    	simplelist.add(two);
    	simplelist.add(three);
    	System.out.println("three simple texts to drown are pets and grass and apple !");
    	System.out.println("go ahead partners kill 'em");
    	for(Simple simp:simplelist)
    	{
    		ArrayList<String> newLocation = helper.placeDotCom(3);
    		simp.setloc(newLocation);
    	}
    }
    private void startplaying()
    {
    	while(!simplelist.isEmpty())
    	{
    		String uguess = helper.getUserInput("Enter a guess: ");
    		checkit(uguess);
    	}
    	finishing();
    }
    private void checkit(String uguess)
    {
    	numofg++;
    	String result="miss";
    	for(Simple simp:simplelist)
    	{
    		result = simp.checkguess(uguess);
    		if(result=="hit")
    			break;
    		if(result=="kill")
    		{
    			simplelist.remove(simp);
    			break;
    		}
    	}
    	System.out.println(result);
    }
    private void finishing()
    {
    	if(numofg<=18)
    	System.out.println("won");
    	else
    		System.out.println("Lost");
    }
	public static void main(String[] args)
	{
				Gamelauncher game = new Gamelauncher();
				game.Setupgame();
				game.startplaying();
	}
}
