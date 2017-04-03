package prob1;

import java.util.ArrayList;

public class BinarySearchTester {
	public static void main( String[] args ) {
		// Sample code to create a sorted Blob list with
		// 5 twins (10 elements).
		ArrayList<Blob> blobs = buildBlobList(5);
		printBlobList(blobs);
		System.out.println(binarySearch(blobs,new Blob(3),new Blob(5)));
		// Write code to test here.
	}

	public static int binarySearch( ArrayList<Blob> blobs, Blob bKey1, Blob bKey2 ) {
		int size = blobs.size()/2;
		if(size%2 == 1)
			size = size - 1;
		if((blobs.get(size).getCoolnessFactor() + blobs.get(size+1).getCoolnessFactor()) == (bKey1.getCoolnessFactor() + bKey2.getCoolnessFactor()))
			return size;
		else{
			if((blobs.get(size).getCoolnessFactor() + blobs.get(size+1).getCoolnessFactor()) > (bKey1.getCoolnessFactor() + bKey2.getCoolnessFactor()))
				return binarySearchHelper(blobs,(bKey1.getCoolnessFactor() + bKey2.getCoolnessFactor()), size/2);
			else
				return binarySearchHelper(blobs,(bKey1.getCoolnessFactor() + bKey2.getCoolnessFactor()), size + ((blobs.size() - size)/2));
		}
		// Write code here to implement as described in problem description.
		// Need to write a recursive helper method also.
	}
	public static int binarySearchHelper(ArrayList<Blob> blobs, int key, int mid){
		if(mid == 0 || mid == blobs.size()-1)
			return -1;
		if(mid%2 ==1)
			mid = mid - 1;
		if(blobs.get(mid).getCoolnessFactor() + blobs.get(mid+1).getCoolnessFactor() == key)
			return mid;
		else{
			if(blobs.get(mid).getCoolnessFactor() + blobs.get(mid+1).getCoolnessFactor() > key)
				return binarySearchHelper(blobs,key,mid/2);
			else
				return binarySearchHelper(blobs,key,mid + ((blobs.size() - mid)/2));
		}
	}
	// You may use this method to build and return a sorted Blob
	// list based on sum of coolness factor for each of the twins. 
	// Creates "numTwins" twins (i.e. 2*numTwins elements)
	private static ArrayList<Blob> buildBlobList(int numTwins) {
		ArrayList<Blob> blobs = new ArrayList<>();
		int cNess = 2;
		for(int i=1; i<=numTwins; i++) {
			Blob b1 = new Blob(cNess);
			cNess+=2;
			Blob b2 = new Blob(cNess--);
			blobs.add(b1);
			blobs.add(b2);
		}
		return blobs;
	}

	// You may use this method to print a blob list in a way that 
	// emphasizes the twins and the sum of their coolness factors.
	private static void printBlobList(ArrayList<Blob> blobs) {
		StringBuilder sb = new StringBuilder("Sorted Blob list:\n");
		for(int i=0; i<blobs.size(); i+=2) {
			int cNess1 = blobs.get(i).getCoolnessFactor();
			int cNess2 = blobs.get(i+1).getCoolnessFactor();
			int twinPower = cNess1 + cNess2;
			sb.append(String.format("B(%d)+B(%d)=%d, ", cNess1, cNess2, twinPower));
		}
		sb.delete(sb.length()-2, sb.length());
		System.out.println(sb.toString());
	}
}

