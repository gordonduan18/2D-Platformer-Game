/** 
 * this template can be used for a start menu
 * for your final project
**/


//Imports
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.SwingUtilities;

class StartingFrame extends JFrame { 
private static final long serialVersionUID = 7526472295622776147L;  // unique id

  JFrame thisFrame;
  
  //Constructor - this runs first
  StartingFrame() { 
    super("Start Screen");
    this.thisFrame = this; //lol  
    
    //configure the window
    int maxX = Toolkit.getDefaultToolkit().getScreenSize().width;
    int maxY = (int)Math.round(Toolkit.getDefaultToolkit().getScreenSize().height*0.957);
    this.setSize(maxX,maxY);
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setResizable (false);
    
    //Create a Panel for stuff
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    
    //Create a JButton for the centerPanel
    JButton startButton = new JButton("START");
    startButton.addActionListener(new StartButtonListener());
    
     //Create a JButton for the centerPanel
    JLabel startLabel = new JLabel("Battle Block Theatre!");
    
    //Add all panels to the mainPanel according to border layout
    mainPanel.add(startButton,BorderLayout.SOUTH);
    mainPanel.add(startLabel,BorderLayout.CENTER);
    
    //add the main panel to the frame
    this.add(mainPanel);
    
    //Start the app
    this.setVisible(true);
  }
  
  //This is an inner class that is used to detect a button press
 class StartButtonListener implements ActionListener{  //this is the required class definition
    public void actionPerformed(ActionEvent event){  
      System.out.println("Starting new Game");
      thisFrame.dispose();
      new GameFrame();//create a new FunkyFrame (another file that extends JFrame)
    }
  }
  
  //Main method starts this application
  public static void main(String[] args) { 
    new StartingFrame();
  }
}