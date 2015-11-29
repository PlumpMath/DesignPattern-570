package lm.dp.welcom;

public class MallardDuck extends Duck{
	public MallardDuck() {
		flyAbility = new FlyWithWings();
		quackAbility = new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("MallardDuck");
	}

}
