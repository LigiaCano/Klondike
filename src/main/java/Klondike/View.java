package Klondike;

public interface View {

	void render();

	void atender(MoveDeckToDiscardController moveDeckToDiscardController);

	void atender(MoveDiscardToDeckController moveDiscardToDeckController);

	void atender(MoveDiscardToStickController moveDiscardToStickController);

	void atender(MoveDiscardToStairController moveDiscardToStairController);

	void atender(MoveStairToStickController moveStairToStickController);

	void atender(MoveStairToStairController moveStairToStairController);

	void atender(MoveStickToStairController moveStickToStairController);

	void atender(MoveCoveredCardFromStairController moveCoveredCardFromStair);
}
