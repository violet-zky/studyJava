package interfaceStudy;

public class keyBoard implements USB{
	@Override
	public void turnOn() {
		System.out.println("keyBoard turn on");
	}
	
	@Override
	public void turnOff() {
		System.out.println("keyBoard turn off");
	}
}
