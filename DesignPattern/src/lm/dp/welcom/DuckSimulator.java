package lm.dp.welcom;

public class DuckSimulator {
	public static void main(String[] args) {
		Duck d1 = new MallardDuck();
		d1.display();
		d1.performFly();
		d1.performQuack();
		d1.setFly(new FlyNoWay());
		d1.performFly();
	}
}
