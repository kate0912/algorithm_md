import java.util.Scanner;

public class Max {
	public final static int MAX_INDEX = 9;
	public static int array[] = new int[MAX_INDEX];
	public static int ans;

	public static void main(String[] args) {
		// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 값이 몇 번째 인지를 구하는 프로그램을 작성
		/*
		for(int i=0; i<array.length; i++) {
			array[i] = scann.nextInt();
		}*/
		solve();
		System.out.println(array[ans]+"\n"+ (ans+1));
	}
	
	public static void solve() {
		Scanner scann = new Scanner(System.in);
		for(int i=0; i<array.length; i++) {
			array[i] = scann.nextInt();
			if(array[ans]<array[i]) ans = i;
		}
	}

}
