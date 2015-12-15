package finalProjectPackage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class WelcomeClass extends JFrame implements ActionListener {
	static TheGame TheGame = new TheGame();
	public static long now;

public static void welcome(){
	JFrame welcomeFrame = new JFrame();
	welcomeFrame.setVisible(true);
	welcomeFrame.setSize(500, 500);
    welcomeFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    welcomeFrame.setLocationRelativeTo(null);
    
    JPanel welcomePanel = new JPanel();
  //  welcomePanel.setLocation(0,0);
    
    
    JButton welcomeButton = new JButton();
    welcomeButton.setText("OK");
    welcomeButton.setSize(20,20);
 //   welcomeButton.setLocation(200,10);
    
    JLabel welcomeLabel = new JLabel("Daniel");
    JLabel welcomelabel1 = new JLabel();
    JLabel welcomelabel2 = new JLabel();
    JLabel welcomelabel3 = new JLabel();
    JLabel welcomelabel4 = new JLabel();
    JLabel welcomelabel5 = new JLabel();
    JLabel welcomelabel6 = new JLabel();
    welcomeLabel.setText("Hello! Welcome to Daniel's Concussion Test. ");
    welcomelabel1.setText("This will be a test of speed and memory. First, you will begin by \n");
    welcomelabel2.setText("clicking the buttons counting DOWN from 25.");
    welcomelabel3.setText("Then, you will be shown three letters. After this, click the buttons");
    welcomelabel4.setText("in descending order again.");
    welcomelabel5.setText("After this, you will be asked to remember the three letters again.");
    welcomelabel5.setText("The test will start when you clik 'OK'");
    welcomeLabel.setVisible(true);
    welcomeLabel.setLocation(120,0);
    welcomeLabel.setSize(500,200);
    
    welcomelabel1.setVisible(true);
    welcomelabel1.setLocation(90,20);
    welcomelabel1.setSize(500,200);
    
    welcomelabel2.setVisible(true);
    welcomelabel2.setLocation(90,40);
    welcomelabel2.setSize(500,200);
    
    welcomelabel3.setVisible(true);
    welcomelabel3.setLocation(90,60);
    welcomelabel3.setSize(500,200);
    
    welcomelabel4.setVisible(true);
    welcomelabel4.setLocation(90,80);
    welcomelabel4.setSize(500,200);
    
    welcomelabel5.setVisible(true);
    welcomelabel5.setLocation(90,100);
    welcomelabel5.setSize(500,200);
    
    welcomelabel6.setVisible(true);
    welcomelabel6.setLocation(90,120);
    welcomelabel6.setSize(500,200);
    
    welcomeFrame.add(welcomeLabel);
    welcomeFrame.add(welcomelabel1);
    welcomeFrame.add(welcomelabel2);
    welcomeFrame.add(welcomelabel3);
    welcomeFrame.add(welcomelabel4);
    welcomeFrame.add(welcomelabel5);
    welcomeFrame.add(welcomelabel6);
    
    welcomePanel.add(welcomeButton, BorderLayout.SOUTH);
    welcomeFrame.add(welcomePanel);
    welcomeButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            welcomeFrame.dispose(); 
            Memory.memory();
        } 
    });
}

@Override
public void actionPerformed(ActionEvent e) {
	JFrame welcomeFrame = new JFrame();
	welcomeFrame.dispose();
	CloseFrame.closeFrame();
	now = System.currentTimeMillis();	
}


}//end Class
