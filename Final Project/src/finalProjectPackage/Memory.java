package finalProjectPackage;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.plaf.FontUIResource;
public class Memory {
	
	public static char  randomletter;
	public static char[] randomLetters = new char[3];
	JOptionPane pane = new JOptionPane();
	public static int loop = 0;
		
		public static void memory(){
			
			try {Thread.sleep(1000);}
			catch (InterruptedException ie){}
			
		 Random r = new Random();
	     String alphabet = "ABCDEFJHIJKLMNOPQRSTUVWXYZ";
		    
		    for (int i = 0; i < 3; i++) {
		        randomletter = alphabet.charAt(r.nextInt(alphabet.length()));
		        randomLetters[i] = randomletter;
		    	}
		JOptionPane.showMessageDialog(null,Arrays.toString(randomLetters));
		
    		
        TheGame.main1(null);
        	
        	
    	
}
	public static void memoryInput(){
	//	System.out.println(Arrays.toString(randomLetters));
		String attempt = JOptionPane.showInputDialog("Enter the three letters shown previously separated by commas");
		
		if(attempt.equals(Arrays.toString(randomLetters))){
			 GameController.score ++;
			// System.out.println("YAY!");
		}else{
			//GameController.score -- ;
			//System.out.println("NO");
		}
		
		//if(loop <= 3){
			//loop ++;
			//TheGame.main1(null);
		//}else{
			GameController.conclusion();
		//}
	}//end method memory input
}//end class