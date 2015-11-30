package lm.designPattern.factory.method;

import java.util.*;

abstract public class Pizza {
	protected String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<String>();
	
	public String getName(){
		return name;
	}
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for(int i = 0; i < toppings.size(); i++){
			System.out.println("    "+ toppings.get(i));
		}
	}
	
	public void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cut the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String toString(){
		//code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("--- " + name + "---\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++){
			display.append(toppings.get(i));
		}
		return display.toString();
	}
	

}
