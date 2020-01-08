public class ScoreEndQuiz extends Player{
public ScoreEndQuiz()
{		
	
	String achievementComment, stars;
	System.out.println("Congrats on finishing our Green Planet Quiz Program"+"! Thanks for playing.");
	System.out.println("You scored: " + getScore() );

	if(getScore() >= 55) {
	
			achievementComment = "Achievement EARTH'S HERO : Unlocked!" ;
			stars ="*****";
	
	} else if (getScore() >= 35) {
	
			achievementComment ="That's pretty good! You are a nature lover." ;
			stars ="****";
	
	} else if (getScore() >= 25) {
	
			achievementComment = "Not bad. I see some future in you.";
			stars = "***";

	} else if (getScore() >= 10) {
	
		achievementComment ="Hmmm. Do more research maybe?";
		stars = "**";
	} else {
	
	achievementComment = "Try again?";
			stars = "*";
}

System.out.printf("\n\n%15s  | %15s\n", achievementComment , stars);
exit("exit");
	}
 
}