
public class Main extends Player {

	private EvilDevil evildevil;
	
	private CHOICES evilChoice;
	
	private CHOICES userChoice;
	
	private RESULT result;

	protected int win;
	
	protected int lose;
	
	protected int round;
	
	public Main() {
		evildevil = new EvilDevil();
	}
	
	public void game() {
		userChoice = getChoice();
		evilChoice = evildevil.evilChoice();
		result = getResults();
		choicePic();
		endResult();
		counts();
		
	}
	
	public void choicePic()	{
		
		if(userChoice == CHOICES.ROCK) {
			System.out.println("    _______\n" + 
					"---'   ____)\n" + 
					"      (_____)\n" + 
					"      (_____)\n" + 
					"      (____)\n" + 
					"---.__(___)\n" + 
					"");
		} else if (userChoice == CHOICES.PAPER) {
			System.out.println("    _______\n" + 
					"---'   ____)____\n" + 
					"          ______)\n" + 
					"          _______)\n" + 
					"         _______)\n" + 
					"---.__________)");
		} else if (userChoice == CHOICES.SCISSORS) {
			
			System.out.println("    _______\r\n" + 
					"---'   ____)____\r\n" + 
					"          ______)\r\n" + 
					"       __________)\r\n" + 
					"      (____)\r\n" + 
					"---.__(___)\r\n" + 
					")");

		}
		
		if(evilChoice == CHOICES.ROCK)
		{
			System.out.println("    _______\n" + 
					"---'   ____)\n" + 
					"      (_____)\n" + 
					"      (_____)\n" + 
					"      (____)\n" + 
					"---.__(___)\n" + 
					"");
		} else if (evilChoice == CHOICES.PAPER) {
			System.out.println("    _______\n" + 
					"---'   ____)____\n" + 
					"          ______)\n" + 
					"          _______)\n" + 
					"         _______)\n" + 
					"---.__________)");
		} else if (evilChoice == CHOICES.SCISSORS) {
			
			System.out.println("    _______\r\n" + 
					"---'   ____)____\r\n" + 
					"          ______)\r\n" + 
					"       __________)\r\n" + 
					"      (____)\r\n" + 
					"---.__(___)\r\n" + 
					"");

		}	
	}
	
	public void endResult()	{
		if (result == RESULT.WIN) {
			
			System.out.print("Evil chose "+evilChoice+" ."+userChoice + " beats " + evilChoice + ". YOU WIN! Press Enter to continue or type \"exit\" to leave");
			
		} else if (result == RESULT.LOSE) {
			
			System.out.print("Evil chose "+ evilChoice + ". YOU LOSE! Press Enter to continue or type \"exit\" to leave");
			
		} else if (result == RESULT.TIE) {
			System.out.println("Evil chose "+ userChoice +" too. It's a tie :s Press Enter to continue or type \"exit\" to leave");
		}
		
	
	}
	
	public void counts() {
		if (result == RESULT.WIN) {
			win++;
			System.out.println("\nWin count : "+ win);
		round++;
		
		} else if (result == RESULT.LOSE) {
			lose++;
			System.out.println("\nLose count : "+lose);
			round++;
		
		} else if (result == RESULT.TIE) {
			round++;
		}
		
	}
	
	public void endPopUp(int score)
	{		
		if(win==2) {
			System.out.println("YOU DEFEATED EVILDEVIL!! You won a CAR of value $1999999998... and +15 points"+"	                      ___..............._\n" + 
					"	             __.. ' _'.\"\"\"\"\"\"\\\\\"\"\"\"\"\"\"\"- .`-._\n" + 
					"	 ______.-'         (_) |      \\\\           ` \\\\`-. _\n" + 
					"	/_       --------------'-------\\\\---....______\\\\__`.`  -..___\n" + 
					"	| T      _.----._           Xxx|x...           |          _.._`--. _\n" + 
					"	| |    .' ..--.. `.         XXX|XXXXXXXXXxx==  |       .'.---..`.     -._\n" + 
					"	\\_j   /  /  __  \\  \\        XXX|XXXXXXXXXXX==  |      / /  __  \\ \\        `-.\n" + 
					"	 _|  |  |  /  \\  |  |       XXX|\"\"'            |     / |  /  \\  | |          |\n" + 
					"	|__\\_j  |  \\__/  |  L__________|_______________|_____j |  \\__/  | L__________J\n" + 
					"	     `'\\ \\      / ./__________________________________\\ \\      / /___________\\\n" + 
					"	        `.`----'.'                                     `.`----'.'\n" + 
					"	          `\"\"\"\"'                                         `\"\"\"\"'");

			User scores= new RPSScore(15);
			getScore();
			ScoreEndQuiz statsEnd = new ScoreEndQuiz(); 
			
			
			
		} else if (lose == 2) {
			System.out.println("You just destroyed humanity.. :(.... -15 points");
			User scores= new RPSScore(-15);
			getScore();
			ScoreEndQuiz statsEnd = new ScoreEndQuiz();
			
		}
	}
	
	public RESULT getResults() {
		if(userChoice == CHOICES.ROCK)
		{
			if(evilChoice == CHOICES.SCISSORS)
			return RESULT.WIN; 
			else if(evilChoice == CHOICES.PAPER) 
			return RESULT.LOSE;
			else if(evilChoice == CHOICES.ROCK)
			return RESULT.TIE;
			
						
		} else if(userChoice == CHOICES.PAPER)
			
		{
			if(evilChoice == CHOICES.ROCK)
				return RESULT.WIN; 
				else if(evilChoice == CHOICES.SCISSORS) 
				return RESULT.LOSE;
				else if(evilChoice == CHOICES.PAPER)
				return RESULT.TIE;

		} else if(userChoice == CHOICES.SCISSORS)
			
		{
			if(evilChoice == CHOICES.PAPER)
				return RESULT.WIN; 
				else if(evilChoice == CHOICES.ROCK) 
				return RESULT.LOSE;
				else if(evilChoice == CHOICES.SCISSORS)
				return RESULT.TIE;

		}
	return RESULT.NONE;	
	
	}
}
