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
public class Chem11Lesson4 extends JFrame implements ActionListener{
    
    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblImage;// To display clipart
    ImageIcon imgWater = new ImageIcon("h2o.png"); //adding images
    JTextArea txtCalculate; //Text area for atomic mass info
    JButton btnTable; //To view the periodic table
    JButton btnContinue; //To continue with lesson
    JButton btnExit; //To end program
    
    public Chem11Lesson4(){
        super("Chem 11 Lesson - P4"); //Set window title to Marks Program
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
        lblImage.setLocation(300, 50); //Set Position of Welcome label
        lblImage.setSize(350, 300); //Set size of GUI label

        lblImage.setForeground(Color.WHITE); //Set text color to gray
        lblImage.setText(""); //Set text title to 
        lblImage.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        lblImage.setIcon(imgWater); //set label to image
        add(lblImage); //Add label to GUI
        
        //Settimng up the text labels
        txtCalculate = new JTextArea(); //declare new GUI label
        txtCalculate.setLineWrap(true); //Allow string to continue to next line
        
        txtCalculate.setWrapStyleWord(true); //Ensure each string is on a new line
        txtCalculate.setEditable(false); //Ensure there is no user input in the text area
        txtCalculate.setLocation(50, 325); //Set Position of Welcome label
        txtCalculate.setSize(900, 525); //Set size of GUI label
        
        txtCalculate.setBackground(Color.DARK_GRAY); //Set background to dark grey
        txtCalculate.setForeground(Color.WHITE); //Set text color to WHITE
        txtCalculate.setText("In order to calculate the molar mass & molecular mass of a water molecule we need to retrieve the atomic mass for each element in the chemical formula. \n\nHydrogen = 1.008 amu\nOxygen = 15.999 amu\n\nThe next step is to determine the number of each element in the molecule: in water there are two hydrogens and one oxygen.\n\nThe final step is multiplying the number of each element by it's mass and adding the results together.\n\nIt should look like this:\n\nM = 2(1.008) + 15.999\n\nM = 18.015 = 18.02 g/mol & amu"); //Set text title
        txtCalculate.setFont(new Font ("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 26)); //Set font & font size & orientation
        add(txtCalculate); //Add label to GUI
        
        //Setting up the continue button
        btnContinue = new JButton(); //declare button in GUI
        btnContinue.setLocation(75, 850); //Set position of continue button
        btnContinue.setSize(200, 80); //Set size of button

        btnContinue.setForeground(Color.BLACK); //Text colour black
        btnContinue.setText("Continue"); //Button text says "continue"
        btnContinue.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnContinue.setActionCommand("continue"); //set action command, the execution protocol to string value "continue"
        btnContinue.addActionListener(this); //Make button react to action command of continue
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
        //If continue button pressed, the following occurs 
        if(e.getActionCommand().equals("continue")){
            Chem11Practice myFrame = new Chem11Practice (); // create LabelFrame
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
