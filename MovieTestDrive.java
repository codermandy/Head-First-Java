//write your class
class Movie { 
 String title;  String genre;  int rating;  
void playIt() {  
System.out.println("Playing the movie"+" "+title);  } 
}
public class MovieTestDrive {
  public static void main(String[] args) {  
  Movie one = new Movie();    one.title = "Gone with the Stock";    one.genre = "Tragic";    one.rating = -2;   
 Movie two = new Movie();    two.title = "Lost in Cubicle Space";    two.genre = "Comedy";    two.rating = 5;    two.playIt();   
 Movie three = new Movie();    three.title = "Byte Club";    three.genre = "Tragic but ultimately uplifting";    three.rating = 127; 
//Create three more objects
Movie four = new Movie(); four.title="Kal Ho Na Ho" ; four.genre="Romance" ;four.rating=8;
Movie five = new Movie(); five.title="Ironman"; five.genre="Action"; five.rating=9; five.playIt();
Movie six= new Movie(); six.title="Avangers"; six.genre="Action" ;six.rating=10; six.playIt();
}
}
