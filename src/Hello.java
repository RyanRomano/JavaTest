
public class Hello {

	public static void main(String[] args)
	{
		howBadDidIDo(10);
	}
	
	public static void howBadDidIDo(double number) {
		if (number > 4)
		{
			String toPrint = "I goofed up ";
			toPrint = toPrint + squareNumber(number);
			toPrint = toPrint + "X";
			System.out.println(toPrint);
		}
		else
		{
			System.out.println("I did good.");
		}
	}
	
	public static double squareNumber(double number)
	{
		double elephant = number * number;
		return elephant;
	}
	
}
