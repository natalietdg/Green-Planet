import java.util.*;
import javax.swing.*;
import java.io.IOException;

public class GreenPlanet {
	public static void main(String[] args) throws Exception {
		User quizUser = new User();
		ArrayList<String>[][] message = ShowMessage.getLevelmessage();
		ArrayList uniqueAnswer;
		ArrayList questions;
		ArrayList<String>[][]answers;
		String[] art;
		String name = "";
		String gender = "";
		JOptionPane pane = new JOptionPane();  
		int score = 0;	
		
		while(!(quizUser.userAnswer.equalsIgnoreCase("exit"))){
			StartMenu start = new StartMenu();
			start.startMenu();
			 questions = Questions.getLevel1Q();
		 	 answers = Answers.getLevel1A();
		 	 art = AsciiArt.getL1Art();
			System.out.println("What is your name?");
			name = quizUser.input.nextLine();
			quizUser.exit(name);
			quizUser.setName(name);
			
			System.out.println("Gender? Type \"F\" for Female or \"M\" for Male");
			gender = quizUser.input.nextLine();
			quizUser.exit(gender);
			quizUser.setGender(gender);
			System.out.println("You may terminate the program anytime by typing \"exit\".\n");
		
			for(int x = 0; x< 15; x++) {		
				uniqueAnswer = new ArrayList();
				quizUser.Randomizer(questions);
			
				System.out.println("\nQuestion " + (x+1));
				System.out.println(questions.get(quizUser.randomQuestion));
				
				quizUser.RandomizeAnswer(questions, answers);	
				System.out.println(!(quizUser.getSkipCount()>3)?"To skip, type 'S' or 's'" + "\tSkips left: "+ quizUser.getSkipCount() + "/3": "No more skips left" + quizUser.getSkipCount() + "main");
				
				quizUser.userAnswer = quizUser.input.nextLine();
				quizUser.checkAnswer((x+1), questions, answers);

					for(int z = 0; z <= x; z++)	{
						if(quizUser.rightWrong == true && !(quizUser.userAnswer.equalsIgnoreCase("s")) && ! quizUser.userAnswer.equalsIgnoreCase("exit")){
							 System.out.println(art[z]);	
						}
						else if(quizUser.rightWrong == false && (!(quizUser.userAnswer.equalsIgnoreCase("s")) || !(quizUser.userAnswer.equalsIgnoreCase("exit")))){
							art[x] = " ";
						}
					}	
					if(!(quizUser.userAnswer.equalsIgnoreCase("s")) && !(quizUser.userAnswer.equalsIgnoreCase("exit"))) {
						if(message[0][quizUser.randomQuestion]!= null)
						{
							
							JOptionPane.showMessageDialog(null, message[0][quizUser.randomQuestion], "LEVEL 1 FACTS FRESH FROM THE FACTORY!", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					System.out.println("Level 1 Score:"+ quizUser.getScore());	
			}
			System.out.println("LEVEL 1 ENDED");
			questions = Questions.getLevel2Q();
			answers = Answers.getLevel2A();
			quizUser.uniqueNumber = new ArrayList();
			System.out.println("You are entering LEVEL 2");
		 	art = AsciiArt.getL2Art();
			for(int x = 0; x< 15; x++) {		
				uniqueAnswer = new ArrayList();
				quizUser.Randomizer(questions);
				
				int correctAns = 0;
				System.out.println("\nQuestion " + (x+1));
				System.out.println(questions.get(quizUser.randomQuestion));
				
				quizUser.RandomizeAnswer(questions, answers);	
				System.out.println(!(quizUser.getSkipCount()>=3)?"To skip, type 'S' or 's'" + "\tSkips left: "+ quizUser.getSkipCount() + "/3": "No more skips left");
				
				quizUser.userAnswer = quizUser.input.nextLine();
				quizUser.checkAnswer((x+1), questions, answers);

					for(int z = 0; z <= x; z++)	{
						if(quizUser.rightWrong == true && !(quizUser.userAnswer.equalsIgnoreCase("s")) && ! quizUser.userAnswer.equalsIgnoreCase("exit")){
							 System.out.println(art[z]);	
						}
						else if(quizUser.rightWrong == false && (!(quizUser.userAnswer.equalsIgnoreCase("s")) || !(quizUser.userAnswer.equalsIgnoreCase("exit")))){
							art[x] = " ";
						}
					}	
					if(!(quizUser.userAnswer.equalsIgnoreCase("s")) && !(quizUser.userAnswer.equalsIgnoreCase("exit"))) {
						if(message[1][quizUser.randomQuestion]!= null)
						{
							JOptionPane.showMessageDialog(null, message[1][quizUser.randomQuestion], "LEVEL 2 FACTS HOT FROM THE OVEN!", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					System.out.println("Level 2 Score:"+ quizUser.getScore());
			}
			System.out.println("LEVEL 2 ENDED");
			questions = Questions.getLevel3Q();
			answers = Answers.getLevel3A();
			quizUser.uniqueNumber = new ArrayList();
		 	art = AsciiArt.getL3Art();
			System.out.println("You are entering LEVEL 3");
			for(int x = 0; x< 15; x++) {		
				uniqueAnswer = new ArrayList();
				quizUser.Randomizer(questions);
				
				int correctAns = 0;
				System.out.println("\nQuestion " + (x+1));
				System.out.println(questions.get(quizUser.randomQuestion));
				
				quizUser.RandomizeAnswer(questions, answers);	
				System.out.println(!(quizUser.getSkipCount()>=3)?"To skip, type 'S' or 's'" + "\tSkips left: "+ quizUser.getSkipCount() + "/3": "No more skips left");
				
				quizUser.userAnswer = quizUser.input.nextLine();
				quizUser.checkAnswer((x+1), questions, answers);

					for(int z = 0; z <= x; z++)	{
						if(quizUser.rightWrong == true && !(quizUser.userAnswer.equalsIgnoreCase("s")) && ! quizUser.userAnswer.equalsIgnoreCase("exit")){
							 System.out.println(art[z]);	
						}
						else if(quizUser.rightWrong == false && (!(quizUser.userAnswer.equalsIgnoreCase("s")) || !(quizUser.userAnswer.equalsIgnoreCase("exit")))){
							art[x] = " ";
						}
					}	
				System.out.println("Level 3 Score:"+ quizUser.getScore());
					score = quizUser.getScore();
			}
			System.out.println("LEVEL 3 ENDED");
			Thread.sleep(1000);
			System.out.println("\n\nYou are entering GAME ZONE");
			quizUser = new Player();
			quizUser.setGender(gender);
			quizUser.setName(name);	
			quizUser.setScore(score);
			
			do{
				quizUser.setName(name);
				System.out.println("Player name: " + quizUser.getName());
				System.out.println("Want to change? Type \"y\" to change or press Enter to continue.");
			}
			while(quizUser.input.nextLine().equalsIgnoreCase("y"));	
			PlayRPS game = new PlayRPS(quizUser.getScore());
		}
	}
}

	

		


