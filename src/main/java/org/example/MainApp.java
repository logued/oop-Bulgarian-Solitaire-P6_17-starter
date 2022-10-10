package org.example;                                    // OOP 2022

/*
From: Big Java by C.Horstman -  STARTER October 2022       ArrayList demo.

In this assignment, you will model the (game theory) game of Bulgarian Solitaire.
The game starts with 45 card piles.
(They need not be playing cardPiles. Unmarked index card piles work just as well.)

Randomly divide the cards into some number of piles of random size. For example,
you might start with piles of size 20, 5, 1, 9, and 10. In each round, you take one
card from each pile, forming a new pile with these cardPiles.

For example, the sample
starting configuration would be transformed into piles of size 19, 4, 8, 9, and 5.
The solitaire is over when the piles have sizes 1, 2, 3, 4, 5, 6, 7, 8, and 9, in some order.
(It can be shown (mathematically) that you always end up with such a configuration.)

In your program,
produce a random starting configuration and print it. Then keep applying the solitaire
steps and print the result. Stop when the solitaire final configuration is reached.

https://en.wikipedia.org/wiki/Bulgarian_solitaire

https://github.com/logued/oop-Bulgarian-Solitaire-p6_17-solution.git

*/

import java.util.ArrayList;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("***** Bulgarian Solitaire - Card Came Simulation *****");
        MainApp app = new MainApp();
        app.start();
    }
    public void start() {
        // create an ArrayList of Integers, where each ArrayList element represents one pile of cards,
        // and each element value represents the number of cards in that pile
        ArrayList<Integer> cardPiles = initializeCardPiles();  // will create and initialize card piles
        printCardPiles(cardPiles);

        while (!isGameOver(cardPiles)) {        // repeat the steps until game is over
            makeNewPile(cardPiles);
            printCardPiles(cardPiles);
        }

        System.out.println("The Game is finished. The card piles are:");
        printCardPiles(cardPiles);
    }

    /**
     * Create a new pile of cards by taking one card from each existing pile, and add that
     * new pile to the list of card piles. Remove any piles that have become zero in size.
     * @param cardPiles
     */
    public void makeNewPile(ArrayList<Integer> cardPiles) {
        // create card count for the new pile
        int newPileCardCount = 0;    // new pile has no cards initially

        // reduce each card pile by one
        // TODO Iterate over the card piles (elements), subtract 1 from each card pile,
        // sum up the total number of subtracted cards,
        // add a new card pile to the ArrayList of card piles.

        // TODO Remove empty Piles from list:
        // if a pile has been reduced to zero cards,
        // then we must remove that pile from the ArrayList.
        // When we use remove() we will have to adjust the index "i" to avoid skipping an element

    }

    public boolean isGameOver(ArrayList<Integer> cardPiles) {
        boolean isFinished = true;

        // if we do not have 9 card piles yet, then we are not finished

        // if we have 9 piles, then check if the list of card piles contain 1,2,3,4,5,6,7,8,9 cards (not necessarily in order)
        // if the piles don't contain 1-9, then we are not finished.

        return isFinished;
    }

    public ArrayList<Integer> initializeCardPiles() {

        // TODO Instantiate an ArrayList of card piles (Integer)
        // Set total number of cards to be 45, and then randomly generate a number
        // to represent a pile of cards, and add that number to the ArrayList to represent a pile of cards.
        // Repeat the process until the 45 has been reduced to zero.

        // TODO
        // return reference to the initialized ArrayList of card piles
        return null;  // remove the null and replace with your list
    }

    public void printCardPiles(ArrayList<Integer> cardPiles) {
        // TODO iterate through the ArrayList of card piles, and print the number of cards in each pile
        // (simply, the value of each array element)
    }
}