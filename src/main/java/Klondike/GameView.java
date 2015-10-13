package Klondike;

public class GameView implements View {
	private GameController gameController;

	public GameView(GameController gameController) {
		this.gameController = gameController;
	}

	@Override
	public void render() {
		do {
			if (gameController.getController() != null) {
				gameController.getController().recibir(this);
			}
		} while (gameController != null);
	}

	public void atender(MoveDeckToDiscardController moveDeckToDiscardController) {
		new MoveDeckToDiscardView(moveDeckToDiscardController).render();
	}

	public void atender(MoveDiscardToDeckController moveDiscardToDeckController) {
		new MoveDiscardToDeckView(moveDiscardToDeckController).render();
	}

	public void atender(MoveDiscardToStickController moveDiscardToStickController) {
		new MoveDiscardToStickView(moveDiscardToStickController).render();
	}

	public void atender(MoveDiscardToStairController moveDiscardToStairController) {
		new MoveDiscardToStairView(moveDiscardToStairController).render();
	}

	public void atender(MoveStairToStickController moveStairToStickController) {
		new MoveStairToStickView(moveStairToStickController).render();
	}

	public void atender(MoveStairToStairController moveStairToStairController) {
		new MoveStairToStairView(moveStairToStairController).render();
	}

	public void atender(MoveStickToStairController moveStickToStairController) {
		new MoveStickToStairView(moveStickToStairController).render();;
	}

	public void atender(MoveCoveredCardFromStairController moveCoveredCardFromStair) {
		new MoveCoveredCardFromStairView(moveCoveredCardFromStair).render();
	}
}
