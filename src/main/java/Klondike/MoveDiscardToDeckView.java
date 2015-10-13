package Klondike;

public class MoveDiscardToDeckView {
	
	
	private MoveDiscardToDeckController moveDiscardToDeckController;

	public MoveDiscardToDeckView(MoveDiscardToDeckController moveDiscardToDeckController) {
		this.moveDiscardToDeckController = moveDiscardToDeckController;
	}

	public void render() {
		while (!moveDiscardToDeckController.getBoard().getDiscards().isEmpty()) {
			Card currentCard = moveDiscardToDeckController.getBoard().getDiscards().getTopCardDiscard();
			moveDiscardToDeckController.getBoard().getDeck().addCard(currentCard);
			moveDiscardToDeckController.getBoard().getDiscards().removeCardFromDiscard(currentCard);
		}
	}

}
