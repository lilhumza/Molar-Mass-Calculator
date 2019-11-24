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
public class Chem11Welcome extends JFrame implements ActionListener{
    
    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblText; // To display lesson info
    JLabel lblImage;// To display clipart
    JButton btnContinue; //To continue with lesson
    JButton btnExit; //To end program
    ImageIcon imgChem = new ImageIcon("chem.png"); //adding images
    
    public Chem11Welcome(){
        
        super("Chem 11 Lesson"); //Set window title to Marks Program
        setLayout(null); // set frame layout
        getContentPane().setBackground(Color.DARK_GRAY); //Set Background color of program to dark gray
        
        //Settimng up the welcome labels
        lblWelcome = new JLabel(); //declare new GUI label
        lblWelcome.setLocation(100, 0); //Set Position of Welcome label
        lblWelcome.setSize(750, 100); //Set size of GUI label

        lblWelcome.setForeground(Color.WHITE); //Set text color to white
        lblWelcome.setText("Welcome to the Chem 11 Lesson"); //Set text title to 
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        add(lblWelcome); //Add label to GUI
        
        //Settimng up the text labels
        lblText = new JLabel(); //declare new GUI label
        lblText.setLocation(100, 75); //Set Position of Welcome label
        lblText.setSize(750, 100); //Set size of GUI label

        lblText.setForeground(Color.WHITE); //Set text color to gray
        lblText.setText("Lesson: Calculating Molar Mass & Molecular Mass"); //Set text title
        lblText.setFont(new Font ("Arial", Font.BOLD, 31)); //Set font & font size
        add(lblText); //Add label to GUI
             
        //Settimng up the image labels
        lblImage = new JLabel(); //declare new GUI label
        lblImage.setLocation(175, 175); //Set Position of Welcome label
        lblImage.setSize(600, 550); //Set size of GUI label

        lblImage.setForeground(Color.WHITE); //Set text color to gray
        lblImage.setText(""); //Set text title to 
        lblImage.setFont(new Font ("Arial", Font.BOLD, 48)); //Set font & font size
        lblImage.setIcon(imgChem); //set label to image
        add(lblImage); //Add label to GUI 
        
        //Setting up the continue button
        btnContinue = new JButton(); //declare button in GUI
        btnContinue.setLocation(150, 800); //Set position of continue button
        btnContinue.setSize(300, 80); //Set size of button

        btnContinue.setForeground(Color.BLACK); //Text colour black
        btnContinue.setText("Continue"); //Button text says "continue"
        btnContinue.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnContinue.setActionCommand("continue"); //set action command, the execution protocol to string value "continue"
        btnContinue.addActionListener(this); //Make button react to action command of continue
        add(btnContinue); //add button to gui
        
        //Setting up the exit button
        btnExit = new JButton(); //declare button in GUI
        btnExit.setLocation(500, 800); //Set position of exit button
        btnExit.setSize(300, 80); //Set size of button

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
            Chem11Lesson1 myFrame = new Chem11Lesson1 (); // create LabelFrame
            myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            myFrame.setSize( 1000,1000 ); // set frame size
            myFrame.setVisible( true ); // display frame
            this.dispose(); //Close first JFrame
            
        }
        //If exit button pressed, the following occurs 
        if(e.getActionCommand().equals("exit")){
            this.dispose(); //Close JFrame
        }
        
    }
}
