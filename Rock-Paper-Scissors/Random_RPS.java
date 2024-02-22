package sample;

/**
 * Class Name   : Random_RPS
 * Author       : 202-09
 * Created Date : 2024. 2. 21.
 * Version      : 1.0
 * Purpose      :
 * Desciption   :
 */
public class Random_RPS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Let's play Rock, Paper, Scissors.");
		System.out.println("But this one can't be control anything.");
		System.out.print("\n");
		
		String RPS = "";
		int randInt = (int)(Math.random()*3)+1;
//		System.out.println(randInt);
		if (randInt==1) {
			RPS = "rock";
		}else if(randInt==2){
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
		
		if (randInt==1&&comRandInt==3) {
			System.out.println("Lose");
		}else if(randInt==2&&comRandInt==1) {
			System.out.println("Lose");			
		}else if(randInt==3&&comRandInt==2) {
			System.out.println("Lose");						
		}else if(randInt==1&&comRandInt==2) {
			System.out.println("Win");
		}else if(randInt==2&&comRandInt==3) {
			System.out.println("Win");			
		}else if(randInt==3&&comRandInt==1) {
			System.out.println("Win");
		}else if(randInt==1&&comRandInt==1){
			System.out.println("Drew");
		}else if(randInt==2&&comRandInt==2){
			System.out.println("Drew");
		}else {
			System.out.println("Drew");
		}
	}

}
