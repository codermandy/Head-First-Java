//Get set methods with encapsulation Example
class GoodDog {
private int size;
public int getSize(){		//get method has a return value
return size;
}
public void setSize(int s){		//set doesn't return anything
size =s;
}
void bark(){
if(size>60)
System.out.println("Woof!Woof!");
else if(size>14)
System.out.println("Ruff!Ruff!");
else 
System.out.println("Yipp!Yipp!");
}
}

class GoodDogTestDrive{
public static void main(String[] args){
GoodDog one=new GoodDog();	//object of class GoodDog
one.setSize(29);
GoodDog two = new GoodDog();	//another object of class GoodDog
two.setSize(43);		//calling method on object 
System.out.println("Dog one: "+one.getSize());
System.out.println("Dog two: "+two.getSize());
one.bark();
two.bark();
}
}

