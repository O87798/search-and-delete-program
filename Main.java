import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
		System.out.print("Input a body of text:");
		String in = reader.nextLine();
		System.out.print("Input which characters you would like to remove from the text:");
		String delims = "[" + reader.nextLine() + "]+";
		String[] out = in.split(delims);

		/*      //repeat of code from previous repl. prints any word in the sentence if the delim string is set to space/punctuation, commented out temporarily for use of other thingy that just lets you remove certain characters from a string of text

		System.out.print("Which token number would u like to print?");
		int index = reader.nextInt();
		System.out.print(out[index-1]);
		*/


		// prints all tokens in the same order but removes the characters specified by the user, acting as a search feature
		for (int i=0; i<out.length;i++) {
			System.out.print(out[i]);
		}
  }
}