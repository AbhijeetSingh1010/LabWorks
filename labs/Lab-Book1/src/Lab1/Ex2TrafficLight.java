package Lab1;

import java.util.*;
import java.io.*;

public class Ex2TrafficLight {

	public static void main(String[] args) {
		String color = new String();
		Scanner c = new Scanner(System.in);
		String a;
		do {
			System.out.println("Enter the light color(red,yellow,green) :");
			color = c.next();
			switch (color) {
			case "red":
				System.out.println("STOP");
				break;
			case "yellow":
				System.out.println("READY");
				break;
			case "green":
				System.out.println("GO");
				break;
			default:
				System.out.println("WRONG COLOR :....");
				break;
			}
			System.out.println("continue(y/n)");
			a = c.next();
			System.out.println("your choice is:" + a);

		} while (a.equals("y"));
	}
}