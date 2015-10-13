package Klondike;

public class MoveDiscardToStickView {

	private MoveDiscardToStickController moveDiscardToStickController;

	public MoveDiscardToStickView(MoveDiscardToStickController moveDiscardToStickController) {
		this.moveDiscardToStickController = moveDiscardToStickController;
	}

	public void render() {
		Card cardTopDiscard = moveDiscardToStickController.getBoard().getDiscards().getTopCardDiscard();
		Card cardTopStair = moveDiscardToStickController.getBoard().getStair()[cardTopDiscard.getSuit().getNumber()].getTopCardStair();
		if (!moveDiscardToStickController.getBoard().getStair()[cardTopDiscard.getSuit().getNumber()].isEmpty()) {
			if (cardTopStair.getSuit().getColor() != cardTopDiscard.getSuit().getColor()) {
				if (cardTopDiscard.getRank().getNumber() == (cardTopStair.getRank().getNumber() - 1)) {
					moveDiscardToStickController.getBoard().getStair()[cardTopDiscard.getSuit().getNumber()].addCardToStair(cardTopDiscard);
					moveDiscardToStickController.getBoard().getDiscards().removeCardFromDiscard(cardTopDiscard);
				}
			}
		}
		
	}
}
