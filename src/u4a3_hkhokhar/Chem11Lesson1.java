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
public class Chem11Lesson1 extends JFrame implements ActionListener{
    
    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JTextArea txtTextAbout; //Text area for displaying sorted marks
    JButton btnTable; //To view the periodic table
    JButton btnContinue; //To continue with lesson
    JButton btnExit; //To end program
    
    public Chem11Lesson1(){
        
        
        super("Chem 11 Lesson - P1"); //Set window title to Marks Program
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
        
        //Settimng up the text labels
        txtTextAbout = new JTextArea(); //declare new GUI label
        txtTextAbout.setLineWrap(true); //Allow string to continue to next line
        txtTextAbout.setWrapStyleWord(true); //Ensure each string is on a new line
        txtTextAbout.setEditable(false); //Ensure there is no user input in the text area
        txtTextAbout.setLocation(100, 150); //Set Position of Welcome label
        txtTextAbout.setSize(750, 350); //Set size of GUI label
        
        txtTextAbout.setBackground(Color.DARK_GRAY); //Set background to dark grey
        txtTextAbout.setForeground(Color.WHITE); //Set text color to WHITE
        txtTextAbout.setText("In this lesson we will cover the fundamentals to calculating the molar mass & molecular mass of molecules.\n\nRequirements for following along this lesson are a calculator as well as a pencil & paper.\n\nPreliminary knowledge required is navigating through the periodic table of elements and basic arithmetic.\n\nBelow are buttons to proceed further, view the periodic table of elements, and exit."); //Set text title
        txtTextAbout.setFont(new Font ("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 26)); //Set font & font size & orientation
        add(txtTextAbout); //Add label to GUI
        
        //Setting up the continue button
        btnContinue = new JButton(); //declare button in GUI
        btnContinue.setLocation(75, 650); //Set position of continue button
        btnContinue.setSize(200, 80); //Set size of button

        btnContinue.setForeground(Color.BLACK); //Text colour black
        btnContinue.setText("Continue"); //Button text says "continue"
        btnContinue.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnContinue.setActionCommand("continue"); //set action command, the execution protocol to string value "continue"
        btnContinue.addActionListener(this); //Make button react to action command of continue
        add(btnContinue); //add button to gui
        
        //Setting up the table button
        btnTable = new JButton(); //declare button in GUI
        btnTable.setLocation(325, 650); //Set position of table button
        btnTable.setSize(300, 80); //Set size of button

        btnTable.setForeground(Color.BLACK); //Text colour black
        btnTable.setText("View Periodic Table"); //Button text says "View Periodic Table"
        btnTable.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnTable.setActionCommand("table"); //set action command, the execution protocol to string value "table"
        btnTable.addActionListener(this); //Make button react to action command of continue
        add(btnTable); //add button to gui
                
        //Setting up the exit button
        btnExit = new JButton(); //declare button in GUI
        btnExit.setLocation(675, 650); //Set position of exit button
        btnExit.setSize(200, 80); //Set size of button

        btnExit.setForeground(Color.BLACK); //Text colour black
        btnExit.setText("Exit"); //Button text says "exit"
        btnExit.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnExit.setActionCommand("exit"); //set action command, the execution protocol to string value "exit"
        btnExit.addActionListener(this); //Make button react to action command of exit
        add(btnExit); //add button to gui
        
        
    }
    
    public void actionPerformed (ActionEvent e){
        //If continue button pressed, the following occurs 
        if(e.getActionCommand().equals("continue")){
            Chem11Lesson2 myFrame = new Chem11Lesson2 (); // create LabelFrame
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
