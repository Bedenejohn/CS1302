package prob3;

public class Store {
	private Employee[] emps = new Employee[20];
	private int numEmps = 0;
	
	public int getNumEmps(){
		return numEmps;
	}
	public Employee getEmp(int i){
			return emps[i-1];
	}
	public void addEmp(Employee e){
		if(numEmps <= 20){
			numEmps++;
			emps[numEmps-1] = e;
		}
	}
	public double totalHours(){
		double total = 0;
		for(int i = 0; i < numEmps; i++)
			total += emps[i].totalHours();
		return total;
	}
	public String toString(){
		String result = "Num Employees: " + numEmps;
		for(int i = 0; i < numEmps; i++)
			result += "\n" + emps[i].toString();
		result += "\nTotal Hours Worked = " + totalHours();
		return result;
	}
}
