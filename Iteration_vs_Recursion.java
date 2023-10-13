package Java;
import java.util.Scanner;
public class Iteration_vs_Recursion {
	public static void main(String[] args) {
		System.out.println("1 for Iteration.");
		System.out.println("2 for Recursion.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me the option : ");
		int op = sc.nextInt();
		if(op == 1) {
			System.out.print("Give me the number : ");
			int n = sc.nextInt();
			fact1(n);
		}else if(op == 2) {
			System.out.print("Give me the number : ");
			int n = sc.nextInt();
			fact2(n);
		}
		sc.close();
	}
	static int fact1(int num){ // Iteration
		int k;
		if(num==1) {
			return k=1;
		}else {
			return k=num*fact1(num-1);
		}
	}
	static void fact2(int n) { // Recursion
		int fact = 1;
		for(int i = 1;i <= n;i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
