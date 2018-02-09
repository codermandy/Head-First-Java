class TapeDeck{
boolean canRecord =false;	//instance variable

void playTape(){
System.out.println("Playing the tape"); 	//method
} //end of method

void recordTape(){ 
System.out.println("Recording the tape"); 	//another method
} //end of method

}//end of class

class TapeDeckDriverTest{ 				//main class
public static void main(String[] args){
TapeDeck t=new TapeDeck();	//correction
t.canRecord=true;		 
t.playTape();
if(t.canRecord==true){
t.recordTape();
}//end of if/else
}// end of main method
}//end of main class
