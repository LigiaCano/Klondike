package Klondike;

public class MoveStickToStairView {
	private MoveStickToStairController moveStickToStairController;

	public MoveStickToStairView(MoveStickToStairController moveStickToStairController) {
		this.moveStickToStairController = moveStickToStairController;
	}

	public void render() {
		int option = new LimitedIntDialog("A qué escalera ? [1-7]: ", 1, 7).read();

		Card cardSelected = moveStickToStairController.getBoard().getStick()[option - 1].getTopCardStick();
		int stickFromNumber = new LimitedIntDialog("De qué palo ? [1-4]: ", 1, 4).read();
		int stairToNumber = new LimitedIntDialog("A qué escalera ? [1-7]: ", 1, 7).read();
		moveStickToStairController.getBoard().getStair()[stairToNumber - 1].addCardToStair(cardSelected);
		moveStickToStairController.getBoard().getStick()[stickFromNumber - 1].removeCardFromStick(cardSelected);
	}

}
