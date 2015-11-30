package lm.designPattern.factory.method;

public class NYStylePizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		
		if(type.equals("cheese")){
			pizza = new NYStyleCheesePizza();
		}
		
		return pizza;
	}

}
