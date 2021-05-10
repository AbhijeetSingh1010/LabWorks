package Lab1;

import java.util.*;
import java.io.*;

public class Ex1SumCubicdigits {
	int input = 0;
	int num1, num2, num3;

	public void Cubesum() {
		System.out.println("Enter a Number");
		Scanner sc1 = new Scanner(System.in);
		input = Integer.parseInt(sc1.nextLine());
		int num = input;
		int sum = 0;
		while (num > 0) {
			int t = num % 10;
			int k = t * t * t;
			System.out.println("Cube of " + t + " is " + k);
			num = num / 10;
			sum = sum + k;
		}
		System.out.println("sum of cubic digits is :" + sum);

	}

	public static void main(String[] args) {
		Ex1SumCubicdigits esc = new Ex1SumCubicdigits();
		esc.Cubesum();
	}

}
