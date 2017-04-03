package prob2;

public class Item {
	protected String name;
	protected double weight;
	public Item(String name, double weight){
		this.name = name;
		this.weight = weight;
	}
	public double cost(){
		return 2 * weight;
	}
	public String getName(){
		return name;
	}
	public double getWeight(){
		return weight;
	}
	public String toString(){
		String result = String.format("name=%s cost=$%,.2f  weight=%,.2f", name,cost(),weight);
		return result;
	}
}
