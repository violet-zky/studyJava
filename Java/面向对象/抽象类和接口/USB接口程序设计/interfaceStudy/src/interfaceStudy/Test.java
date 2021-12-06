package interfaceStudy;

public class Test {
	public static void main(String[] args) {
		
		USB mouse = new Mouse();
		USB keyBoard = new keyBoard();
		USB mic = new Mic();
		
		Computer computer = new Computer();
		
		computer.add(mouse);
		computer.add(keyBoard);
		computer.add(mic);
		
		computer.turnOn();
		computer.turnOff();
	}
}
