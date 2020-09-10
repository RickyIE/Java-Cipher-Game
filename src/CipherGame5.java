
// Aleksandar Mladenov 2976196

import java.util.*;
import java.lang.*;

public class CipherGame5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list2 = new ArrayList<String>();// ............................declare a list and typer of list
		Scanner input = new Scanner(System.in); // ............................scanner for input
		Random random = new Random(); // ............................random used for random generation
		Date date = new Date(); // ............................did not use date in the end
		long score = 1000, begin = System.currentTimeMillis(); // ............................used to calculate the score and get the time 
		boolean countdown = true; // ............................helps to initiate the countdown for the score
		int normalModeRandom, userGameModeChoice = 0, randomParagrahPick, test = 0, count = 0;  //............................declared global integers
		String randomSentence1, randomSentence2, randomSentence3, help = "help", reset = "reset", normalMode = "Normal",
				testMode = "Test", userInput; // ............................will use later to form paragraphs
		String alphabetUpper[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
				"R", "S", "T", "U", "V", "W", "X", "Y", "Z" }; // declared array with the alphabet in upper case
		char alphabetLower[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', }; // declared array with the alphabet in lower case
		String paragraph[] = new String[10]; //............................. array of paragraphs

		paragraph[0] = "A kid finds a magical lamp. He rubs the lamp, and a genie appears and says, “What is your first wish?” The kid says, “I wish I were rich!” The genie replies, “It is done! What is your second wish, Rich?";
		paragraph[1] = "Three friends stranded on a deserted island find a magic lamp. Inside it is a genie who agrees to grant each friend one wish.“I want to go home,” says the first friend. The genie grants her wish.“I want to go home, too,” says the second friend. And the genie sends her back home.“I’m lonely,” says the third friend. “I sure wish my friends were back here.";
		paragraph[2] = "While leaving a grocery store, a customer dropped a bag of flour. A Scout ran to pick it up.“Don’t bother, young man,” said the customer. “It’s self-rising.”";
		paragraph[3] = "A photon walks into a hotel. The desk clerk says, “Can we help you with your luggage?” The photon says, “No, thanks. I’m traveling light.”";
		paragraph[4] = "A man was driving down the road when a policeman stopped him. The officer looked in the back of the man’s truck and said, “Why are these penguins in your truck?” The man replied, “These are my penguins. They belong to me.” “You need to take them to the zoo,” the policeman said. The next day, the officer saw the same guy driving down the road. He pulled him over again. He saw the penguins were still in the truck, but they were wearing sunglasses this time. “I thought I told you to take these penguins to the zoo!” the officer said. “I did,” the man replied. “And today I’m taking them to the beach.\"";
		paragraph[5] = "A guy is sitting at home when he hears a knock at the door. He opens the door and sees a snail on the porch. He picks up the snail and throws it as far as he can.A year later, there’s another knock at the door. He opens it and sees the same snail. The snail says, “What was that all about?”";
		paragraph[6] = "What is red and smells like blue paint? Red paint!!!";
		paragraph[7] = "What’s brown and sticky? not surprising its a stick!";
		paragraph[8] = "How did the hipster burn his mouth? He ate pizza not so cool";
		paragraph[9] = "How does NASA organize a party? Usually they go and planet!";

		do {

			System.out.println("Would you Like to play in normal Mode or test Mode" + "\n1.Normal ( type Normal )"
					+ "\n2.Test ( type Test )");
			userInput = input.next();//............................user input for user choice

		} while ((!userInput.equalsIgnoreCase(normalMode)) && (!userInput.equalsIgnoreCase(testMode))); //............................if the 2 given choices dont match then it keeps looping 
		if (userInput.equalsIgnoreCase(normalMode)) { //............................ normal mode
			randomParagrahPick = random.nextInt(10);//............................chooses random paragraph
			char char1[] = paragraph[randomParagrahPick].toCharArray(); //............................1st array used to store random paragraph
			char char2[] = char1.clone();//............................ 2-nd array clones the first array and is used as a reset
			int randomLetterArray[] = new int[26];//............................used to generate cipher alphabet
			int randomLetter = 0;//............................ letter used for array
			for (int i = 0; i < randomLetterArray.length; i++) {//............................ loop to populate the array
				randomLetter = random.nextInt(26);
				randomLetterArray[i] = randomLetter; // change random letters for loop
			}

			for (int i = 0; i < randomLetterArray.length; i++) { //............................second and 3rd loop checks for duplicates and if they are found replaces them
				for (int j = 0; j < i; j++) {
					if (randomLetterArray[j] == randomLetterArray[i]) {
						randomLetter = random.nextInt(26);
						randomLetterArray[i] = randomLetter;
						j = 0;
					}

				}
			}
			for (int i = 0; i < char1.length; i++) { // //............................Cipher alphabet is created 
				if (char2[i] == 'A' || char2[i] == 'a') { //............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[0]];
				} else if (char2[i] == 'B' || char2[i] == 'b') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[1]];
				} else if (char2[i] == 'C' || char2[i] == 'c') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[2]];
				} else if (char2[i] == 'D' || char2[i] == 'd') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[3]];
				} else if (char2[i] == 'E' || char2[i] == 'e') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[4]];
				} else if (char2[i] == 'F' || char2[i] == 'f') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[5]];
				} else if (char2[i] == 'G' || char2[i] == 'g') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[6]];
				} else if (char2[i] == 'H' || char2[i] == 'h') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[7]];
				} else if (char2[i] == 'I' || char2[i] == 'i') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[8]];
				} else if (char2[i] == 'G' || char2[i] == 'g') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[9]];
				} else if (char2[i] == 'K' || char2[i] == 'k') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[10]];
				} else if (char2[i] == 'L' || char2[i] == 'l') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[11]];
				} else if (char2[i] == 'M' || char2[i] == 'm') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[12]];
				} else if (char2[i] == 'N' || char2[i] == 'n') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[13]];
				} else if (char2[i] == 'O' || char2[i] == 'o') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[14]];
				} else if (char2[i] == 'P' || char2[i] == 'p') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[15]];
				} else if (char2[i] == 'Q' || char2[i] == 'q') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[16]];
				} else if (char2[i] == 'R' || char2[i] == 'r') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[17]];
				} else if (char2[i] == 'S' || char2[i] == 's') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[18]];
				} else if (char2[i] == 'T' || char2[i] == 't') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[19]];
				} else if (char2[i] == 'U' || char2[i] == 'u') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[20]];
				} else if (char2[i] == 'V' || char2[i] == 'v') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[21]];
				} else if (char2[i] == 'W' || char2[i] == 'w') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[22]];
				} else if (char2[i] == 'X' || char2[i] == 'x') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[23]];
				} else if (char2[i] == 'Y' || char2[i] == 'y') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[24]];
				} else if (char2[i] == 'Z' || char2[i] == 'z') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[25]];
				}

			}
			char char3[] = char1.clone();// ............................used to compare arrays for game result
			for (int i = 0; i < char1.length; i++) {
				char3[i] = Character.toUpperCase(char1[i]);// ............................ Transform to uppercase to match array 4 for requirements
			}
			char char4[] = char2.clone();// ............................The actual array used from user to guess
			do {
				System.out.println(
						"----------------------------------------------------------------------------------------");
				System.out.println("CIPHER");
				System.out.println(
						"----------------------------------------------------------------------------------------");
				System.out.println(
						"*Instructions* - Hello user try to decript the message below by replasing the letters one"
								+ "\nletter at a time this is done by tying 2 letters, first type the letter you want to replace and "
								+ "\nthen the letter you want to replace it with for example if you want to replace all the letters \"i\""
								+ "\n with the letter \"k\" just type \"ik\" Type \"HELP\" to get help with a random selection and "
								+ "\ntype \"RESET\" to reset your sentense back to its original state");
				System.out.println(
						"----------------------------------------------------------------------------------------");
				System.out.println("CIPHER ---- SCORE ( " + score + " )");
				System.out.println(
						"----------------------------------------------------------------------------------------");
				int counter = 0;
				for (int i = 0; i < char1.length; i++) {
					int paragraphBrake = counter % 110;
					counter++;
					System.out.print(char4[i]);
					if (paragraphBrake > 80) {
						if (char2[i] == ' ' && paragraphBrake > 80) {
							System.out.println("");
							counter = 0;
						}
					}
				}
				test++;
				System.out.println("");
				userInput = input.next();
				if (countdown == true) {
					begin = System.currentTimeMillis();
				}
				long finish = System.currentTimeMillis();
				score = 1000 - ((finish - begin) / 1000);
				if (userInput.equalsIgnoreCase(reset)) { // resets the array back to its original
					for (int i = 0; i < char1.length; i++) {
						char4[i] = char2[i];
					}
				} else if (userInput.equalsIgnoreCase(help)) {
					while (count < 5) {
						randomLetter = random.nextInt(char1.length);
						char uncoded = char3[randomLetter], coded = char4[randomLetter];
						for (int i = 0; i < char1.length; i++) {
							if (char4[i] == coded) {
								char4[i] = uncoded;
							}
						}
						count++;
						System.out.println(count);
						System.out.println(randomLetter);
						System.out.println(char1.length);
						break;
					}
				} else {
					char char5[] = userInput.toCharArray();
					char inputLower = Character.toLowerCase(char5[0]);
					char inputUpper = Character.toUpperCase(char5[0]);
					char outputUpper = Character.toUpperCase(char5[1]);
					for (int i = 0; i < char1.length; i++) {

						if (char4[i] == inputLower || char4[i] == inputUpper) {
							char4[i] = outputUpper;
						}

					}

				}
				countdown = false;
			} while ((!Arrays.equals(char4, char3))); // while the 2 arrays don't match the game continues
			System.out.println(
					"----------------------------------------------------------------------------------------");
			System.out.println("CIPHER---- YOU WON !!! ---- SCORE ( " + score + " )");
			System.out.println(
					"----------------------------------------------------------------------------------------");
		} else if ((userInput.equalsIgnoreCase(testMode))) {
			int paragraphChoice;
			do {
				System.out.println(
						"----------------------------------------------------------------------------------------");
				System.out.println("*** TEST MENU *** PLEASE CHOOSE A PARAGRAPH TO TEST 1-10 ");
				System.out.println(
						"----------------------------------------------------------------------------------------");
				for (int i = 0; i < paragraph.length; i++) {
					System.out.println("[" + (i + 1) + "]" + " " + paragraph[i].substring(0, 50) + "...");
				}
				paragraphChoice = input.nextInt() - 1;
			} while (paragraphChoice > 10 || paragraphChoice < 0);

			char char1[] = paragraph[paragraphChoice].toCharArray();
			char char2[] = char1.clone();
			int randomLetterArray[] = new int[26];
			int randomLetter = 0;
			for (int i = 0; i < randomLetterArray.length; i++) {
				randomLetter = random.nextInt(26);
				randomLetterArray[i] = randomLetter; // change random letters for loop
			}

			for (int i = 0; i < randomLetterArray.length; i++) {
				for (int j = 0; j < i; j++) {
					if (randomLetterArray[j] == randomLetterArray[i]) {
						randomLetter = random.nextInt(26);
						randomLetterArray[i] = randomLetter;
						j = 0;
					}

				}
			}
			for (int i = 0; i < char1.length; i++) { // //............................Cipher alphabet is created 
				if (char2[i] == 'A' || char2[i] == 'a') { //............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[0]];
				} else if (char2[i] == 'B' || char2[i] == 'b') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[1]];
				} else if (char2[i] == 'C' || char2[i] == 'c') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[2]];
				} else if (char2[i] == 'D' || char2[i] == 'd') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[3]];
				} else if (char2[i] == 'E' || char2[i] == 'e') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[4]];
				} else if (char2[i] == 'F' || char2[i] == 'f') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[5]];
				} else if (char2[i] == 'G' || char2[i] == 'g') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[6]];
				} else if (char2[i] == 'H' || char2[i] == 'h') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[7]];
				} else if (char2[i] == 'I' || char2[i] == 'i') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[8]];
				} else if (char2[i] == 'G' || char2[i] == 'g') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[9]];
				} else if (char2[i] == 'K' || char2[i] == 'k') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[10]];
				} else if (char2[i] == 'L' || char2[i] == 'l') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[11]];
				} else if (char2[i] == 'M' || char2[i] == 'm') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[12]];
				} else if (char2[i] == 'N' || char2[i] == 'n') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[13]];
				} else if (char2[i] == 'O' || char2[i] == 'o') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[14]];
				} else if (char2[i] == 'P' || char2[i] == 'p') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[15]];
				} else if (char2[i] == 'Q' || char2[i] == 'q') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[16]];
				} else if (char2[i] == 'R' || char2[i] == 'r') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[17]];
				} else if (char2[i] == 'S' || char2[i] == 's') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[18]];
				} else if (char2[i] == 'T' || char2[i] == 't') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[19]];
				} else if (char2[i] == 'U' || char2[i] == 'u') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[20]];
				} else if (char2[i] == 'V' || char2[i] == 'v') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[21]];
				} else if (char2[i] == 'W' || char2[i] == 'w') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[22]];
				} else if (char2[i] == 'X' || char2[i] == 'x') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[23]];
				} else if (char2[i] == 'Y' || char2[i] == 'y') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[24]];
				} else if (char2[i] == 'Z' || char2[i] == 'z') {//............................ all letters of this kind will be replaced from shufled array
					char2[i] = alphabetLower[randomLetterArray[25]];
				}

			}
			char char3[] = char1.clone();
			for (int i = 0; i < char1.length; i++) {
				char3[i] = Character.toUpperCase(char1[i]);
			}
			char char4[] = char2.clone();
			do {
				System.out.println(
						"----------------------------------------------------------------------------------------");
				System.out.println("CIPHER");
				System.out.println(
						"----------------------------------------------------------------------------------------");
				System.out.println(
						"*Instructions* - Hello user try to decript the message below by replasing the letters one"
								+ "\nletter at a time this is done by tying 2 letters, first type the letter you want to replace and "
								+ "\nthen the letter you want to replace it with for example if you want to replace all the letters \"i\""
								+ "\n with the letter \"k\" just type \"ik\" Type \"HELP\" to get help with a random selection and "
								+ "\ntype \"RESET\" to reset your sentense back to its original state");
				System.out.println(
						"----------------------------------------------------------------------------------------");
				System.out.println("CIPHER ---- SCORE ( " + score + " )");
				System.out.println(char1);
				System.out.println(char2);
				System.out.println(char3);
				System.out.println(char4);
				System.out.println(
						"----------------------------------------------------------------------------------------");
				System.out.println(paragraph[paragraphChoice]);
				System.out.println(
						"----------------------------------------------------------------------------------------");
				int counter = 0;
				for (int i = 0; i < char1.length; i++) {
					int paragraphBrake = counter % 110;
					counter++;
					System.out.print(char4[i]);
					if (paragraphBrake > 80) {
						if (char2[i] == ' ' && paragraphBrake > 80) {
							System.out.println("");
							counter = 0;
						}
					}
				}
				test++;
				System.out.println("");
				userInput = input.next();
				if (countdown == true) {
					begin = System.currentTimeMillis();
				}
				long finish = System.currentTimeMillis();
				score = 1000 - ((finish - begin) / 1000);
				if (userInput.equalsIgnoreCase(reset)) { // resets the array back to its original
					for (int i = 0; i < char1.length; i++) {
						char4[i] = char2[i];
					}
				} else if (userInput.equalsIgnoreCase(help)) {
					while (count < 5) {
						randomLetter = random.nextInt(char1.length);
						char uncoded = char3[randomLetter], coded = char4[randomLetter];
						for (int i = 0; i < char1.length; i++) {
							if (char4[i] == coded) {
								char4[i] = uncoded;
							}
						}
						count++;
						System.out.println(count);
						System.out.println(randomLetter);
						System.out.println(char1.length);
						break;
					}
				} else {
					char char5[] = userInput.toCharArray();
					char inputLower = Character.toLowerCase(char5[0]);
					char inputUpper = Character.toUpperCase(char5[0]);
					char outputUpper = Character.toUpperCase(char5[1]);
					for (int i = 0; i < char1.length; i++) {

						if (char4[i] == inputLower || char4[i] == inputUpper) {
							char4[i] = outputUpper;
						}

					}

				}
				countdown = false;
			} while (!Arrays.equals(char4, char3)); // while the 2 arrays don't match the game continues
			System.out.println(
					"----------------------------------------------------------------------------------------");
			System.out.println("CIPHER---- YOU WON !!! ---- SCORE ( " + score + " )");
			System.out.println(
					"----------------------------------------------------------------------------------------");
		}

	}

}