package finalProjectPackage;

public class GameController{
	static TheGame TheGame = new TheGame();
	static WelcomeClass WelcomeClass = new WelcomeClass();
	static Memory Memory = new Memory();

	public static void main (String[] args){
		TheGame.main1(args);
		WelcomeClass.welcome();
	}
	
	
}//end class GameController