package Klondike;

import java.util.ArrayList;

public class Stair {
	private ArrayList<Card> cards = new ArrayList<Card>();

	public Card getCard(int i) {
		return cards.get(i);
	}

	public void addCardToStair(Card card) {
		cards.add(card);
	}

	public Card getTopCardStair() {
		if (isEmpty()) {
			return null;
		}
		return cards.get(cards.size() - 1);
	}

	public void removeCardFromStair(Card card) {
		cards.remove(card);
	}

	public String toStringInitial(int number) {
		String display = "";
		// for (int i = 0; i < cards.length - 1; i++)
		for (int i = 0; i < number - 1; i++) {
			display = display + "[";
		}
		// display = display + cards[cards.length - 1].toString();
		display = display + cards.get(number - 1).toString();
		return display;
	}

	public String toString() {
		String display = "";
		for (int i = 0; i < cards.size(); i++)
			display = display + cards.get(i).toString();
		return display;
	}

	public boolean isEmpty() {
		return cards.isEmpty();
	}
}
