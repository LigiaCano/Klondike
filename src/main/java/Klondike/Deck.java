package Klondike;

import java.util.ArrayList;
import java.util.Collections;


public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>(52);

	private int i = 0;

	public Deck() {
		for (TypeStick tmp : TypeStick.values()) {
			for (Rank rank : Rank.values()) {
				cards.add(new Card(rank, tmp, false));
			}
		}
		shuffle();
	}

	public Card getCard() {
		return cards.get(i);
	}

	public Card getTopCard() {
		if (isEmpty()) {
			return null;
		}
		return cards.get(cards.size() - 1);
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card next() {
		return cards.get(i++);
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public void removeCard(Card card) {
		cards.remove(card);
	}

	public int size() {
		return cards.size();
	}

	public boolean isEmpty() {
		return cards.isEmpty();
	}

	public String toString() {
		if (!isEmpty())
			return "[X,X]";
		else
			return "";

	}
}