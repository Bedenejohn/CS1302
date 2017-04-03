package prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AirportManager {
	List<Airport> list = new ArrayList<Airport>();
	public AirportManager(List<Airport> list){
		this.list = list;
	}
	public Airport getAirport(String code){
		if(list.contains(new Airport(code))){
			return list.get(list.indexOf(new Airport(code)));
		}
		return null;
	}
	public double getDistanceBetween(Airport a1,Airport a2){
		return DistanceCalculator.getDistance(a1.getCord1(), a1.getCord2(), a2.getCord1(), a2.getCord2());
	}
	public double getDistanceBetween(String code1,String code2){
			Airport a1 = getAirport(code1);
			Airport a2 = getAirport(code2);
			return getDistanceBetween(a1,a2);
	}
	public Airport getAirportClosestTo(String code){
			Airport a = getAirport(code);
			Airport c = new Airport(code);
			double distance = Integer.MAX_VALUE;
			for(Airport b : list){
				if(Math.abs(getDistanceBetween(a,b)) < distance && !a.equals(b)){
					distance = Math.abs(getDistanceBetween(a,b));
					c = b;
				}
			}
			return c;
	}
	public List<Airport> getAirportsWithin(String code,double withinDist){
		List<Airport> withinDistList = new ArrayList<Airport>();
		Airport b = getAirport(code);
		for(Airport a : list){
			if(getDistanceBetween(a,b) <= withinDist && !b.equals(a)){
				withinDistList.add(a);
			}
		}
		return withinDistList;
	}
	public List<Airport> getAirportsWithin(String code1,String code2, double withinDist){
		List<Airport> list = getAirportsWithin(code1,withinDist);
		list.retainAll(getAirportsWithin(code2,withinDist));
		return list;
	}
	public List<Airport> getAirportsSortedBy(String sortType){
		AirportCityComparator a = new AirportCityComparator();
		AirportStateComparator b  = new AirportStateComparator();
		List<Airport> sortList = new ArrayList<Airport>(list);
		switch(sortType){
		case "City": Collections.sort(sortList, a);break;
		case "State": Collections.sort(sortList, b);break;
		}
		return sortList;
	}
	public List<Airport> getAirportsClosestTo(String code,int num){
		List<Airport> listClosest = new ArrayList<Airport>();
		Airport b = getAirport(code);
		int place = 0;
		double distance = Integer.MAX_VALUE;
		for(int i = 0; i < num; i++){
			for(int j = 0; j < list.size(); j++){
				if(getDistanceBetween(b,list.get(j)) < distance && (!listClosest.contains(list.get(j)) && !list.get(j).equals(getAirport(code)))){
					distance = getDistanceBetween(b,list.get(j));
					place = j;
				}
			}
			listClosest.add(list.get(place));
			distance = Integer.MAX_VALUE;
		}
		return listClosest;
	}
}
