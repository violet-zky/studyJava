package interfaceStudy;
/*
 * @Override
 * 1、可以当注释用,方便阅读；
 * 2、编译器可以给你验证@Override下面的方法名是否是你父类中所有的，如果没有则报错。
 * 
 */
public class Mouse implements USB{
	@Override
	public void turnOn() {
		System.out.println("mouse turn on");
	}
	
	@Override
	public void turnOff() {
		System.out.println("mouse turn off");
	}

}
