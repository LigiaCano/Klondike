package Klondike;

public class StartController extends Controller {

	GameController gameController;

	protected StartController(Board board) {
		super(board);
		gameController = new GameController(board);
	}

	public void setOption(int option) {
		this.gameController.setOption(option);
	}

}
