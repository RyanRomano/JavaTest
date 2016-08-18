//Ryan Romano
//4.2 ed7
//Instantiates dog objects and calls the methods
//of the Dog class created in a separate file


public class Kennel {
	public static void main(String[] args) {
//create new Dog object from Dog.java with (name, age) parameter
		
//dog objects can also be set name/age in first usage of
//Dog dog = new Dog(**"name"**, ****age***)
		Dog dog = new Dog();
		Dog dog2 = new Dog("Molly", 1);
		Dog dog3 = new Dog();
//setter methods called from Dog.java to accept age and name data		
		dog.setName("Stanley");
		dog.setAge(3);
//toString method to print description of dog.
		System.out.println(dog.toString());
		System.out.println(dog2.toString());
//with no data set for dog3, it will print the default values
//of Lost Dog! with a age of 0
		System.out.println(dog3.toString());

//computes and returns dog age in person years (age * 7)from method in Dog.java
		System.out.println(dog.getName() + " is " + dog.getPersonYears() 
				+ " in human years.");
		System.out.println(dog2.getName() + " is " + dog2.getPersonYears() 
				+ " in human years.");
		System.out.println(dog3.getName() + " is " + dog3.getPersonYears() 
				+ " in human years.");
	}
}
