import java.util.Scanner;

public class Problem3 {
	public static int array[];
	public static int find;
	public static void main(String[] args) {
		/*
		 * n개로 이루어진 정수 집합에서 원하는 수의 위치를 찾으시오.
		 * 단, 입력되는 집합은 오름차순으로 정렬되어 있으며, 같은 수는 없다.
		 */
		Scanner scann = new Scanner(System.in);
		array = new int[scann.nextInt()];
		for(int i=0; i<array.length; i++) {
			array[i] = scann.nextInt();
		}
		find = scann.nextInt();
		System.out.println(solve(0, array.length));
	}
	
	
	public static int solve(int s, int e) {
		int m = 0;
		while (e>=s) {
			m = (s+e)/2;
			if(array[m] == find)
				return m+1;
			if(array[m] < find) s=m+1;
			else e=m-1;
		}
		return -1;
	}

}
