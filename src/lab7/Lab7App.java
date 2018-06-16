package lab7;

/**
 * <p>
 * Title: The Lab7App class
 * </p>
 *
 * <p>
 * Description: This class will be used to thoroughly test the various methods
 * in the PokerHand class. The seven cards specified will be used to test each
 * method.
 * </p>
 *
 * @author Hamin Choi Student (N00765091@students.ncc.edu)
 */
public class Lab7App {
    /**
     * <p>
     * Name: main method
     * </p>
     * 
     * @param args
     *            values to be sent to the method
     */
    public static void main( String[] args ) {
        testFourOfAKind();
        testFlush();
        testThreeOfAKind();
        testPair();
        testLowCard();
    }

    /**
     * <p>
     * Name: testFourOfAKind method
     * </p>
     * 
     * <p>
     * Description: tests the fourOfAKind method in the PokerHand class.
     * </p>
     */
    public static void testFourOfAKind() {
        // cards to be used to test the various methods
        // in the PokerHand class
        Card twoClubs = new Card( 2 );
        Card twoDiamonds = new Card( 15 );
        Card twoHearts = new Card( 28 );
        Card twoSpades = new Card( 41 );
        Card threeClubs = new Card( 3 );
        Card fourClubs = new Card( 4 );
        Card fiveClubs = new Card( 5 );
        
        PokerHand theHand = new PokerHand(twoClubs, twoDiamonds, twoHearts, twoSpades);
        System.out.println("Testing fourOfAKind method: " + "\n" + theHand.toString());
        if (theHand.fourOfAKind() == true) 
        	System.out.println("Four of a kind");
        else 
    		System.out.println("Not four of a kind");   	
        theHand.replaceCard(2, threeClubs);
        System.out.println("\n" + "Replaced the 2 of diamonds with the 3 of clubs: " + "\n" + theHand.toString());
        if (theHand.fourOfAKind() == true) 
        	System.out.println("Four of a kind");
        else 
    		System.out.println("Not four of a kind");  
    }

    /**
     * <p>
     * Name: testFlush method
     * </p>
     * 
     * <p>
     * Description: tests the flush method in the PokerHand class.
     * </p>
     */
    public static void testFlush() {
        // cards to be used to test the various methods
        // in the PokerHand class
        Card twoClubs = new Card( 2 );
        Card twoDiamonds = new Card( 15 );
        Card twoHearts = new Card( 28 );
        Card twoSpades = new Card( 41 );
        Card threeClubs = new Card( 3 );
        Card fourClubs = new Card( 4 );
        Card fiveClubs = new Card( 5 );
        
        PokerHand theHand2 = new PokerHand(twoClubs, threeClubs, twoHearts, twoSpades);
        System.out.println("\n" + "Testing flush method:" + "\n" + "\n" + theHand2.toString());
        if (theHand2.flush() == true)
        	System.out.println("Flush");
        else
        	System.out.println("Not a flush");
        
        theHand2.replaceCard(3, fourClubs);
        theHand2.replaceCard(4, fiveClubs);
        System.out.println("\n" + 
        		"Replaced the 2 of hearts with the 4 of clubs and " + 
        		"the 2 of spades with the 5 of clubs:" + "\n" + theHand2.toString());
        if (theHand2.flush() == true)
        	System.out.println("Flush");
        else
        	System.out.println("Not a flush");
    }

    /**
     * <p>
     * Name: testThreeOfAKind method
     * </p>
     * 
     * <p>
     * Description: tests the threeOfAKind method in the PokerHand class.
     * </p>
     */
    public static void testThreeOfAKind() {
        // cards to be used to test the various methods
        // in the PokerHand class
        Card twoClubs = new Card( 2 );
        Card twoDiamonds = new Card( 15 );
        Card twoHearts = new Card( 28 );
        Card twoSpades = new Card( 41 );
        Card threeClubs = new Card( 3 );
        Card fourClubs = new Card( 4 );
        Card fiveClubs = new Card( 5 );
        
        PokerHand theHand3 = new PokerHand(twoClubs, threeClubs, fourClubs, fiveClubs);
        System.out.println("\n" + "Testing threeOfAKind method:" + "\n" + "\n" + theHand3.toString());
        if (theHand3.threeOfAKind() == true)
        	System.out.println("Three of a kind");
        else
        	System.out.println("Not three of a kind");
        
        theHand3.replaceCard(2, twoDiamonds);
        theHand3.replaceCard(3, twoHearts);
        System.out.println("\n" + theHand3.toString());
        if (theHand3.threeOfAKind() == true)
        	System.out.println("Three of a kind");
        else
        	System.out.println("Not three of a kind");
        
        theHand3.replaceCard(3, threeClubs);
        theHand3.replaceCard(4, twoHearts);
        System.out.println("\n" + theHand3.toString());
        if (theHand3.threeOfAKind() == true)
        	System.out.println("Three of a kind");
        else
        	System.out.println("Not three of a kind");
        
        theHand3.replaceCard(2, threeClubs);
        theHand3.replaceCard(3, twoDiamonds);
        System.out.println("\n" + theHand3.toString());
        if (theHand3.threeOfAKind() == true)
        	System.out.println("Three of a kind");
        else
        	System.out.println("Not three of a kind");
        
        theHand3.replaceCard(1, threeClubs);
        theHand3.replaceCard(2, twoClubs);
        System.out.println("\n" + theHand3.toString());
        if (theHand3.threeOfAKind() == true)
        	System.out.println("Three of a kind");
        else
        	System.out.println("Not three of a kind");
    }

    /**
     * <p>
     * Name: testPair method
     * </p>
     * 
     * <p>
     * Description: tests the pair method in the PokerHand class.
     * </p>
     */
    public static void testPair() {
        // cards to be used to test the various methods
        // in the PokerHand class
        Card twoClubs = new Card( 2 );
        Card twoDiamonds = new Card( 15 );
        Card twoHearts = new Card( 28 );
        Card twoSpades = new Card( 41 );
        Card threeClubs = new Card( 3 );
        Card fourClubs = new Card( 4 );
        Card fiveClubs = new Card( 5 );

        PokerHand theHand4 = new PokerHand(twoClubs, threeClubs, fourClubs, fiveClubs);
        System.out.println("\n" + "Testing pair method:");
        System.out.println("\n" + theHand4.toString());
        if (theHand4.pair() == true)
        	System.out.println("Pair");
    	else System.out.println("Not a pair");
        
        theHand4.replaceCard(2, twoDiamonds);
        System.out.println("\n" + theHand4.toString());
        if (theHand4.pair() == true)
        	System.out.println("Pair");
    	else System.out.println("Not a pair");
        
        theHand4.replaceCard(2, fourClubs);
        theHand4.replaceCard(3, twoDiamonds);
        System.out.println("\n" + theHand4.toString());
        if (theHand4.pair() == true)
        	System.out.println("Pair");
    	else System.out.println("Not a pair");
        
        theHand4.replaceCard(3, fiveClubs);
        theHand4.replaceCard(4, twoDiamonds);
        System.out.println("\n" + theHand4.toString());
        if (theHand4.pair() == true)
        	System.out.println("Pair");
    	else System.out.println("Not a pair");
        
        theHand4.replaceCard(1, fiveClubs);
        theHand4.replaceCard(2, twoClubs);
        theHand4.replaceCard(3, twoDiamonds);
        theHand4.replaceCard(4, fourClubs);
        System.out.println("\n" + theHand4.toString());
        if (theHand4.pair() == true)
        	System.out.println("Pair");
    	else System.out.println("Not a pair");
        
        theHand4.replaceCard(3, fourClubs);
        theHand4.replaceCard(4, twoDiamonds);
        System.out.println("\n" + theHand4.toString());
        if (theHand4.pair() == true)
        	System.out.println("Pair");
    	else System.out.println("Not a pair");
        
        theHand4.replaceCard(2, fourClubs);
        theHand4.replaceCard(3, twoClubs);
        System.out.println("\n" + theHand4.toString());
        if (theHand4.pair() == true)
        	System.out.println("Pair");
    	else System.out.println("Not a pair");   
    }

    /**
     * <p>
     * Name: testLowCard method
     * </p>
     * 
     * <p>
     * Description: tests lowCard method in the PokerHand class.
     * </p>
     */
    public static void testLowCard() {
        // cards to be used to test the various methods
        // in the PokerHand class
        Card twoClubs = new Card( 2 );
        Card twoDiamonds = new Card( 15 );
        Card twoHearts = new Card( 28 );
        Card twoSpades = new Card( 41 );
        Card threeClubs = new Card( 3 );
        Card fourClubs = new Card( 4 );
        Card fiveClubs = new Card( 5 );

        PokerHand theHand5 = new PokerHand(twoClubs, threeClubs, fourClubs, fiveClubs);
        System.out.println("\n" + "Testing lowCard method:" + "\n" + "\n" + theHand5.toString());
        System.out.println("The low card is " + theHand5.lowCard() + "\n");
        
        theHand5.replaceCard(1, threeClubs);
        theHand5.replaceCard(2, twoClubs);
        System.out.println(theHand5.toString());
        System.out.println("The low card is " + theHand5.lowCard() + "\n");
        
        theHand5.replaceCard(2, fourClubs);
        theHand5.replaceCard(3, twoClubs);
        System.out.println(theHand5.toString());
        System.out.println("The low card is " + theHand5.lowCard() + "\n");
        
        theHand5.replaceCard(3, fiveClubs);
        theHand5.replaceCard(4, twoClubs);
        System.out.println(theHand5.toString());
        System.out.println("The low card is " + theHand5.lowCard() + "\n");
        
        theHand5.replaceCard(2, twoDiamonds);
        System.out.println(theHand5.toString());
        System.out.println("The low card is " + theHand5.lowCard() + "\n");
        
        
    }
}