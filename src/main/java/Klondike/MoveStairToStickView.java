package Klondike;

public class MoveStairToStickView {
	private MoveStairToStickController moveStairToStickController;

	public MoveStairToStickView(MoveStairToStickController moveStairToStickController) {
		this.moveStairToStickController = moveStairToStickController;
	}

	public void render() {
		int stairNumber = new LimitedIntDialog("De qué escalera ? [1-7]: ", 1, 7).read();
		Card cardSelected = moveStairToStickController.getBoard().getStair()[stairNumber - 1].getTopCardStair();
		Card cardTopstick = moveStairToStickController.getBoard().getStick()[cardSelected.getSuit().getNumber()]
				.getTopCardStick();
		if (cardSelected.getRank().getNumber() == (cardTopstick.getRank().getNumber() - 1)) {
			moveStairToStickController.getBoard().getStick()[cardSelected.getSuit().getValue()]
					.addCardToStick(cardSelected);
			moveStairToStickController.getBoard().getStair()[stairNumber - 1].removeCardFromStair(cardSelected);
		}

	}

}
