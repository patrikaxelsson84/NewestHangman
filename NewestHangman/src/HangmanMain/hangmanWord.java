package HangmanMain;

public class hangmanWord {

	
	private static String[] words = { "examinations","condition ","neighbourhood", //String array/vektor in Swedish :)
			"challenge","bathroom","examples","sensitive","squirrel", 
			"employment", "penguin", "majority", "magazine", "economics" };
private static String word = words[(int) (Math.random() * words.length)];		//Random math method.
	public static String getsecrectword() {										//Get set without set because get returns word which becomes the random word.
		return word;
	}
}
