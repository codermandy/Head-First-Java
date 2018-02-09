public class BeerSong{
public static void main(String [] Args){
int beerNum=99;
String word ="bottles";
while(beerNum>0){
System.out.println(beerNum+" "+word+" of beer on the wall");
System.out.println(beerNum+" "+word+" of beer");
beerNum=beerNum-1;
if(beerNum>0)
System.out.println(beerNum+" " +word+ " of beer on the wall");
else
System.out.println("No more"+" " +word + " of beer on the wall");
}
}
}
