package prob2;

public class RefrigeratedItem extends Item{
	protected double temp;
	public RefrigeratedItem(String name, double weight, double temp){
		super(name,weight);
		this.temp = temp;
	}
	@Override
	public double cost(){
		return weight * 2 + (100-temp) * 0.1;
	}
	public double getTemp(){
		return temp;
	}
	@Override
	public String toString(){
		String result = String.format("name=%s, cost=$%,.2f, weight=%,.2f, temp=%,.2f degrees", name,cost(),weight,temp);
		return result;
	}
}
