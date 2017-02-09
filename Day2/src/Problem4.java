import java.util.Scanner;

public class Problem4 {
	public static int array[];
	public static int find;
	public static void main(String[] args) {
		// lower bound
		// n개로 이루어진 정수 집합에서 원하는 수 k 이상인 수가 처음으로 등장하는 위치를 찾으시오.
		// 단, 입력되는 집합은 오름차순으로 정렬되어 있으며, 같은 수가 여러 개 존재할 수 있다.
		Scanner scann = new Scanner(System.in);
		array = new int[scann.nextInt()];
		for(int i=0; i<array.length; i++)
			array[i] = scann.nextInt();
		find = scann.nextInt();
		System.out.println(solve(0, array.length)+1);
	}

	public static int solve(int s, int e) {
		int m = 0;
		while(e>s) {
			m = (s+e)/2;
			if(array[m] < find) s=m+1;
			else e=m;
		}
		return e;
	}
}
