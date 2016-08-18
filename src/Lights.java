/*
-instantiates bulb object
-invokes logic of onOff method to change boolean true/false to string on/off 
*/

public class Lights 
{
	public static void main(String[] args) 
	{
		/*true for ON, false for OFF*/
		Bulb bulb1 = new Bulb(true);
		
		bulb1.setStatus(true);
		
		/*Uses boolean to assign string value "on" or "off" 
		saved in onOrOff variable in Bulb.java
		*/
		bulb1.onOff();
		
		System.out.println(bulb1.toString());
	}
}
