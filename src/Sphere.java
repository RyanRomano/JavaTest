
public class Sphere {

	private double diameter;
	private double volume;
	private double area;
	
	/*Constructor*/
	public Sphere (double pDiameter) {
		diameter = pDiameter;
	}

	/*return user input for diameter*/
	public double getDiameter() {
		return diameter;
	}
	
	/*setter method from user input of Sphere.setDiameter(# clienttoken)*/
	public void setDiameter(double clientToken) {
		diameter = clientToken;
	}
	
	/*returns calculated value of volume from diameter using formula*/
	public double volumeCalc() {
		return ((4.0/3) * Math.PI * Math.pow((diameter / 2), 3));
	}
	
	/*returns area from diameter using formula*/
	public double areaCalc() {
		return (4 * Math.PI * Math.pow((diameter / 2), 2));
	}
	
	/*returns one line description of the set values of any Sphere object*/
	public String toString() {
		return "The sphere's diameter is " + getDiameter() + ", its volume is " 
	+ volumeCalc() + ", \nand its area is " + areaCalc() + ".";
}
}
