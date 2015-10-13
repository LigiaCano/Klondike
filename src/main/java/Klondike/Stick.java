package Klondike;

import java.util.ArrayList;

public class Stick {

	private ArrayList<Card> cards = new ArrayList<Card>();

	public boolean isEmpty() {
		return cards.isEmpty();
	}

	public Card getTopCardStick() {
		if (isEmpty()) {
			return null;
		}
		return cards.get(cards.size() - 1);
	}

	public void addCardToStick(Card card) {
		cards.add(card);
	}

	public void removeCardFromStick(Card card) {
		cards.remove(card);
	}

	public String toString() {
		String display = "";
		for (int i = 0; i < cards.size(); i++)
			display = display + cards.get(i).toString();
		return display;
	}
}
