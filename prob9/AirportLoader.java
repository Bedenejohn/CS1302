package prob1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportLoader {

	// Write this method. It should read the airport file and return
	// a list of Airports.
	public static List<Airport> getAirportList(String fileName){
		List<Airport> list = new ArrayList<>();
		try{
			Scanner scan = new Scanner(new File("src\\prob1\\" + fileName));
			while(scan.hasNext()){
				Airport a = new Airport(scan.next(),scan.nextDouble(),scan.nextDouble(),scan.next(),scan.next());
				if(!list.contains(a))
					list.add(a);
			}
			scan.close();
			return list;
		}
		catch(Exception e){
			System.out.print(e.toString());
			return list;
		}
	}
}
