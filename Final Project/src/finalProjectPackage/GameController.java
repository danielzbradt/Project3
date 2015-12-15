package finalProjectPackage;

//Daniel Bradt
//Final Project-Concussion Test
//This program will test any person to see if they have a concussion or not. It will test reaction time and memory.
//Lots of help from stackoverflow.com and oracle.org.
import javax.swing.JOptionPane;

public class GameController{
	static TheGame TheGame = new TheGame();
	static WelcomeClass WelcomeClass = new WelcomeClass();
	static Memory Memory = new Memory();
	public static int score = 0;

	public static void main (String[] args){
		WelcomeClass.welcome();
		
		
	}
	public static void conclusion(){
		//System.out.println(score);
		if(score >= 2){
			JOptionPane.showMessageDialog(null, "YOU PASSED!");
		}else
			JOptionPane.showMessageDialog(null, "You Failed Seek Medical Attention.");
	}//end method conclusion
}//end class GameController