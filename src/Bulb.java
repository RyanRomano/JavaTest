/*Creates a bulb object which can be set/changed as on or off
and prints whether it is on or off.*/

public class Bulb {
	private boolean isItOn;
	private String onOrOff;
	
	/*CONSTRUCTOR****************************/
	public Bulb (boolean pIsItOn)
	{
		isItOn = pIsItOn;
	}
	
	/*GETTERS****************************/
	public boolean getStatus()
	{
		return isItOn;
	}
	
	/*SETTERS****************************/
	public void setStatus(boolean changeIsItOn)
	{
		isItOn = changeIsItOn;
	}
	
	/*must invoke logic in driver class before printing to string*/
	public void onOff()
	{
		if (isItOn == false)
		{
			onOrOff = "off";
		}
		else
		{
			onOrOff = "on";
		}
	}
	
	/*TO STRING****************************/
	public String toString()
	{
		return "The light is " + onOrOff + ".";
	}
}
