
public class RPSScore extends Player{

	private int score;
	
	public RPSScore(int number)
	{	
		score = getScore()+ number;
		setScore(score);
		getScore();
	}

	

}