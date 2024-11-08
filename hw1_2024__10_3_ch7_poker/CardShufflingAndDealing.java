package hw1_2024__10_3_ch7_poker;

public class CardShufflingAndDealing {

	public static void main(String[] args) {
		//deal two hands of cards
		final int hand = 5;
		DeckOfCards deck = new DeckOfCards();
		deck.Shuffle();
		Card[][] Hands = new Card[2][];
		Hands[0] = new Card [hand];
		Hands[1] = new Card [hand];
		System.out.printf(" First hand           Second hand%n%n");
		for(int i=0;i<hand;i++) {
			Hands[0][i] = deck.deal();
			Hands[1][i] = deck.deal();
			
			System.out.printf("%-19s  %-19s%n", Hands[0][i].toString(), Hands[1][i].toString());
		}
		
		int[] point = new int[2];
		String[] type = {"null", "Pair", "Two Pair", "Three of a kind", "Straight", "Fulsh", "FullHouse", "Four of a kind"};
		for(int i = 0; i<2;i++) {
			if(deck.FourOfAKind(Hands[i])) { point[i] = 7;}
			else if(deck.FullHouse(Hands[i])) { point[i] = 6;}
			else if(deck.Fulsh(Hands[i])) { point[i] = 5;}
			else if(deck.Straight(Hands[i])) {point[i] = 4;}
			else if(deck.ThreeOfAKind(Hands[i])) {point[i] = 3;}
			else if(deck.TwoPair(Hands[i])) {point[i] = 2;}
			else if(deck.Pair(Hands[i])){point[i] = 1;}
			else { point[i] = 0;}
		}
		System.out.println("-----------------------");
		System.out.printf("%n%s v.s. %s%n%n", type[point[0]], type[point[1]]);
		if(point[0] > point[1]) {System.out.printf("First Hand Win !!%n");}
		if(point[1] > point[0]) {System.out.printf("Second Hand Win !!%n");}
	}

}
