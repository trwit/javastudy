package sample;

import java.util.Scanner;


/**
 * Class Name   : Normal_RPS
 * Author       : 202-09
 * Created Date : 2024. 2. 23.
 * Version      : 1.0
 * Purpose      :
 * Desciption   :
 */
public class Normal_RPS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Let's play Rock, Paper, Scissors.");
		System.out.println("Choose one.");
		System.out.println("1. Rock, 2. Scissors, 3. Paper");
		// You may have a question.
		// "Why Scissors are NUMBER TWO."
		// "Because My coding skills are not good as modify."
		Scanner scan = new Scanner(System.in);
		System.out.print(">>> ");
		int Int = Integer.parseInt(scan.nextLine());
		System.out.print("\n");
		
		String RPS = "";
		if (Int==1) {
			RPS = "rock";
		}else if(Int==2){
			RPS = "scissors";
		}else {
			RPS = "paper";
		}
		System.out.println("You: " + RPS);
		
		String ComRPS = "";
		int comRandInt = (int)(Math.random()*3)+1;
//		System.out.println(comrandInt);
		if (comRandInt==1) {
			ComRPS = "rock";
		}else if(comRandInt==2){
			ComRPS = "scissors";
		}else {
			ComRPS = "paper";
		}
		System.out.println("Com: " + ComRPS);
		
		if (Int==1&&comRandInt==3) {
			System.out.println("Lose");
		}else if(Int==2&&comRandInt==1) {
			System.out.println("Lose");			
		}else if(Int==3&&comRandInt==2) {
			System.out.println("Lose");						
		}else if(Int==1&&comRandInt==2) {
			System.out.println("Win");
		}else if(Int==2&&comRandInt==3) {
			System.out.println("Win");			
		}else if(Int==3&&comRandInt==1) {
			System.out.println("Win");
		}else if(Int==1&&comRandInt==1){
			System.out.println("Drew");
		}else if(Int==2&&comRandInt==2){
			System.out.println("Drew");
		}else {
			System.out.println("Drew");
		}
	}

}
