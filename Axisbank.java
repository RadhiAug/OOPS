package week2.Day1;

public class Axisbank extends Bankinfo {

	public void deposit(int depo) {
		System.out.println("3500");
	}
public static void main(String[] args) {
	Axisbank AB = new Axisbank();
	AB.fixed(10);
	AB.saving(12);
	AB.deposit(0);
}
}


