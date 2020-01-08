import java.util.Scanner;

import javax.swing.JOptionPane;

public class PlayRPS extends Main{

	public PlayRPS(int score)
	{
		super.setScore(score);
		String exit ="";
		JOptionPane.showMessageDialog( null, "ERROR ERRORR EREREOREORE EOREOREOROEROOR REOREROEROEORE REOREOROEREOR", "ERROR ERRRORR ERROORRR EROREORREOREO", JOptionPane.ERROR_MESSAGE);
		System.out.println("OH NO Evil_DevilP0lluter16 IS TAKING OVER THE PROGRAM! \n\nDEFEAT HIM BY"+
				" PLAYING IN ROCK, PAPER, SCISSORS!!"); 
				System.out.println("   , ,, ,                              \n" + 
						"   | || |    ,/  _____  \\.             \n" + 
						"   \\_||_/    ||_/     \\_||             \n" + 
						"     ||       \\_| . . |_/              \n" + 
						"     ||         |  L  |                \n" + 
						"    ,||         |`==='|                \n" + 
						"    |>|      ___`>  -<'___             \n" + 
						"    |>|\\    /             \\            \n" + 
						"    \\>| \\  /  ,    .    .  |           \n" + 
						"     ||  \\/  /| .  |  . |  |           \n" + 
						"     ||\\  ` / | ___|___ |  |     (     \n" + 
						"  (( || `--'  | _______ |  |     ))  ( \n" + 
						"(  )\\|| (  )\\ | - --- - | -| (  ( \\  ))\n" + 
						"(\\/  || ))/ ( | -- - -- |  | )) )  \\(( \n" + 
						" ( ()||((( ())|         |  |( (( () )hjm");
				
				while(!exit.equalsIgnoreCase("exit")&&(lose<2||win<2))
				{
					game();
					endPopUp(super.getScore());
					
					exit = input.nextLine();
					
				}
				ScoreEndQuiz stats = new ScoreEndQuiz(); 				
	}
	
}

