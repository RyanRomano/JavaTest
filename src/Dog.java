public class Dog {
	
	//initialize age and name variables as integers/strings
	private String dogName;
	private int dogAge;

	//Constructor for Dog (variable name) = new Dog("name", age);
	//accept instance data
	public Dog(String clientNameInput, int clientAgeInput) {
		dogName = clientNameInput;
		dogAge = clientAgeInput;
	}
	
	//initialize instance data
	public Dog () {
		dogName = "Lost dog!";
		dogAge = 0;
	}
	
	//Get dog age
	public int getAge() {
		return dogAge;	
	}
	
	//Get dog name
	public String getName() {
		return dogName;
	}
	
	//set dog name
	public void setName(String nameChange) {
		dogName = nameChange;
	}
	
	//set dog age
	public void setAge(int ageChange){
		dogAge = ageChange;
	}
	
	//print description of dog
	public String toString() {
		return "The dog's name is " + dogName + ", and its age is " + dogAge + ".";
	}
	
	//integer mutator - age * 7 
	public int getPersonYears() {
		return (dogAge * 7);
	}	
}
