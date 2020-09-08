package HangmanMain;

import java.util.Scanner;

public class HangmanMain {									 //källa https://github.com/MarcusJoh/JavaSamplesEC/tree/master/Java_sample_C1_W3_L2/object1/src/object1

	private static String chartry1 = new String(new char[hangmanWord.getsecrectword().length()]).replace("\0", "-"); //Get class and replace the word to - 
	private static int count = 7;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);																	//Scanner
		System.out.println(
				"Welcome to Hangmangame. \n**********************\n** Guess a letter   **\n** Or               **\n** Guess the word   **\n********************** ");
		
		while (count > 0 && chartry1.contains("-")) {
			System.out.println("Guess any letter in the word");
			System.out.println(chartry1);				//Output -----
			String guess = reader.next();				//Input = users char guess
			hang(guess);								//Get method hang and 
		}
		reader.close();
	}

	public static void hang(String guess1) {   			
		String chartry = "";							
		for (int i = 0; i < hangmanWord.getsecrectword().length(); i++) {			//For loop, checking the words length and chars from begining from 0-up.
			if (hangmanWord.getsecrectword().charAt(i) == guess1.charAt(0)) {		
				chartry += guess1.charAt(0);
			} else if (chartry1.charAt(i) != '-') {									//If its right it replace the - with the char.
				chartry += hangmanWord.getsecrectword().charAt(i);
			} else {
				chartry += "-";
			}
		}
		if(guess1.equals(hangmanWord.getsecrectword())) {							//If all char is right you won
			System.out.println("Congratzzz, you guessed the word "+hangmanWord.getsecrectword()+" and won the game!");
			count =-1;
		}

		if (chartry1.equals(chartry)) {												//If the char is wrong it calls for first image and count down tries.
			count--;
			hangmanImage();
		} else {
			chartry1 = chartry;														//The word change from - to the char.
		}
		if (chartry1.equals(hangmanWord.getsecrectword())) {						//If you guess the word right you win.
			System.out.println("Correct! You win! The word was " + hangmanWord.getsecrectword());
		}
	}

	public static void hangmanImage() {
		System.out.print("\n");
		if (count == 6) {
			System.out.println(" You have " + count + " Tries left ");
			System.out.println("    ----------");
			System.out.println("    |        |");
			System.out.println("    |        |");
			System.out.println("    |      ||||");
			System.out.println("    |     ");
			System.out.println("    |      ");
			System.out.println("    |   ");
			System.out.println("    |  ");
			System.out.println("    |");
			System.out.println(" ___|___\n");
		} else if (count == 5) {
			System.out.println(" You have " + count + " Tries left ");
			System.out.println("    ----------");
			System.out.println("    |        |");
			System.out.println("    |        |");
			System.out.println("    |      ||||");
			System.out.println("    |     |_`´_|");
			System.out.println("    |      ");
			System.out.println("    |   ");
			System.out.println("    |  ");
			System.out.println("    |");
			System.out.println(" ___|___\n");
		} else if (count == 4) {
			System.out.println(" You have " + count + " Tries left ");
			System.out.println("    ----------");
			System.out.println("    |        |");
			System.out.println("    |        |");
			System.out.println("    |      ||||");
			System.out.println("    |     |_`´_|");
			System.out.println("    |      _||_");
			System.out.println("    |   ");
			System.out.println("    |  ");
			System.out.println("    |");
			System.out.println(" ___|___\n");
		} else if (count == 3) {
			System.out.println(" You have " + count + " Tries left ");
			System.out.println("    ----------");
			System.out.println("    |        |");
			System.out.println("    |        |");
			System.out.println("    |      ||||");
			System.out.println("    |     |_`´_|");
			System.out.println("    |      _||_");
			System.out.println("    |   _-x|  |x-_");
			System.out.println("    |  ");
			System.out.println("    |");
			System.out.println(" ___|___\n");
		} else if (count == 2) {
			System.out.println(" You have " + count + " Tries left ");
			System.out.println("    ----------");
			System.out.println("    |        |");
			System.out.println("    |        |");
			System.out.println("    |      ||||");
			System.out.println("    |     |_`´_|");
			System.out.println("    |      _||_");
			System.out.println("    |   _-x|  |x-_");
			System.out.println("    |  -   |__|   -");
			System.out.println("    |");
			System.out.println(" ___|___\n");
		} else if (count == 1) {
			System.out.println(" You have " + count + " Tries left ");
			System.out.println("    ----------");
			System.out.println("    |        |");
			System.out.println("    |        |");
			System.out.println("    |      ||||");
			System.out.println("    |     |_`´_|");
			System.out.println("    |      _||_");
			System.out.println("    |   _-x|  |x-_");
			System.out.println("    |  -   |__|   -");
			System.out.println("    |      |  |");
			System.out.println(" ___|___\n");
		}
		
		if (count == 0) {
			System.out.println(" You have " + count + " Tries left");
			System.out.println("    ----------");
			System.out.println("    |        |");
			System.out.println("    |        |");
			System.out.println("    |      ||||");
			System.out.println("    |     |_`´_|");
			System.out.println("    |      _||_");
			System.out.println("    |   _-x|  |x-_");
			System.out.println("    |  -   |__|   -");
			System.out.println("    |      |  |");
			System.out.println(" ___|___  _|  |_");
			System.out.println("GAME OVER! You are hanged");
			System.out.println("");
		}
	//	    System.out.println(" ___   ___ * _______   *\n|   |_|   |*|   _   |  *\n|  _   _  |*|  |_|  |  *\n| | |_| | |*|   _   |  *\n|_|     |_|*|__| |__|  *");
		

	}

}
