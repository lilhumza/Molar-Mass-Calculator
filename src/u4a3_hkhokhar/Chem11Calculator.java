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
public class Chem11Calculator extends JFrame implements ActionListener{
    
    //Declaring the Components to use
    JLabel lblWelcome; // To display  a title for the JFrame
    JLabel lblCount;
    JTextField txtCount;
    JLabel lblNumOf1;
    JLabel lblNumOf2;
    JLabel lblNumOf3;
    JLabel lblNumOf4;
    JTextField txtNumOf1;
    JTextField txtNumOf2;
    JTextField txtNumOf3;
    JTextField txtNumOf4;
    JLabel lblElementNum1;
    JLabel lblMass1;
    JTextField txtNum1;
    JTextField txtMass1;
    JLabel lblElementNum2;
    JLabel lblMass2;
    JTextField txtNum2;
    JTextField txtMass2;
    JLabel lblElementNum3;
    JLabel lblMass3;
    JTextField txtNum3;
    JTextField txtMass3;
    JLabel lblElementNum4;
    JLabel lblMass4;
    JTextField txtNum4;
    JTextField txtMass4;
    JLabel lblOutput;
    JButton btnProcess;
    JButton btnTable;
    JButton btnExit; //To end program
    
    public Chem11Calculator(){
        
        super("Chem 11 Lesson - Calculator"); //Set window title to Marks Program
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
        
        //Settimng up the welcome labels
        lblCount = new JLabel(); //declare new GUI label
        lblCount.setLocation(50, 75); //Set Position of Welcome label
        lblCount.setSize(600, 100); //Set size of GUI label

        lblCount.setForeground(Color.WHITE); //Set text color to gray
        lblCount.setText("Enter the number of elements: "); //Set text title to 
        lblCount.setFont(new Font ("Arial", Font.BOLD, 26)); //Set font & font size
        add(lblCount); //Add label to GUI
        
        //Marks text field setup
        txtCount = new JTextField(); //Declare text field in GUI
        txtCount.setLocation(700, 100); //Set position of text field for marks
        txtCount.setSize(150, 40); //Set size of marks text field

        txtCount.setForeground(Color.BLACK); //Set text colour as black
        txtCount.setText(""); //Keep text field empty until user input
        txtCount.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtCount); //Add text field to GUI
        
        //Settimng up the welcome labels
        lblElementNum1 = new JLabel(); //declare new GUI label
        lblElementNum1.setLocation(50, 150); //Set Position of Welcome label
        lblElementNum1.setSize(600, 100); //Set size of GUI label

        lblElementNum1.setForeground(Color.WHITE); //Set text color to gray
        lblElementNum1.setText("Enter the atomic mass of element 1: "); //Set text title to 
        lblElementNum1.setFont(new Font ("Arial", Font.BOLD, 26)); //Set font & font size
        add(lblElementNum1); //Add label to GUI
        
        //Marks text field setup
        txtNum1 = new JTextField(); //Declare text field in GUI
        txtNum1.setLocation(700, 175); //Set position of text field for marks
        txtNum1.setSize(150, 40); //Set size of marks text field

        txtNum1.setForeground(Color.BLACK); //Set text colour as black
        txtNum1.setText(""); //Keep text field empty until user input
        txtNum1.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtNum1); //Add text field to GUI
        
        //Settimng up the welcome labels
        lblElementNum2 = new JLabel(); //declare new GUI label
        lblElementNum2.setLocation(50, 225); //Set Position of Welcome label
        lblElementNum2.setSize(600, 100); //Set size of GUI label

        lblElementNum2.setForeground(Color.WHITE); //Set text color to gray
        lblElementNum2.setText("Enter the atomic mass of element 2: "); //Set text title to 
        lblElementNum2.setFont(new Font ("Arial", Font.BOLD, 26)); //Set font & font size
        add(lblElementNum2); //Add label to GUI
        
        //Marks text field setup
        txtNum2 = new JTextField(); //Declare text field in GUI
        txtNum2.setLocation(700, 250); //Set position of text field for marks
        txtNum2.setSize(150, 40); //Set size of marks text field

        txtNum2.setForeground(Color.BLACK); //Set text colour as black
        txtNum2.setText(""); //Keep text field empty until user input
        txtNum2.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtNum2); //Add text field to GUI
        
        //Settimng up the welcome labels
        lblElementNum3 = new JLabel(); //declare new GUI label
        lblElementNum3.setLocation(50, 300); //Set Position of Welcome label
        lblElementNum3.setSize(600, 100); //Set size of GUI label

        lblElementNum3.setForeground(Color.WHITE); //Set text color to gray
        lblElementNum3.setText("Enter the atomic mass of element 3: "); //Set text title to 
        lblElementNum3.setFont(new Font ("Arial", Font.BOLD, 26)); //Set font & font size
        add(lblElementNum3); //Add label to GUI
        
        //Marks text field setup
        txtNum3 = new JTextField(); //Declare text field in GUI
        txtNum3.setLocation(700, 325); //Set position of text field for marks
        txtNum3.setSize(150, 40); //Set size of marks text field

        txtNum3.setForeground(Color.BLACK); //Set text colour as black
        txtNum3.setText(""); //Keep text field empty until user input
        txtNum3.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtNum3); //Add text field to GUI
        
        //Settimng up the welcome labels
        lblElementNum4 = new JLabel(); //declare new GUI label
        lblElementNum4.setLocation(50, 375); //Set Position of Welcome label
        lblElementNum4.setSize(600, 100); //Set size of GUI label

        lblElementNum4.setForeground(Color.WHITE); //Set text color to gray
        lblElementNum4.setText("Enter the atomic mass of element 4: "); //Set text title to 
        lblElementNum4.setFont(new Font ("Arial", Font.BOLD, 26)); //Set font & font size
        add(lblElementNum4); //Add label to GUI
        
        //Marks text field setup
        txtNum4 = new JTextField(); //Declare text field in GUI
        txtNum4.setLocation(700, 400); //Set position of text field for marks
        txtNum4.setSize(150, 40); //Set size of marks text field

        txtNum4.setForeground(Color.BLACK); //Set text colour as black
        txtNum4.setText(""); //Keep text field empty until user input
        txtNum4.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtNum4); //Add text field to GUI
        
        //Settimng up the welcome labels
        lblNumOf1 = new JLabel(); //declare new GUI label
        lblNumOf1.setLocation(50, 450); //Set Position of Welcome label
        lblNumOf1.setSize(600, 100); //Set size of GUI label

        lblNumOf1.setForeground(Color.WHITE); //Set text color to gray
        lblNumOf1.setText("Enter the number of element 1 atoms: "); //Set text title to 
        lblNumOf1.setFont(new Font ("Arial", Font.BOLD, 26)); //Set font & font size
        add(lblNumOf1); //Add label to GUI
        
        //Marks text field setup
        txtNumOf1 = new JTextField(); //Declare text field in GUI
        txtNumOf1.setLocation(700, 475); //Set position of text field for marks
        txtNumOf1.setSize(150, 40); //Set size of marks text field

        txtNumOf1.setForeground(Color.BLACK); //Set text colour as black
        txtNumOf1.setText(""); //Keep text field empty until user input
        txtNumOf1.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtNumOf1); //Add text field to GUI
        
        //Settimng up the welcome labels
        lblNumOf2 = new JLabel(); //declare new GUI label
        lblNumOf2.setLocation(50, 525); //Set Position of Welcome label
        lblNumOf2.setSize(600, 100); //Set size of GUI label

        lblNumOf2.setForeground(Color.WHITE); //Set text color to gray
        lblNumOf2.setText("Enter the number of element 2 atoms: "); //Set text title to 
        lblNumOf2.setFont(new Font ("Arial", Font.BOLD, 26)); //Set font & font size
        add(lblNumOf2); //Add label to GUI
        
        //Marks text field setup
        txtNumOf2 = new JTextField(); //Declare text field in GUI
        txtNumOf2.setLocation(700, 550); //Set position of text field for marks
        txtNumOf2.setSize(150, 40); //Set size of marks text field

        txtNumOf2.setForeground(Color.BLACK); //Set text colour as black
        txtNumOf2.setText(""); //Keep text field empty until user input
        txtNumOf2.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtNumOf2); //Add text field to GUI
        
        //Settimng up the welcome labels
        lblNumOf3 = new JLabel(); //declare new GUI label
        lblNumOf3.setLocation(50, 600); //Set Position of Welcome label
        lblNumOf3.setSize(600, 100); //Set size of GUI label

        lblNumOf3.setForeground(Color.WHITE); //Set text color to gray
        lblNumOf3.setText("Enter the number of element 3 atoms: "); //Set text title to 
        lblNumOf3.setFont(new Font ("Arial", Font.BOLD, 26)); //Set font & font size
        add(lblNumOf3); //Add label to GUI
        
        //Marks text field setup
        txtNumOf3 = new JTextField(); //Declare text field in GUI
        txtNumOf3.setLocation(700, 625); //Set position of text field for marks
        txtNumOf3.setSize(150, 40); //Set size of marks text field

        txtNumOf3.setForeground(Color.BLACK); //Set text colour as black
        txtNumOf3.setText(""); //Keep text field empty until user input
        txtNumOf3.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtNumOf3); //Add text field to GUI
        
        //Settimng up the welcome labels
        lblNumOf4 = new JLabel(); //declare new GUI label
        lblNumOf4.setLocation(50,675); //Set Position of Welcome label
        lblNumOf4.setSize(600, 100); //Set size of GUI label

        lblNumOf4.setForeground(Color.WHITE); //Set text color to gray
        lblNumOf4.setText("Enter the number of element 4 atoms: "); //Set text title to 
        lblNumOf4.setFont(new Font ("Arial", Font.BOLD, 26)); //Set font & font size
        add(lblNumOf4); //Add label to GUI
        
        //Marks text field setup
        txtNumOf4 = new JTextField(); //Declare text field in GUI
        txtNumOf4.setLocation(700, 700); //Set position of text field for marks
        txtNumOf4.setSize(150, 40); //Set size of marks text field

        txtNumOf4.setForeground(Color.BLACK); //Set text colour as black
        txtNumOf4.setText(""); //Keep text field empty until user input
        txtNumOf4.setFont(new Font ("Arial", Font.BOLD, 24)); //Set font & size
        add(txtNumOf4); //Add text field to GUI      
        
        //Settimng up the welcome labels
        lblOutput = new JLabel(); //declare new GUI label
        lblOutput.setLocation(50,750); //Set Position of Welcome label
        lblOutput.setSize(900, 100); //Set size of GUI label

        lblOutput.setForeground(Color.WHITE); //Set text color to gray
        lblOutput.setText(""); //Set text title to 
        lblOutput.setFont(new Font ("Arial", Font.BOLD, 26)); //Set font & font size
        add(lblOutput); //Add label to GUI
        
        //Setting up the continue button
        btnProcess = new JButton(); //declare button in GUI
        btnProcess.setLocation(75, 850); //Set position of continue button
        btnProcess.setSize(200, 80); //Set size of button

        btnProcess.setForeground(Color.BLACK); //Text colour black
        btnProcess.setText("Process"); //Button text says "continue"
        btnProcess.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnProcess.setActionCommand("process"); //set action command, the execution protocol to string value "continue"
        btnProcess.addActionListener(this); //Make button react to action command of continue
        add(btnProcess); //add button to gui
        
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
        if(e.getActionCommand().equals("process")){
           int intNum = Integer.parseInt(txtCount.getText());
           int intNum1;
           int intNum2;
           int intNum3;
           int intNum4;
           double dblMass1;
           double dblMass2;
           double dblMass3;
           double dblMass4;
           double dblMassTotal;
           
           switch (intNum){
               case 2:
                   intNum1 = Integer.parseInt(txtNumOf1.getText());
                   intNum2 = Integer.parseInt(txtNumOf2.getText());
                   dblMass1 = Double.parseDouble(txtNum1.getText());
                   dblMass2 = Double.parseDouble(txtNum2.getText());
                   
                   dblMassTotal = (double) intNum1 * dblMass1 + intNum2 * dblMass2;
                   dblMassTotal = Math.round(dblMassTotal * 100.0) / 100.0;
                   
                   lblOutput.setText(dblMassTotal+" g/mol & amu");
                   break;
               case 3:
                   intNum1 = Integer.parseInt(txtNumOf1.getText());
                   intNum2 = Integer.parseInt(txtNumOf2.getText());
                   intNum3 = Integer.parseInt(txtNumOf3.getText());
                   dblMass1 = Double.parseDouble(txtNum1.getText());
                   dblMass2 = Double.parseDouble(txtNum2.getText());
                   dblMass3 = Double.parseDouble(txtNum3.getText());
                   
                   dblMassTotal = (double)intNum1 * dblMass1 + intNum2 * dblMass2 + intNum3 *dblMass3;
                   dblMassTotal = Math.round(dblMassTotal * 100.0) / 100.0;
                   
                   lblOutput.setText(dblMassTotal+" g/mol & amu");
                   break;
               case 4:
                   intNum1 = Integer.parseInt(txtNumOf1.getText());
                   intNum2 = Integer.parseInt(txtNumOf2.getText());
                   intNum3 = Integer.parseInt(txtNumOf3.getText());
                   intNum4 = Integer.parseInt(txtNumOf4.getText());
                   dblMass1 = Double.parseDouble(txtNum1.getText());
                   dblMass2 = Double.parseDouble(txtNum2.getText());
                   dblMass3 = Double.parseDouble(txtNum3.getText());
                   dblMass4 = Double.parseDouble(txtNum4.getText());
                   
                   dblMassTotal = (double)intNum1 * dblMass1 + intNum2 * dblMass2 + intNum3 *dblMass3 + intNum4 * dblMass4;
                   dblMassTotal = Math.round(dblMassTotal * 100.0) / 100.0;
                   
                   lblOutput.setText("The Molar Mass & Molecular Mass is "+dblMassTotal+" g/mol & amu");
                   break;
               default:
                   lblOutput.setText("Error, calculator only takes number inputs and calculates a maximum of 4 different elements on a molecule.");
                   
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
}
