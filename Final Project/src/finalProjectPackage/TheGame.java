package finalProjectPackage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class TheGame extends JFrame {
	final static TheGame frame = new TheGame("Speed Test");
    JButton applyButton = new JButton("Done!");
    GridLayout experimentLayout = new GridLayout(0,5);
    public static long then;
    static JButton a = new JButton("7");
    static JButton b = new JButton("2");
    static JButton c = new JButton("24");
    static JButton d = new JButton("22");
    static JButton z = new JButton("9");
    static JButton f = new JButton("13");
    static JButton g = new JButton("3");
    static JButton h = new JButton("18");
    static JButton i = new JButton("16");
    static JButton j = new JButton("5");
    static JButton k = new JButton("4");
    static JButton l = new JButton("11");
    static JButton m = new JButton("8");
    static JButton n = new JButton("6");
    static JButton o = new JButton("1");
    static JButton p = new JButton("14");
    static JButton q = new JButton("17");
    static JButton r = new JButton("15");
    static JButton s = new JButton("12");
    static JButton t = new JButton("21");
    static JButton u = new JButton("23");
    static JButton v = new JButton("19");
    static JButton wo = new JButton("25");
    static JButton x = new JButton("20");
    static JButton y = new JButton("10");
    public TheGame(String name) {
        super(name);
        setResizable(false);
    }
     
   public TheGame() {
	}

public void initGaps() {
      //  horGapComboBox = new JComboBox(gapList);
    //   verGapComboBox = new JComboBox(gapList);
    }
     
    public void addComponentsToPane(final Container pane) {
        initGaps();
        final JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(experimentLayout);
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(6,6));
        controls.setSize(getMaximumSize());
        
        //Set up components preferred size
       // JButton a = new JButton("7");
        a.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton b = new JButton("2");
        b.setFont(new Font("Arial", Font.PLAIN, 40)); 
       // JButton c = new JButton("24");
        c.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton d = new JButton("22");
        d.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton z = new JButton("9");
        z.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton f = new JButton("13");
        f.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton g = new JButton("3");
        g.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton h = new JButton("18");
        h.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton i = new JButton("16");
        i.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton j = new JButton("5");
        j.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton k = new JButton("4");
        k.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton l = new JButton("11");
        l.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton m = new JButton("8");
        m.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton n= new JButton("6");
        n.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton o = new JButton("1");
        o.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton p = new JButton("14");
        p.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton q = new JButton("17");
        q.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton r = new JButton("15");
        r.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton s = new JButton("12");
        s.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton t = new JButton("21");
        t.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton u = new JButton("23");
        u.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton v = new JButton("19");
        v.setFont(new Font("Arial", Font.PLAIN, 40));
       // JButton w = new JButton("25");
        wo.setFont(new Font("Arial", Font.PLAIN, 40));
        //JButton x = new JButton("20");
        x.setFont(new Font("Arial", Font.PLAIN, 40));
      //  JButton y = new JButton("10");
        y.setFont(new Font("Arial", Font.PLAIN, 40));
        
        a.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d.setEnabled(true);
        z.setEnabled(true);
        f.setEnabled(true);
        g.setEnabled(true);
        h.setEnabled(true);
        i.setEnabled(true);
        j.setEnabled(true);
        k.setEnabled(true);
        l.setEnabled(true);
        m.setEnabled(true);
        n.setEnabled(true);
        o.setEnabled(true);
        p.setEnabled(true);
        q.setEnabled(true);
        r.setEnabled(true);
        s.setEnabled(true);
        t.setEnabled(true);
        u.setEnabled(true);
        v.setEnabled(true);
        wo.setEnabled(true);
        x.setEnabled(true);
        y.setEnabled(true);
        
        Dimension buttonSize = b.getMaximumSize();
        compsToExperiment.setMaximumSize(new Dimension((int)(buttonSize.getWidth() * 10),
                (int)(buttonSize.getHeight() * 24) ));
         
        //Add buttons to experiment with Grid Layout
        
        compsToExperiment.add(a);
        compsToExperiment.add(b);
        compsToExperiment.add(c);
        compsToExperiment.add(d);
        compsToExperiment.add(z);
        compsToExperiment.add(f);
        compsToExperiment.add(g);
        compsToExperiment.add(h);
        compsToExperiment.add(i);
        compsToExperiment.add(j);
        compsToExperiment.add(k);
        compsToExperiment.add(l);
        compsToExperiment.add(m);
        compsToExperiment.add(n);
        compsToExperiment.add(o);
        compsToExperiment.add(p);
        compsToExperiment.add(q);
        compsToExperiment.add(r);
        compsToExperiment.add(s);
        compsToExperiment.add(t);
        compsToExperiment.add(u);
        compsToExperiment.add(v);
        compsToExperiment.add(wo);
        compsToExperiment.add(x);  
        compsToExperiment.add(y);
        

        applyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	frame.dispose();
            	
            	TheGame TheGame = new TheGame();
            	then = System.currentTimeMillis();
            	Memory.memoryInput();
            }
          }
        );
     
        controls.add(applyButton);
 
        
        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                a.setEnabled(false); 
            }
        });
        
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                b.setEnabled(false); 
            }
        });
        
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                c.setEnabled(false); 
            }
        });
        d.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                d.setEnabled(false); 
            }
        });
        z.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                z.setEnabled(false); 
            }
        });
        f.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setEnabled(false); 
            }
        });
        g.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                g.setEnabled(false); 
            }
        });
        h.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                h.setEnabled(false); 
            }
        });
        i.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                i.setEnabled(false); 
            }
        });
       j.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                j.setEnabled(false); 
            }
        });
        k.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                k.setEnabled(false); 
            }
        });
        l.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                l.setEnabled(false); 
            }
        });
        m.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                m.setEnabled(false); 
            }
        });
        n.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                n.setEnabled(false); 
            }
        });
        o.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                o.setEnabled(false); 
            }
        });
        p.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                p.setEnabled(false); 
            }
        });
        q.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                q.setEnabled(false); 
            }
        });
        r.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                r.setEnabled(false); 
            }
        });
        s.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                s.setEnabled(false); 
            }
        });
        t.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t.setEnabled(false); 
            }
        });
        u.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                u.setEnabled(false); 
            }
        });
        v.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                v.setEnabled(false); 
            }
        });
        wo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                wo.setEnabled(false); 
            }
        });
        x.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                x.setEnabled(false); 
            }
        });
        y.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               y.setEnabled(false); 
            }
        });
        
       pane.add(compsToExperiment, BorderLayout.NORTH);
       pane.add(controls, BorderLayout.SOUTH);
    }
     

    public static void createAndShowGUI() {
    	frame.repaint();
        frame.setMaximumSize(null);
        frame.setLocationRelativeTo(null);
        frame.addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true); 
        
    }
     
    public static void main1(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } 
 
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
                WelcomeClass WelcomeClass = new WelcomeClass();
                GameController GameController = new GameController();
                long rtime = then - WelcomeClass.now;
                if(rtime > 15){
                	GameController.score --;
                }else
                	GameController.score ++;
                
            }
        });
    }
   
}