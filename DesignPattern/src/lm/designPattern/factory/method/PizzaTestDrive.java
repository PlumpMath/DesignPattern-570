package lm.designPattern.factory.method;

public class PizzaTestDrive {
	static public void main(String[] args){
		PizzaStore nystore = new NYStylePizzaStore();
		nystore.orderPizza("cheese");
	}
}
