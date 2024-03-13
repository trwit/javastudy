package sample;

/**
 * Class Name   : Random_RPS
 * Author       : trwit
 * Created Date : 2024. 2. 21.
 * Version      : 1.0.1
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
		// In this case, Nobody may focus on the number..
		
		String RPS = "";
		int randInt = (int)(Math.random()*3)+1;
		if (randInt==1) {
			RPS = "rock";
		}else if(randInt==2){
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
		
		if (randInt==1&&comRandInt==3) {
			System.out.println("Win");
		}else if(randInt==2&&comRandInt==1) {
			System.out.println("Win");			
		}else if(randInt==3&&comRandInt==2) {
			System.out.println("Win");						
		}else if(randInt==1&&comRandInt==2) {
			System.out.println("Lose");
		}else if(randInt==2&&comRandInt==3) {
			System.out.println("Lose");			
		}else if(randInt==3&&comRandInt==1) {
			System.out.println("Lose");
		}else if(randInt==1&&comRandInt==1){
			System.out.println("Drew");
		}else if(randInt==2&&comRandInt==2){
			System.out.println("Drew");
		}else {
			System.out.println("Drew");
		}
	}

}
