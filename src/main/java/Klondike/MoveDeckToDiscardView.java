package Klondike;

public class MoveDeckToDiscardView {
	private MoveDeckToDiscardController moveDeckToDiscardController;

	public MoveDeckToDiscardView(MoveDeckToDiscardController moveDeckToDiscardController) {
		this.moveDeckToDiscardController = moveDeckToDiscardController;
	}

	public void render() {
		if (moveDeckToDiscardController.getBoard().getDeck().isEmpty()) {
			for (int i = 0; i < 3; i++) {
				Card currentCard = moveDeckToDiscardController.getBoard().getDeck().getTopCard();
				currentCard.setIsFaceUp(true);
				moveDeckToDiscardController.getBoard().getDiscards().addCard(currentCard);
				moveDeckToDiscardController.getBoard().getDeck().removeCard(currentCard);
			}
		}
	}

}
