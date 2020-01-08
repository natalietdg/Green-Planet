import java.util.Scanner;

public class Player extends User {
	private String gamerName;	
	Scanner userInput;
	
	public Player(){
		userInput = new Scanner(System.in);
	}

	public void setName(String name) {
		super.setName(name);
		int randomNumber = (int)(Math.random()*99);
		String name2= "";
		int randomizeName = (int)(Math.random()*3+1);
		
		if(randomizeName == 1) {
			gamerName = "Gamer" + name + randomNumber;
		}
		else if (randomizeName == 2) {
			int randomizeGender = (int)(Math.random()*2+1);
			
			if(super.getGender().equalsIgnoreCase("F")) {
				if(randomizeGender == 1) {				
					name2 = "gal";
				}
				else if (randomizeGender == 2){
					name2 = "girlz";
				}
			}
			else if (super.getGender().equalsIgnoreCase("M")) {
				if(randomizeGender == 1) {				
					name2 = "dude";
				}
				else if (randomizeGender == 2){
					name2 = "boyz";
				}
			}
			gamerName = "gamer" + super.getName() + name2 + randomNumber;
		}
		else if (randomizeName == 3) {
			gamerName = super.getName() + randomNumber;
		}
	}
	
	public String getName() {
		return gamerName;
	}
	
	 public enum CHOICES
	 {
		 ROCK , 
		 PAPER ,
		 SCISSORS ;
		 }; 
	 
	 public enum RESULT
	 {
		 WIN , 
		 LOSE ,
		 TIE,
		 NONE;
		 };
		 
	public CHOICES getChoice() {
		
		System.out.print("Choose your move! \"Rock\", \"Paper\", \"Scissors\"\n\n>");
		String userChoice = userInput.nextLine(); 
		
		if (userChoice.equalsIgnoreCase("rock")) {
			return CHOICES.ROCK;
			
		} else if (userChoice.equalsIgnoreCase("Paper")) {
			
			return CHOICES.PAPER;
			
		} else if (userChoice.equalsIgnoreCase("Scissors")) {
		
			return CHOICES.SCISSORS;
		
		} else {
			
		System.out.println("INVALID");
		 return getChoice();
		}	
	}
	public RPSScore getRPSScore() {
		return getRPSScore();
	}
	
}