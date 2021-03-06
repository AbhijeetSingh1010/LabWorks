package Lab1;

import java.util.Scanner;

public class Ex3Fiboseries {
	int n1, n2, n3, i, n4 = 0, n5 = 1;

	public void nonrecur(int num) {

		for (i = 0; i < num; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			if (i == 0) {
				n1 = 0;
				System.out.print(n1);
			} else if (i == 1) {
				n2 = 1;
				System.out.print(" " + n2);
			} else {
				n3 = n1 + n2;
				System.out.print(" " + n3);
				n1 = n2;
				n2 = n3;
			}

		}
	}

	public void recurr(int num) {
		if (num > 0) {
			n3 = n4 + n5;
			n4 = n5;
			n5 = n3;
			System.out.print(" " + n3);
			recurr(num - 1);
		}
	}

	public static void main(String[] args) {
		int num;
		Scanner sn = new Scanner(System.in);
		System.out.println(" enter number ");
		num = sn.nextInt();

		Ex3Fiboseries fib1 = new Ex3Fiboseries();
		System.out.print(" NON-RECURRSIVE FUNCTION :");
		fib1.nonrecur(num);
		System.out.println();
		System.out.print("RECURRSIVE FUNCTION :");
		System.out.print(fib1.n4 + " " + fib1.n5);
		fib1.recurr(num - 2);
	}

}
