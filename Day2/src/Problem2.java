import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// 3의 배수 게임
		Scanner scann = new Scanner(System.in);
		int n = scann.nextInt();
		for(int i = 1; i<=n; i++) {
			if(i%3==0) System.out.print("X "); //if(i/3*3==i)
			else System.out.print(i+" ");
		}
	}

}
