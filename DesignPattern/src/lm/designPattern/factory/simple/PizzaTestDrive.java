package lm.designPattern.factory.simple;

public class PizzaTestDrive {
	static public void main(String[] args){
		SimplePizzaFactory factory = new SimplePizzaFactory();
		
		PizzaStore store = new PizzaStore(factory);
		
		Pizza p = store.orderPizza("cheese");
		System.out.println(p);
	}
}
