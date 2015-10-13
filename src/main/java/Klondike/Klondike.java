package Klondike;

public class Klondike {

	private Board board;

	private StartController startController;

	private GameController gameController;

	private StartView startView;

	private GameView gameView;

	public Klondike() {
		board = new Board();
		gameController = new GameController(board);
		startController = new StartController(board);
		startView = new StartView(startController);
		gameView = new GameView(gameController);
	}

	private void play() {
		startView.render();
		gameView.render();
	}

	public static void main(String[] args) {
		new Klondike().play();
	}
}
