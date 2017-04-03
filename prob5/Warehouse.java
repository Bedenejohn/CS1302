package prob2;
import java.util.*;
public class Warehouse {
	private ArrayList<Item> items = new ArrayList<>();
	public Warehouse(){
		
	}
	public void addItem(Item item){
		items.add(item);
	}
	public int getNumItems(){
		return items.size();
	}
	public ArrayList<RefrigeratedItem> getRefrigeratedItem(){
		ArrayList<RefrigeratedItem> refItem = new ArrayList<>();
		for(Item item : items){
			if(item instanceof RefrigeratedItem)
				refItem.add((RefrigeratedItem)item);
		}
		return refItem;
	}
	public double getTotalCost(){
		double total = 0;
		for(Item item : items){
			total += item.cost();
		}
		return total;
	}
	public double getTotalCostRefrigerated(){
		double total = 0;
		for(RefrigeratedItem item : getRefrigeratedItem()){
			total += item.cost();
		}
		return total;
	}
	public String toString(){
		String result = "";
		for(Item item : items){
			result += item.toString() + "\n";
		}
		return result;
	}
}
