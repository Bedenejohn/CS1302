package prob2;

import java.util.ArrayList;

public class Warehouse_Tester {

	public static void main(String[] args) {
		Warehouse test = new Warehouse();
		Item a = new Item("Crackers",10);
		Item b = new RefrigeratedItem("Milk",10,32);
		Item c = new Item("Bread",5);
		Item d = new RefrigeratedItem("Meat",20,0);
		test.addItem(a);
		test.addItem(b);
		test.addItem(c);
		test.addItem(d);
		System.out.println("The number of items is: " + test.getNumItems());
		System.out.println("The info of a is: " + a.toString());
		System.out.println("The info of b is: " + b.toString());
		System.out.println("The info of c is: " + c.toString());
		System.out.println("The info of d is: " + d.toString());
		System.out.println("The number of refrigerated items is: " + test.getRefrigeratedItem().size());
		for(RefrigeratedItem item : test.getRefrigeratedItem())
			System.out.println(item.toString());
		System.out.println("The total cost of the items is: " + test.getTotalCost());
		System.out.println("The total cost of the refrigerated items is: " + test.getTotalCostRefrigerated());
		System.out.println(test.toString());
		Item e = new RefrigeratedItem("Cheese",20,10);
		test.addItem(e);
		System.out.println("The number of items is: " + test.getNumItems());
		System.out.println("The info of e is: " + e.toString());
		System.out.println("The number of refrigerated items is: " + test.getRefrigeratedItem().size());
		for(RefrigeratedItem item : test.getRefrigeratedItem())
			System.out.println(item.toString());
		System.out.println("The total cost of the items is: " + test.getTotalCost());
		System.out.println("The total cost of the refrigerated items is: " + test.getTotalCostRefrigerated());
		System.out.println(test.toString());
		

	}

}
