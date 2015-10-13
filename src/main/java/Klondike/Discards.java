package Klondike;

import java.util.ArrayList;

public class Discards {

	public Discards() {
		isEmpty();
	}

	private ArrayList<Card> cards = new ArrayList<Card>();

	public void addCard(Card card) {
		cards.add(card);
	}

	public Card getTopCardDiscard() {
		if (isEmpty()) {
			return null;
		}
		return cards.get(cards.size() - 1);
	}

	public String toString() {
		String display = "";
		for (int i = 0; i < cards.size(); i++)
			display = display + cards.get(i).toString();
		return display;
	}

	public void removeCardFromDiscard(Card card) {
		cards.remove(card);
	}

	public boolean isEmpty() {
		return cards.isEmpty();
	}
}
