import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
	public static int k;
	public static int array[];
	
	public static void main(String[] args) {
		Scanner scann =  new Scanner(System.in);
		//Random rand = new Random();
		array = new int[scann.nextInt()];

		k = scann.nextInt();
		for(int i=0; i<array.length; i++) {
			array[i] = i;
		}
		System.out.println(find(0, array.length-1));
		
		print_array(array);
	}

	public static int find(int s, int e) {
		while(s<=e) {
			int m = (s+e)/2;
			if(array[m] == k) return m+1;
			if(array[m] > k) e=m-1;
			else s=m+1;
		}
		return -1;
	}
	
	public static void print_array(int[] s) {
		for(int n : s){
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
