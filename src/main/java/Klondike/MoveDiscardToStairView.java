package Klondike;

public class MoveDiscardToStairView {
	
	private MoveDiscardToStairController moveDiscardToStairController;

	public MoveDiscardToStairView(MoveDiscardToStairController moveDiscardToStairController) {
		this.moveDiscardToStairController = moveDiscardToStairController;
	}

	public void render() {
		int stairNumber = new LimitedIntDialog("De qué escalera ? [1-7]: ", 1, 7).read();
		Card cardTopDiscard = moveDiscardToStairController.getBoard().getDiscards().getTopCardDiscard();
		Card cardTopStair = moveDiscardToStairController.getBoard().getStair()[stairNumber-1].getTopCardStair();
    	if (cardTopStair.getSuit().getColor() != cardTopDiscard.getSuit().getColor()) {
    		if (cardTopDiscard.getRank().getNumber() == (cardTopStair.getRank().getNumber() - 1)) {
    			moveDiscardToStairController.getBoard().getStair()[stairNumber-1].addCardToStair(cardTopDiscard);
    			moveDiscardToStairController.getBoard().getDiscards().removeCardFromDiscard(cardTopDiscard);
    		}
    	}
	}
}
