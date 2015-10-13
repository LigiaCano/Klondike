package Klondike;

public class Board {

	private Deck deck = new Deck();
	private Discards discard = new Discards();
	private static final int NUMBERSUITS = 4;
	public static final int NUMBERSTICK = 7;
	private Stair[] stair = new Stair[NUMBERSTICK];
	private Stick[] stick = new Stick[NUMBERSUITS];

	public Board() {
		createSuits();
		createStick();
	}

	private void createSuits() {
		for (int i = 0; i < NUMBERSUITS; i++) {
			stick[i] = new Stick();
		}
	}

	private void createStick() {
		int n = NUMBERSTICK;
		for (int i = 0; i < NUMBERSTICK; i++) {
			stair[i] = new Stair();
			for (int j = 0; j < n; j++) {
				Card currentCard = deck.getTopCard();// next();
				if (j == (n - 1))
					currentCard.setIsFaceUp(true);
				stair[i].addCardToStair(currentCard);
				deck.removeCard(currentCard);
			}
			n--;
		}
	}

	public boolean existKlondike() {
		return deck.isEmpty() & discard.isEmpty();
	}

	public Deck getDeck() {
		return deck;
	}

	public Discards getDiscards() {
		return discard;
	}

	public Stair[] getStair() {
		return stair;
	}

	public Stick[] getStick() {
		return stick;
	}

	public void render() {
		IO io = new IO();
		io.writeln("Baraja: " + deck.toString());
		io.writeln("Descarte: " + discard.toString());
		io.writeln("Palo oros: " + stick[0].toString());
		io.writeln("Palo copas: " + stick[1].toString());
		io.writeln("Palo espadas: " + stick[2].toString());
		io.writeln("Palo bastos: " + stick[3].toString());
	}

}
