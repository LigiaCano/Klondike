package Klondike;

public class GameController extends Controller {

	private int option;
	private Board board;
	private GameController[] game;

	protected GameController(Board board) {
		super(board);
		assert board != null;
		this.board = board;
		setControllers();
	}

	private void setControllers() {
		game[0] = new MoveDeckToDiscardController(board);
		game[1] = new MoveDiscardToDeckController(board);
		game[2] = new MoveDiscardToStickController(board);
		game[3] = new MoveDiscardToStairController(board);
		game[4] = new MoveStairToStickController(board);
		game[5] = new MoveStairToStairController(board);
		game[6] = new MoveStickToStairController(board);
		game[7] = new MoveCoveredCardFromStairController(board);
	}

	public void setOption(int option) {
		this.option = option;
	}

	public GameController getController() {
		return game[this.option];
	}

	public View recibir(View gameView) {
		return gameView;
	}

}
