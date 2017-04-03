package prob1;
import java.util.*;
public class MartianManager {
	ArrayList<Martian> list = new ArrayList<>();
	ArrayList<ITeleporter> listTele = new ArrayList<>();
	public void addMartian(Martian m){
		list.add(m);
	}
	public Object clone(){
		Object result = this.clone();
		return result;
	}
	public Martian getMartianClosestTo(int id){
		int min = Math.abs(list.get(0).getId() - id);
		int placeholder = 0;
		for(int i = 1; i < list.size(); i++){
			if(Math.abs(list.get(i).getId() - id) < min)
				placeholder = i;
		}
		return list.get(placeholder);
	}
	public String groupSpeak(){
		String result = "";
		for(int i = 0; i < list.size(); i++){
			result += String.format("\n%s", list.get(i).toString());
		}
		return result;
	}
	public String groupTeleport(String dest){
		String result = "";
		for(int i = 0; i <list.size(); i++){
			if(list.get(i) instanceof GreenMartian){
				ITeleporter m = (ITeleporter)list.get(i);
				result += String.format("\n%s", m.teleporter(dest));
				listTele.add(m);
			}
		}
		return result;
	}
	public void obliterateTeleporters(){
		listTele.clear();
		for(int i = 0; i < list.size(); i ++){
			if(list.get(i) instanceof GreenMartian)
				list.remove(i);
		}
	}

}
