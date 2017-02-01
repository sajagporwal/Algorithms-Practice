package practice;

import java.util.ArrayList;
public class Simple
{
	private ArrayList<String> celloc;
	private String name;
	
	public void setname(String n)
	{
		name=n;
	}
	public void setloc(ArrayList<String> locset)
	{
		celloc=locset;
	}
    public String checkguess(String uguess)
    {
    	String result="miss";
    	int index = celloc.indexOf(uguess);
    	if(index>=0)
    	{
    		celloc.remove(index);
    		if(celloc.isEmpty())
    		{
    			System.out.println("Ouch you sunk "+name);
    			result="kill";
    		}
    		else
    		{
    		 result="hit";
    		}
    	}
    	return result;
    }
}
		
		
	
	


