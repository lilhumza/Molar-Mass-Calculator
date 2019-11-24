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
public class Chem11PeriodicTableElements extends JFrame implements ActionListener{
    
    JLabel lblTable; //To display periodic table
    ImageIcon imgTable = new ImageIcon("table.jpg"); //adding images
    JButton btnClose; //To close JFrame
    
    public Chem11PeriodicTableElements(){
        
        super("Chem 11 Lesson - Table of Elements"); //Set window title to Chem 11 Lesson - Table of Elements
        setLayout(null); // set frame layout
        getContentPane().setBackground(Color.DARK_GRAY); //Set Background color of program to dark gray
        
        //Settimng up the image labels
        lblTable = new JLabel(); //declare new GUI label
        lblTable.setLocation(0,0); //Set Position of Welcome label
        lblTable.setSize(2000, 1000); //Set size of GUI label

        lblTable.setIcon(imgTable); //set label to image
        add(lblTable); //Add label to GUI 
        
        //Setting up the close button
        btnClose = new JButton(); //declare button in GUI
        btnClose.setLocation(1500, 75); //Set position of exit button
        btnClose.setSize(300, 80); //Set size of button

        btnClose.setForeground(Color.BLACK); //Text colour black
        btnClose.setText("Close"); //Button text says "exit"
        btnClose.setFont(new Font ("Arial", Font.BOLD, 24)); //set font & size
        btnClose.setActionCommand("close"); //set action command, the execution protocol to string value "exit"
        btnClose.addActionListener(this); //Make button react to action command of exit
        add(btnClose); //add button to gui
        
        
        
    }
    
    public void actionPerformed (ActionEvent e){
        //If add button pressed, the following occurs 
        if(e.getActionCommand().equals("close")){
            this.dispose();
        }
        
    }
}
