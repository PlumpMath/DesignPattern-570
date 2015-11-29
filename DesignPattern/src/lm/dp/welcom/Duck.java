package lm.dp.welcom;

public abstract class Duck {
	FlyAbility flyAbility;
	QuackAbility quackAbility;
	
	public void performFly() {
		flyAbility.fly();
	}
	public void performQuack() {
		quackAbility.quack();
	}
	
	public void setFly(FlyAbility fa) {
		flyAbility = fa;
	}
	
	public void setQuack(QuackAbility qa) {
		quackAbility = qa;
	}
	abstract public void display();
}
