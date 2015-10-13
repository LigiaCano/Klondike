package Klondike;

public class MoveCoveredCardFromStairView {
	private MoveCoveredCardFromStairController moveCoveredCardFromStairController;

	public MoveCoveredCardFromStairView(MoveCoveredCardFromStairController moveCoveredCardFromStairController) {
		this.moveCoveredCardFromStairController = moveCoveredCardFromStairController;
	}
	public void render() {

		int stairNumber = new LimitedIntDialog("De qué escalera ? [1-7]: ", 1, 7).read();
		moveCoveredCardFromStairController.getBoard().getStair()[stairNumber-1].getTopCardStair().setIsFaceUp(true); 	
	}
}
