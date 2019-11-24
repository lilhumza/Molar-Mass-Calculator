package u4a3_hkhokhar;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Humza Khokhar
 * Date: August 13
 * Program: Chem 11 Lesson
 * Purpose: Culminating Activity
 */
public class Chem11Practice extends JFrame implements ActionListener{
    
    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblImage;// To display clipart
    JLabel lblCorrect;// To display clipart
    ImageIcon imgWater = new ImageIcon("vinegar.png"); //adding images
    JRadioButton btnOption1;
    JRadioButton btnOption2;
    JRadioButton btnOption3;
    JRadioButton btnOption4;
    JButton btnTable; //To view the periodic table
    JButton btnContinue; //To continue with lesson
    JButton btnExit; //To end program
    
    
    public Chem11Practice(){
        super("Chem 11 Lesson - Practice Question"); //Set window title to Marks Program
        setLayout(null); // set frame layout
        getContentPane().setBackground(Color.DARK_GRAY); //Set Background color of program to dark gray
        
        //Settimng up the welcome labels
        lblWelcome = new JLabel(); //declare new GUI label
        lblWelcome.setLocation(50, 0); //Set Position of Welcome label
        lblWelcome.setSize(875, 100); //Set size of GUI label

        lblWelcome.setForeground(Color.WHITE); //Set text color to gray
        lblWelcome.setText("Chem 11 Lesson - Calculating Molar Mass & Molecular Mass"); //Set text title to 
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 30)); //Set font & font size
        add(lblWelcome); //Add label to GUI
        
        //Settimng up the image labels
        lblImage = new JLabel(); //declare new GUI label
        lblImage.setLocation(350, 75); //Set Position of Welcome label
        lblImage.setSize(900, 150); //Set size of GUI label

        lblImage.setForeground(Color.WHITE); //Set text color to gray
        lblImage.setText(""); //Set text title to 
        lblImage.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        lblImage.setIcon(imgWater); //set label to image
        add(lblImage); //Add label to GUI
        
        //Settimng up the image labels
        lblCorrect = new JLabel(); //declare new GUI label
        lblCorrect.setLocation(350, 600); //Set Position of Welcome label
        lblCorrect.setSize(300, 150); //Set size of GUI label

        lblCorrect.setForeground(Color.RED); //Set text color to gray
        lblCorrect.setText(""); //Set text title to 
        lblCorrect.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        add(lblCorrect); //Add label to GUI
      
        
        btnOption1 = new JRadioButton();
        btnOption1.setLocation(350, 300);
        btnOption1.setSize(300, 50);
        
        btnOption1.setForeground(Color.WHITE);
        btnOption1.setBackground(Color.DARK_GRAY);
        btnOption1.setText("60.052 g/mol");
        btnOption1.setFont(new Font ("Arial", Font.BOLD, 36));
        btnOption1.setActionCommand("opt1");
        btnOption1.addActionListener(this);
        add(btnOption1);
        
        btnOption2 = new JRadioButton();
        btnOption2.setLocation(350, 375);
        btnOption2.setSize(300, 50);
        
        btnOption2.setForeground(Color.WHITE);
        btnOption2.setBackground(Color.DARK_GRAY);
        btnOption2.setText("60.05 amu");
        btnOption2.setFont(new Font ("Arial", Font.BOLD, 36));
        btnOption2.setActionCommand("opt2");
        btnOption2.addActionListener(this);
        add(btnOption2);
        
        btnOption3 = new JRadioButton();
        btnOption3.setLocation(350, 450);
        btnOption3.setSize(300, 50);
        
        btnOption3.setForeground(Color.WHITE);
        btnOption3.setBackground(Color.DARK_GRAY);
        btnOption3.setText("60 g/mol");
        btnOption3.setFont(new Font ("Arial", Font.BOLD, 36));
        btnOption3.setActionCommand("opt3");
        btnOption3.addActionListener(this);
        add(btnOption3);
        
        btnOption4 = new JRadioButton();
        btnOption4.setLocation(350, 525);
        btnOption4.setSize(300, 50);
        
        btnOption4.setForeground(Color.WHITE);
        btnOption4.setBackground(Color.DARK_GRAY);
        btnOption4.setText("60.05 g/mol");
        btnOption4.setFont(new Font ("Arial", Font.BOLD, 36));
        btnOption4.setActionCommand("opt4");
        btnOption4.addActionListener(this);
        add(btnOption4);
               
        //Setting up the continue button
        btnContinue = new JButton(); //declare button in GUI
        btnContinue.setLocation(75, 850); //Set position of continue button
        btnContinue.setSize(200, 80); //Set size of button

        btnContinue.setForeground(Color.BLACK); //Text colour black
        btnContinue.setText("Continue"); //Button text says "continue"
        btnContinue.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnContinue.setActionCommand("continue"); //set action command, the execution protocol to string value "continue"
        btnContinue.addActionListener(this); //Make button react to action command of continue
        btnContinue.setEnabled(false);
        add(btnContinue); //add button to gui
        
        //Setting up the table button
        btnTable = new JButton(); //declare button in GUI
        btnTable.setLocation(325, 850); //Set position of table button
        btnTable.setSize(300, 80); //Set size of button

        btnTable.setForeground(Color.BLACK); //Text colour black
        btnTable.setText("View Periodic Table"); //Button text says "View Periodic Table"
        btnTable.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnTable.setActionCommand("table"); //set action command, the execution protocol to string value "table"
        btnTable.addActionListener(this); //Make button react to action command of continue
        add(btnTable); //add button to gui
                
        //Setting up the exit button
        btnExit = new JButton(); //declare button in GUI
        btnExit.setLocation(675, 850); //Set position of exit button
        btnExit.setSize(200, 80); //Set size of button

        btnExit.setForeground(Color.BLACK); //Text colour black
        btnExit.setText("Exit"); //Button text says "exit"
        btnExit.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnExit.setActionCommand("exit"); //set action command, the execution protocol to string value "exit"
        btnExit.addActionListener(this); //Make button react to action command of exit
        add(btnExit); //add button to gui
    }
    
    public void actionPerformed (ActionEvent e){
        //If add button pressed, the following occurs 
        if(e.getActionCommand().equals("opt4")){
            lblCorrect.setForeground(Color.BLUE);
            lblCorrect.setText("Correct");
            btnContinue.setEnabled(true);
        } 
        
        if(e.getActionCommand().equals("opt3")){
            lblCorrect.setText("Try Again");
        }
        if(e.getActionCommand().equals("opt2")){
            lblCorrect.setText("Try Again");
        }
        if(e.getActionCommand().equals("opt1")){
            lblCorrect.setText("Try Again");
        }
        
        //If continue button pressed, the following occurs 
        if(e.getActionCommand().equals("continue")){
            Chem11Calculator myFrame = new Chem11Calculator (); // create LabelFrame
            myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            myFrame.setSize( 1000,1000 ); // set frame size
            myFrame.setVisible( true ); // display frame
            this.dispose(); //Close first JFrame
            
        }
        //If table button pressed, the following occurs 
        if(e.getActionCommand().equals("table")){
           Chem11PeriodicTableElements myFrame = new Chem11PeriodicTableElements (); // create LabelFrame
           myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           myFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
           myFrame.setVisible( true ); // display frame
                       
        }
        //If exit button pressed, the following occurs 
        if(e.getActionCommand().equals("exit")){
            this.dispose();
            
        } 
             
    }
}
