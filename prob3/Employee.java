package prob3;

public class Employee {
	private double[] hours = new double[7];
	private String name = "";
	public Employee(String name){
		this.name = name;
	}
	public double getHours(int day){
		return hours[day];
	}
	public String getName(){
		return name;
	}
	public void setHours(int day,double hours){
		if(day < 7)
			this.hours[day] = hours;
	}
	public int numDaysWorked(){
		int count = 0;
		for(int i = 0; i < hours.length; i++){
			if(hours[i] > 0)
				count++;
		}
		return count;
	}
	public double totalHours(){
		double sum = 0;
		for(int i  = 0; i < hours.length; i++)
			sum+=hours[i];
		return sum;
	}
	public String toString(){
		String result = name + " worked " + numDaysWorked() + " for a total of " + totalHours() + " hours.";
		return result;
	}
}
