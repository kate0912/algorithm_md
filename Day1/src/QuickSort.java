import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int n = scann.nextInt();
		Random rand = new Random();
		int array[] = new int[n];
		for(int i=0; i<array.length; i++) {
			array[i] = rand.nextInt(100);
		}
		
		long start = System.currentTimeMillis();
		quick_sort(array, 0, array.length-1);
		//Arrays.sort(array);
		print_array(array);
		System.out.println("실행 시간: "+(System.currentTimeMillis()-start)/1000.0f);

	}

	public static void quick_sort(int[] array, int s, int e) {
		if(s<e) {
			int p = s, l = s+1, r = e;
			while (l<=r) {
				while (l<=e && array[l]<=array[p]) l++;
				while (r>=s+1 && array[r]>=array[p]) r--;
				if(l<r) swap(array, l, r);
			}
			swap(array, p, r);
			quick_sort(array, s, r-1);
			quick_sort(array, r+1, e);
			
		}
	}
	
	public static void print_array(int[] array) {
		for(int n : array){
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
	public static void swap(int[] array, int a, int b) {
		int t = array[a];
		array[a] = array[b];
		array[b] = t;
	}

}
