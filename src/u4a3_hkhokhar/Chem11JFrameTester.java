package u4a3_hkhokhar;
import javax.swing.JFrame;

/**
 * @author Humza Khokhar
 * Date: August 13
 * Program: Chem 11 Lesson
 * Purpose: Culminating Activity
 */
public class Chem11JFrameTester {

    public static void main(String[] args) {
        // TODO code application logic here
        Chem11Welcome myFrame = new Chem11Welcome (); // create LabelFrame
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myFrame.setSize( 1000,1000 ); // set frame size
        myFrame.setVisible( true ); // display frame
        
    }
    
}
