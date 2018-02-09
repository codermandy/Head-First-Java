class Dog {
	String name;
	public static void main (String[] args){
	
	//make a dog object and access it
	Dog dog1 = new Dog();
	dog1.bark();
	dog1.name="Bruno";
		
	//make a dog array 
	Dog[] myDogs=new Dog[3];
	//put some dogs in it
	myDogs[0]=new Dog();
	myDogs[1]=new Dog();
	myDogs[2]=dog1;

	//access Dogs using array 
	myDogs[0].name="Fred";
	myDogs[1].name="Tom";
	
	//What about Dog[2]?
	System.out.print("Last dog name is: myDogs[2].name");
				
	//loop through array 
	//tell dogs to bark
	int x = 0;
	while(x<myDogs.length){
	myDogs[x].bark();
	x+=1;
	}
}
private void bark(){System.out.println(name+" says Bhaw!");}
private void chaseCat(){}
private void eat(){}
}
	