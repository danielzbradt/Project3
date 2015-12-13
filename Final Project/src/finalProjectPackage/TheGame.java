package finalProjectPackage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class TheGame extends JFrame {
    static final String gapList[] = {"0", "10", "15", "20"};
    final static int maxGap = 20;
    JComboBox horGapComboBox;
    JComboBox verGapComboBox;
    JButton applyButton = new JButton("Apply gaps");
    GridLayout experimentLayout = new GridLayout(0,5);
     
    public TheGame(String name) {
        super(name);
        setResizable(false);
    }
     
   public TheGame() {
		// TODO Auto-generated constructor stub
	}

public void initGaps() {
        horGapComboBox = new JComboBox(gapList);
       verGapComboBox = new JComboBox(gapList);
    }
     
    public void addComponentsToPane(final Container pane) {
        initGaps();
        final JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(experimentLayout);
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(6,6));
        controls.setSize(getMaximumSize());
        
        //Set up components preferred size
        JButton a = new JButton("7");
        a.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton b = new JButton("2");
        b.setFont(new Font("Arial", Font.PLAIN, 40)); 
        JButton c = new JButton("24");
        c.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton d = new JButton("22");
        d.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton z = new JButton("9");
        z.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton f = new JButton("13");
        f.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton g = new JButton("3");
        g.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton h = new JButton("18");
        h.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton i = new JButton("16");
        i.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton j = new JButton("5");
        j.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton k = new JButton("4");
        k.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton l = new JButton("11");
        l.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton m = new JButton("8");
        m.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton n= new JButton("6");
        n.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton o = new JButton("1");
        o.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton p = new JButton("14");
        p.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton q = new JButton("17");
        q.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton r = new JButton("15");
        r.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton s = new JButton("12");
        s.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton t = new JButton("21");
        t.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton u = new JButton("23");
        u.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton v = new JButton("19");
        v.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton w = new JButton("25");
        w.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton x = new JButton("20");
        x.setFont(new Font("Arial", Font.PLAIN, 40));
        JButton y = new JButton("10");
        y.setFont(new Font("Arial", Font.PLAIN, 40));
        
        Dimension buttonSize = b.getMaximumSize();
        compsToExperiment.setMaximumSize(new Dimension((int)(buttonSize.getWidth() * 10)+maxGap,
                (int)(buttonSize.getHeight() * 24)+maxGap ));
         
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
        compsToExperiment.add(w);
        compsToExperiment.add(x);
        compsToExperiment.add(y);
        

        applyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               b.setEnabled(false);
            }
          }
        );
        //Add controls to set up horizontal and vertical gaps
        /*
        controls.add(new Label("Horizontal gap:"));
        controls.add(new Label("Vertical gap:"));
        controls.add(new Label(" "));
        controls.add(horGapComboBox);
        controls.add(verGapComboBox);
        controls.add(applyButton);
         */
        //Process the Apply gaps button press
        
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
        w.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                w.setEnabled(false); 
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
    //    pane.add(new JSeparator(), BorderLayout.CENTER);
   //     pane.add(controls, BorderLayout.SOUTH);
    }
     
    /**
     * Create the GUI and show it.  For thread safety,
     * this method is invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        TheGame frame = new TheGame("Speed Test");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        frame.setMaximumSize(null);
        //Set up the content pane.
        frame.addComponentsToPane(frame.getContentPane());
        //Display the window.
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
        /* Turn off metal's use of bold fonts */
     //  UIManager.put("swing.boldMetal", Boolean.FALSE)
         
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
   
}