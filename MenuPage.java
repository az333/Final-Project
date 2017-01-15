<<<<<<< HEAD
=======

>>>>>>> Donia
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

<<<<<<< HEAD
public class MenuPage extends JFrame implements ActionListener{
=======
public class MenuPage extends JPanel{
>>>>>>> Donia
 private Container pane;
 private JButton newGame;
 private JButton oldGame;
 private JButton settings;
 
  //CONSTRUCTOR SETS EVERYTHING UP
  public MenuPage() {
     this.setTitle("soDoCa");
     this.setSize(500,500);
     this.setLocation(100,100);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     pane = this.getContentPane();
     pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));  //NOTE!! THIS CAN BE CHANGED (see below)
    
     newGame = new JButton("Play a New Game");
     newGame.setMaximumSize(new Dimension(Integer.MAX_VALUE, newGame.getMinimumSize().height));
     oldGame = new JButton("Play an Old Game");
     oldGame.setMaximumSize(new Dimension(Integer.MAX_VALUE, oldGame.getMinimumSize().height));
     settings = new JButton("Settings");
     settings.setMaximumSize(new Dimension(Integer.MAX_VALUE, settings.getMinimumSize().height));
     
     pane.add(newGame);
     pane.add(oldGame);
     pane.add(settings);
  }
<<<<<<< HEAD
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if (event.equals("new")){
		//link to new puzzle?
	}
	if (event.equals("old")){
	    //link to new puzzle?
	}
	if (event.equals("settings")){
	    //link to settings?
	}
    }
	    

=======
	    
    /*
>>>>>>> Donia
  //MAIN JUST INSTANTIATES + MAKE VISIBLE
  public static void main(String[] args) {
     MenuPage g = new MenuPage();
     g.setVisible(true);
  }
<<<<<<< HEAD
}


    
=======
    */
}
>>>>>>> Donia
