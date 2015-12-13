package finalProjectPackage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class WelcomeClass extends JFrame implements ActionListener {


public static void welcome(){
	JFrame welcomeFrame = new JFrame();
	welcomeFrame.setVisible(true);
	welcomeFrame.setSize(500, 500);
    welcomeFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    welcomeFrame.setLocation(700,300);
    
    JPanel welcomePanel = new JPanel();
    welcomePanel.setLayout(new BorderLayout());
    
    JButton welcomeButton = new JButton();
    
    JLabel welcomeLabel = new JLabel("Daniel Likes Josie");
    welcomeFrame.add(welcomeLabel);
    
    
    welcomePanel.add(welcomeButton);
    welcomeFrame.add(welcomePanel);
    welcomeButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            welcomeFrame.dispose(); 
        }
    });
}

@Override
public void actionPerformed(ActionEvent e) {
	JFrame welcomeFrame = new JFrame();
	welcomeFrame.dispose();
}


}//end Class
