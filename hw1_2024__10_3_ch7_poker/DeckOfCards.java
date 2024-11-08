package hw1_2024__10_3_ch7_poker;

import java.security.SecureRandom;
public class DeckOfCards {
	private static final SecureRandom randomNumbers = new SecureRandom();
	private static final int NUMBER_OF_CARDS = 52;
	
	private Card[] deck = new Card[NUMBER_OF_CARDS];
	private int currentCard = 0;
	
	public static final String[] faces = {"Ace", "Deuce", "Tree", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	public static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	
	public DeckOfCards() {                                                                          
		for(int i=0;i<deck.length;i++) {
			deck[i]= new Card(faces[i%13], suits[i/13]);
		}
	}

	public void Shuffle() {
		Card cardtemp;
		currentCard = 0;
		int secCard;
		for(int fir = 0; fir<NUMBER_OF_CARDS;fir++) {
			secCard = randomNumbers.nextInt(NUMBER_OF_CARDS);
			cardtemp = deck[fir];
			deck[fir] = deck[secCard];
			deck[secCard] = cardtemp;
		}
	}
	
	public Card deal() {
		if(currentCard<NUMBER_OF_CARDS) {
			return deck[currentCard++];
		}else {
			return null;
		}
	}
	
	//turn face to numbers
	private int findFaces(String word) {
		for(int i=0;i<13;i++) {
			if(word == faces[i]) {	return i;}
		}
		System.exit(0);
		return -1;
	}
	
	//turn suit to numbers
	private int findSuit(String word) {
		for(int i=0; i<4;i++) {
			if(word == suits[i]) {return i; }
		}
		System.exit(0);
		return -1;
	}
	//determine pair
	public boolean Pair(Card[] hand) {
		//count face
		int[] countFaces = new int[13];
		for(Card c : hand) {
			//System.out.printf("%-19s  ", c);
			;
			if(++countFaces[findFaces(c.getFace())] >= 2) {
				//System.out.printf("%s ", c.getFace());
				return true;
			}
		}
		return false;
	}
	
	public boolean TwoPair(Card[] hand) {
		//count faces
		int[] countFaces = new int[13];
		int pair = 0;
		for(Card c : hand) {
			//System.out.printf("%-19s  ", c);
			if(++countFaces[findFaces(c.getFace())] >= 2) {
				//System.out.printf("%s ", c.getFace());
				pair++;
			}
		}
		if(pair == 2) {
			return true;
		}
		return false;
	}
	
	public boolean ThreeOfAKind(Card[] hand) {
		//count faces
		int[] countFaces = new int[13];
		for(Card c : hand) {
			if(++countFaces[findFaces(c.getFace())] >= 3) {
				//System.out.printf("%s ", c.getFace());
				return true;
			}
		}
		return false;
	}
	
	public boolean FourOfAKind(Card[] hand) {
		int[] countFaces = new int[13];
		for(Card c: hand) {
			if(++countFaces[findFaces(c.getFace())] == 4) {
				return true;
			}
		}
		return false;
	}
	
	public boolean Fulsh(Card[] hand) {
		int suit = findSuit(hand[0].getSuit());
		int i=0;
		for(Card c: hand) {
			if(findSuit(c.getSuit()) != suit) {return false;}
			i++;
		}
		return true;	
	}
	
	public boolean Straight(Card[] hand) {
		int[] countFaces = new int[13];
		int conse = 0;
		for(Card c: hand) {countFaces[findFaces(c.getFace())]++; }
		for(int i : countFaces) {
			if(i>0) {conse++; }
			else {conse = 0; }
			if(conse == 5) {return true;}
		}
		return false;
	}
	
	public boolean FullHouse(Card[] hand) {
		int[] countFaces = new int[13];
		int[] rule = {0, 0};
		for(Card c: hand) {countFaces[findFaces(c.getFace())]++; }
		for(int i: countFaces) {
			if(i == 2) {rule[0]++;}
			if(i == 3) {rule[1]++;}
		}
		if(rule[0] > 0 && rule[1] > 0) {return true;}
		return false;
	}
}
