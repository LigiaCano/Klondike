package Klondike;

public class StartView {

	private StartController startController;
	private IO io;
	private static final int OPTIONS = 9;

	public StartView(StartController startController) {
		this.startController = startController;
	}

	public void render() {
		int option = 0;
		do {
			showMenu();
			option = new LimitedIntDialog("Opcion?", 1, StartView.OPTIONS).read();
			if (option == StartView.OPTIONS) {
				System.exit(0);
			}
			startController.setOption(option);
			new Board().render();
		} while (option != 0);
	}

	private void showMenu() {
		io = new IO();
		io.writeln("1. Mover de baraja a descarte");
		io.writeln("2. Mover de descarte a baraja");
		io.writeln("3. Mover de descarte a palo");
		io.writeln("4. Mover de descarte a escalera");
		io.writeln("5. Mover de escalera a palo");
		io.writeln("6. Mover de escalera a escalera");
		io.writeln("7. Mover de palo a escalera");
		io.writeln("8. Voltear en escalera");
		io.writeln("9. Salir");
	}
}
