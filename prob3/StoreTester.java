package prob3;

public class StoreTester {
	public static void main(String[] args) {

		Store store = new Store();
		Employee e = new Employee("Dave");
		for(int i=1; i<6; i++) e.setHours(i, 8);
		store.addEmp(e);
		e = new Employee("Anna");
		e.setHours(6, 10);
		store.addEmp(e);
		e = new Employee("Paul");
		store.addEmp(e);
		System.out.println (store);
		e = store.getEmp(1);
		System.out.println (e);
		System.out.print(e.getName() + " worked: ");
		for(int i=0; i<7; i++) {
			System.out.print(e.getHours(i) + " ");
		}
		System.out.println();

	}
}
