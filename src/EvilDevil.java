import java.util.Random;

public class EvilDevil extends Player{ 
	
	 Random r;
	
	public EvilDevil() 
	{
		 r = new Random();
		 
	}
	
	public CHOICES evilChoice()
	{
		int choice = 1 +r.nextInt(3);
		
		if (choice == 1) {
			
			return CHOICES.ROCK;
			
		} else if (choice == 2) {
			
			return CHOICES.PAPER;
			
		} 
			
			return CHOICES.SCISSORS;
		}
	}
