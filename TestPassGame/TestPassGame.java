package sample;

import java.util.Scanner;

/**
 * Class Name   : TestPassGame
 * Author       : 202-09
 * Created Date : 2024. 2. 22.
 * Version      : 1.0
 * Purpose      :
 * Desciption   :
 */
public class TestPassGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a [TestPassGame].");
		System.out.println("The test date is 3/30, Monday.");
		System.out.println("Today is 3/27, Friday.");
		System.out.println("You can choose your action on holiday.");
		System.out.println("Choose action number.");
		System.out.println("1. Studying");
		System.out.println("2. Resting");
		System.out.print(">>> ");
//		System.out.println("3. Praying");
//		System.out.println("4. Chatting");
		Scanner scan = new Scanner(System.in);
		int day1 = Integer.parseInt(scan.nextLine());
		if (day1 == 1) {
			System.out.println("You study that.");
		}else {
			System.out.println("You rest.");
		}
		System.out.print("\n");
		
		
		System.out.println("Today is 3/28, Saturday.");
		System.out.println("Choose action number.");
		System.out.println("1. Studying");
		System.out.println("2. Resting");
		System.out.print(">>> ");
		int day2 = Integer.parseInt(scan.nextLine());
		if (day2 == 1) {
			System.out.println("You study that.");
		}else {
			System.out.println("You rest.");
		}
		System.out.print("\n");
		
		System.out.println("Today is 3/29, Sunday.");
		System.out.println("Choose action number.");
		System.out.println("1. Studying");
		System.out.println("2. Resting");
		System.out.print(">>> ");
		int day3 = Integer.parseInt(scan.nextLine());
		if (day3 == 1) {
			System.out.println("You study that.");
		}else {
			System.out.println("You rest.");
		}
		System.out.print("\n");
		
		System.out.println("Today is the Test day.");
		System.out.println("The result is...");
		if(day1==1 && day2==1 && day3==1) {
			System.out.print("Pass");
		}else {
			System.out.print("Fail");
		}
	}

}
