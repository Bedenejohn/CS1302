package prob1;

import java.util.Comparator;

public class AirportStateComparator implements Comparator<Airport> {
	public int compare(Airport a1,Airport a2){
		if(a1.getState().equals(a2.getState())){
			return a1.getCity().compareTo(a2.getCity());
		}
		return a1.getState().compareTo(a2.getState());
	}
}
