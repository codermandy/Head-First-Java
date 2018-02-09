class DogArray{
public static void main(String[] args){
GoodDog[] pets;
pets = new GoodDog[7];
pets[0]=new GoodDog();
pets[1]=new GoodDog();
pets[0].setSize(43);
int x= pets[0].getSize();
pets[1].setSize(53);
System.out.println(x);
}
}



