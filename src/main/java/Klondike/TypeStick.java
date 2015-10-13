package Klondike;

public enum TypeStick {
	Oro('o', "rojo", 0), 
	Copa('c', "negro", 1), 
	Espada('e', "rojo", 2), 
	Basto('b', "negro", 3);
	private char value;
	private String color;
	private int number;

	private TypeStick(char value, String color, int number) {
		this.value = value;
		this.color = color;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public char getValue() {
		return value;
	}

	public String getColor() {
		return color;
	}
}
