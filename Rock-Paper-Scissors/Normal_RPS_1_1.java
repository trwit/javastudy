package sample;

import java.util.Scanner;


/**
 * Class Name   : Normal_RPS
 * Author       : trwit
 * Created Date : 2024. 2. 26.
 * Version      : 1.1.1
 * Purpose      :
 * Desciption   :
 */
public class Normal_RPS_1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Let's play Rock, Paper, Scissors.");
		System.out.println("Choose one.");
		System.out.println("1. Rock, 2. Paper, 3. Scissors");
		Scanner scan = new Scanner(System.in);
		System.out.print(">>> ");
		int Int = Integer.parseInt(scan.nextLine());
		System.out.print("\n");
		
		String RPS = "";
		if (Int==1) {
			RPS = "rock";
		}else if(Int==2){
			RPS = "paper";
		}else {
			RPS = "scissors";
		}
		System.out.println("You: " + RPS);
		
		String ComRPS = "";
		int comRandInt = (int)(Math.random()*3)+1;
		if (comRandInt==1) {
			ComRPS = "rock";
		}else if(comRandInt==2){
			ComRPS = "paper";
		}else {
			ComRPS = "scissors";
		}
		System.out.println("Com: " + ComRPS);
		rpsresult(Int, comRandInt);
		
		
		
	}
	private static void rpsresult(int a, int b) {
		if (a==1&&b==3) {
			System.out.println("Win");
		}else if(a==2&&b==1) {
			System.out.println("Win");			
		}else if(a==3&&b==2) {
			System.out.println("Win");						
		}else if(a==1&&b==2) {
			System.out.println("Lose");
		}else if(a==2&&b==3) {
			System.out.println("Lose");			
		}else if(a==3&&b==1) {
			System.out.println("Lose");
		}else if(a==1&&b==1){
			System.out.println("Drew");
		}else if(a==2&&b==2){
			System.out.println("Drew");
		}else {
			System.out.println("Drew");
		}
	}

}
