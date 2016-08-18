
public class MultiSphere 
{
	public static void main(String[] args) 
	{
		Sphere sphere1 = new Sphere(0);
		Sphere sphere2 = new Sphere(4.2);
		
		sphere1.setDiameter(3.3);
		sphere1.getDiameter();
		
		System.out.println(sphere1);/*also prints the same without .toString(); ?*/
		System.out.println(sphere2.toString());
	}
}
