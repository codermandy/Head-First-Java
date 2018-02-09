public class PhraseOMatic {
public static void main(String [] Args) {

//make three set of words to choose from add your own
String[] wordListOne={"24/7","multi-Tier","20000 foot","B2B","win-win","front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
String[] wordListTwo={"empowered","sticky","value-added","oriented","centric","distributed","clustered","branded","outside-the-box","positioned","networked","focused","leveraged","aligned","targated","shared","cooperative","accelarated"};
String[] wordListThree={"process","tripping-point","solution","architecture","core competency","strategy","mindshare","portal","space","vision","paradigm","mission"};
String[] wordListFour={"rent","units","motor","horsepower","kilo-watt-hr","rupees","gas cylinder","mom","dad","health","money","success","class-mates","college"};

//find out how many words are there in each list
int oneLength=wordListOne.length;
int twoLength=wordListTwo.length;
int threeLength=wordListThree.length;
int fourLength=wordListFour.length;

//generate four random numbers
int rand1=(int) (Math.random() * oneLength);
int rand2=(int) (Math.random() * twoLength);
int rand3=(int) (Math.random() * threeLength);
int rand4=(int) (Math.random() * fourLength);

//now build a phrase
String phrase = wordListOne[rand1] + " "+ wordListTwo[rand2]+" " +wordListThree[rand3]+ " "+wordListFour[rand4];

//print out phrase
System.out.println("What we need is a " +phrase);
}
}
