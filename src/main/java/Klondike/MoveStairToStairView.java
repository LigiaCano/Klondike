package Klondike;

import java.util.ArrayList;

public class MoveStairToStairView {
	private MoveStairToStairController moveStairToStairController;
	private IO io;
	
	public MoveStairToStairView(MoveStairToStairController moveStairToStairController) {
		this.moveStairToStairController = moveStairToStairController;
	}

	public void render() {
		int stairNumber = new LimitedIntDialog("De qué escalera ? [1-7]: ", 1, 7).read();
    	int cardNumber = io.readInt("Cuantas cartas: ");
    	int stairNumber2 = new LimitedIntDialog("A qué escalera ? [1-7]: ", 1, 7).read();
    	int i=0;
    	ArrayList<Card> cardsTemp = new ArrayList<Card>();
    	for (i = 0; i < cardNumber; i++)
    	{
    		Card currentCard = moveStairToStairController.getBoard().getStair()[stairNumber-1].getTopCardStair();
    		cardsTemp.add(currentCard);
    		moveStairToStairController.getBoard().getStair()[stairNumber-1].removeCardFromStair(currentCard);
    	}
    	for (i = 0; i < cardNumber; i++)
    	{
    		Card currentCard = cardsTemp.get(cardsTemp.size() - 1);
    		moveStairToStairController.getBoard().getStair()[stairNumber2-1].addCardToStair(currentCard);
    		cardsTemp.remove(currentCard);
    	}

	}
}
