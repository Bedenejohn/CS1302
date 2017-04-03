package prob2;

import java.util.ArrayList;
import java.util.Arrays;

public class MartianSortTester {

	public static void main(String[] args){
		// Some test code. You may need to modify/simplify to debug
		Martian r1 = new RedMartian(1);
		Martian r2 = new RedMartian(2);
		Martian r3 = new RedMartian(3);
		Martian r4 = new RedMartian(4);
		Martian r5 = new RedMartian(5);
		Martian r6 = new RedMartian(6);
		Martian r7 = new RedMartian(7);
		Martian g1 = new GreenMartian(1);
		Martian g2 = new GreenMartian(2);
		Martian g3 = new GreenMartian(3);
		Martian g4 = new GreenMartian(4);
		Martian g5 = new GreenMartian(5);
		Martian g6 = new GreenMartian(6);
		Martian g7 = new GreenMartian(7);

		ArrayList<Martian> martians = new ArrayList<>(Arrays.asList(
				g5, g3, r2, g2, r3, g7, r5, r1, r7, g1, g4, r4, r6, g6 ));

		System.out.println("Original Order:");
		printMartianList(martians);
		selectionSortRecursive(martians);
		System.out.println("Sorted:");
		printMartianList(martians);

		martians = new ArrayList<>(Arrays.asList(
				r5, r1, r4, r3, r7, r2, r6, g6, g7, g5, g2, g4, g1, g3 ));

		System.out.println("Original Order:");
		printMartianList(martians);
		selectionSortRecursive(martians);
		System.out.println("Sorted:");
		printMartianList(martians);

	}

	// The public method is written for you. You write the recursive
	// helper method which is next.
	public static void selectionSortRecursive(ArrayList<Martian> martians){
		if( martians.size() > 1 )
			selectionSortRecursive( martians, martians.size()-1 );
	}

	public static void selectionSortRecursive(ArrayList<Martian> martians, int endPos){
		if(endPos > 0){
			if(martians.get(endPos)instanceof GreenMartian)
				selectionSortRecursive(martians,endPos-1);
			else{
				for(int i = 0; i <=endPos; i++){
					if(martians.get(i)instanceof GreenMartian)
						continue;
					if(martians.get(i).compareTo(martians.get(endPos)) > 0){
						Martian m = martians.get(i);
						martians.set(i, martians.get(endPos));
						martians.set(endPos, m);
						
					}
				}
			}
			selectionSortRecursive(martians,endPos-1);
		}
	}

	// You can use this method to print the list of martians for debugging
	private static void printMartianList(ArrayList<Martian> martians) {
		StringBuilder sb = new StringBuilder();
		for(Martian m : martians) {
			if(m instanceof RedMartian)
				sb.append("R=");
			else
				sb.append("G=");
			sb.append(m.getId() + ", ");
		}
		sb.delete(sb.length()-2, sb.length());
		System.out.println(sb.toString());
	}

}
