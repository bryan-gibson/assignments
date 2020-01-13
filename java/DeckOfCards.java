//a deck of playing cards

import java.security.SecureRandom;

public class DeckOfCards {

    private static final SecureRandom myRandom = new SecureRandom ();
    private static final int Number_Of_Cards = 52;

    private Card [] deck = new Card [Number_Of_Cards];
    //this array will include objects created from class, Card

    private int currentCard = 0;
    //this is the index of next card to be dealt

    public DeckOfCards (){
        //no-argument constructor

        String [] faces= {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight",
        "Nine", "Ten", "Jack", "Queen", "King"};
        //length- 13
        //0-12

        String [] suits= {"Hearts", "Diamonds", "Clubs", "Spades"};
        //length- 4
        //0-3

        for(int count=0; count < deck.length; count++){

            deck[count]= new Card (faces[count%13], suits[count/13]);

            //count%13 will always return numbers between 0-12
            //count/13 will always return numbers between 0-3
            //count=25
            //deck[25]= new Card("King",)
            //25%13=12 - faces[12]
            //25/13=1 - suits[1]

        }

    }//end constructor

    public void shuffle () {

        currentCard= 0;
        //no card is picked

        //for each card, pick a random card, then swap them

        for(int first=0; first<deck.length; first++){

            int second= myRandom.nextInt(Number_Of_Cards);
            //generating numbers between 0-51

            Card temp= deck[first];
            deck[first]=deck[second];
            deck[second]=temp;
        }
    }//end method

    public Card dealCard (){

        if(currentCard < deck.length){
            //enough cards

            return deck[currentCard++];

            //deck[0]
            //currentCard=1;
        }

        else {

            return null;
            //no more cards to be dealt
        }
    }
}
