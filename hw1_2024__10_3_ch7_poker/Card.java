package hw1_2024__10_3_ch7_poker;

public class Card {

	public Card(String cardFace, String cardSuit) {
		this.face = cardFace;
		this.suit = cardSuit;
	}
	private final String face;
	private final String suit;
	
	public String toString() {
		return face + " of " + suit;
	}
	
	public String getFace() {return face;}
	public String getSuit() {return suit;}
}
