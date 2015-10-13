package Klondike;

public class Card {

	private Rank rank;
	private TypeStick suit;
	private boolean isfaceUp;

	public Card(Rank rank, TypeStick suit, boolean isfaceUp) {
		this.rank = rank;
		this.suit = suit;
		this.isfaceUp = isfaceUp;
	}

	public Rank getRank() {
		return rank;
	}

	public TypeStick getSuit() {
		return suit;
	}

	public boolean isFaceUp() {
		return isfaceUp;
	}

	public void setIsFaceUp(boolean faceUp) {
		this.isfaceUp = faceUp;
	}

	public String toString() {
		if (isfaceUp)
			return "[" + getRank().getValue() + "," + getSuit().getValue() + "]";
		else
			return "[";
	}
}
