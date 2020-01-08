import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class User {
	private int skipCount;
	public int randomQuestion;
	public static int maxSkipped;
	public String key;
	public ArrayList uniqueNumber;
	public String userAnswer;
	static boolean rightWrong;
	static AsciiArt asciiArt;
	static String[] art;
	static AnswerSequence ansSequence;
	static HashMap<String, Integer> sequence;
	private static int score;
	private String name;
	private String gender;
	Scanner input = new Scanner(System.in);

	public User() {
		skipCount = 0;
		randomQuestion = 0;
		maxSkipped = 0;
		key = "";
		userAnswer = "";
		rightWrong = false;
		asciiArt = new AsciiArt();
		art = asciiArt.getL1Art();
		ansSequence = new AnswerSequence();
		sequence = ansSequence.getSequence();
		uniqueNumber = new ArrayList();
	}
	public void setName(String name) {
		this.name = name ;
	}
	public String getName() {
		return name;
	}	
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	public int getSkipCount() {
		return skipCount;
	}
	
	public void checkAnswer(int questionNumber, ArrayList questions, ArrayList<String>[][] answers) {
		if(userAnswer.equalsIgnoreCase("a") || userAnswer.equalsIgnoreCase("b") || userAnswer.equalsIgnoreCase("c") || userAnswer.equalsIgnoreCase("d")) {
			for(int z = 0; z< 3; z++) {
				while(!(userAnswer.matches(key))) {
					key = (String) sequence.keySet().toArray()[z];
					break;
				}
			}
			
			if(sequence.get(key).toString().matches("3")) 
				{
				score +=1;
				System.out.println("\nCorrect!");
				rightWrong = true;
				}
			else {
				String correctAnswer = "";
				String keysets = "";
				rightWrong = false;
				System.out.println("\nIncorrect!");
				score-=1;
				for (int x = 0; x <= 3; x++) {
					keysets = (String) sequence.keySet().toArray()[x]; 
					if(sequence.get(keysets).toString().matches("3")) {  
						correctAnswer = keysets;
					}	
				}
				System.out.println("The correct answer is: " + correctAnswer);
			}
		}
		else if ((userAnswer.equalsIgnoreCase("s")) && skipCount >3) {
			maxSkipped = randomQuestion;
			skip(questionNumber, questions, answers);	
			skipCount++;
			rightWrong = false;
		}
		else if ((userAnswer.equalsIgnoreCase("s")) && !(skipCount >3)) {
			rightWrong = false;
			skipCount++;
		}
		else if (userAnswer.equalsIgnoreCase("exit")) {
			exit(userAnswer);
			rightWrong = false;
		}
		else if (!userAnswer.equalsIgnoreCase("s") && !userAnswer.equalsIgnoreCase("a") && !userAnswer.equalsIgnoreCase("b") && !userAnswer.equalsIgnoreCase("c") && !userAnswer.equalsIgnoreCase("d")&& !userAnswer.equalsIgnoreCase("exit")) {
			maxSkipped = randomQuestion;
			 while(!userAnswer.equalsIgnoreCase("s") && !userAnswer.equalsIgnoreCase("a") && !userAnswer.equalsIgnoreCase("b") && !userAnswer.equalsIgnoreCase("c") && !userAnswer.equalsIgnoreCase("d")) {
				 System.out.println("Question " + questionNumber);
					System.out.println(questions.get(maxSkipped));
					RandomizeAnswer(questions, answers);
					System.out.println(!(skipCount>3)?"To skip, type 'S' or 's'" + "\tSkips left: "+ skipCount + "/3": "No more skips left");
					userAnswer = input.nextLine();
					checkAnswer(questionNumber, questions, answers);
				}
			Randomizer(questions);
		}
		
	}	
	
	public void skip(int questionNumber, ArrayList questions, ArrayList<String>[][] answers) {	
		Scanner skipInput = new Scanner(System.in);
		if ((userAnswer.equalsIgnoreCase("s"))) {
			 while((userAnswer.equalsIgnoreCase("s"))) {
				 System.out.println("Question " + questionNumber);
					System.out.println(questions.get(maxSkipped));
					RandomizeAnswer(questions, answers);
					System.out.println(!(skipCount>3)?"To skip, type 'S' or 's'" + "\tSkips left: "+ skipCount + "/3": "No more skips left");
					userAnswer = skipInput.nextLine();
					checkAnswer(questionNumber, questions, answers);
				}
			Randomizer(questions);
		 }
	}
	
	public void Randomizer (ArrayList questions) {
		 randomQuestion = (int)(Math.random()*questions.size());
		
		if(uniqueNumber.contains(randomQuestion)) {
			while(uniqueNumber.contains(randomQuestion)) {
				 randomQuestion = (int)(Math.random()*questions.size());
			}	
			 if(!(uniqueNumber.contains(randomQuestion)))	uniqueNumber.add(randomQuestion);
		}
		else if(!(uniqueNumber.contains(randomQuestion)))	uniqueNumber.add(randomQuestion);

	}
	
	public void RandomizeAnswer(ArrayList questions, ArrayList<String>[][] answers) {
		ArrayList uniqueAnswer = new ArrayList();
		for(int y = 0; y < sequence.size(); y++) {
			key = (String) sequence.keySet().toArray()[y];
			int randomAnswer = (int)(Math.random()*4);	
			if(uniqueAnswer.contains(randomAnswer)) {
				while(uniqueAnswer.contains(randomAnswer)) {
					randomAnswer = (int)(Math.random()*4);
				}
				if (!(uniqueAnswer.contains(randomAnswer))) uniqueAnswer.add(randomAnswer);
			}
			else if (!(uniqueAnswer.contains(randomAnswer))) uniqueAnswer.add(randomAnswer);	
			String showAnswer = answers[randomQuestion][randomAnswer].toString().replaceAll("[\\[\\]]","");
			System.out.println(key + "."+ showAnswer);
			sequence.put(key, randomAnswer);						
		}						
	}
	
	public void exit(String userAnswer) {
		if (userAnswer.equalsIgnoreCase("exit")) {
			System.out.println("Terminated");
			JOptionPane.showMessageDialog(null, "We will miss you :'(", "Program Terminated", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0); 
		}
	}
}
