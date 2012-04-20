class Dog{
	String name;
	public static void main(String[] args) {
		//make a Dog object and access it

		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";

		//now make a Dog Array

		Dog[] myDogs = new Dog[3];

		//and put some dogs in it
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;

		//now access the Dogs using the array referneces
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";

		System.out.println("last dog's name is");
		System.out.println(myDogs[2].name);

		int x = 0;

		while(x<myDogs.length){
			myDogs[x].bark();
			x += 1;
		}

	}
	public void bark(){
		System.out.println(name + " says Ruff!");
	}
}