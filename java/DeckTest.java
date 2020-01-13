public class DeckTest {

    public static void main (String [] args){

        DeckOfCards myDeck= new DeckOfCards();
        //calling non-static methods: shuffle and dealCard
        //this object creation will trigger our no-argument constructor

        myDeck.shuffle();

        for(int i=1; i<=52; i++){

            System.out.printf("%-19s", myDeck.dealCard());
            //although dealCard returns a card object,
            //we are expecting %s, so java will call toString
            //method from class Card

            if(i%4 == 0){

                System.out.println();
            }
        }
    }
}
