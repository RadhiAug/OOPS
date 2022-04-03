package org.system;

public class Desktop extends Computer{
	
public void desktopmodel() {
	System.out.println("The Desktop Model is Toshiba");
}
	
public void computermodel() {
	System.out.println("lenovo 9");
}
	public static void main(String[] args) {
		Desktop desk = new Desktop();
	    desk.computermodel();
	    desk.desktopmodel();
	}
	
}