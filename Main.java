import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main  extends JFrame implements ActionListener{
 private Container pane;
 private JButton newGame;
 private JButton oldGame;
 private JButton settings;
 
  //CONSTRUCTOR SETS EVERYTHING UP
  public Main() {


      JPanel pane = new MenuPage();
     
      /*  pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
    
      newGame = new JButton("Play a New Game");
      newGame.setMaximumSize(new Dimension(Integer.MAX_VALUE, newGame.getMinimumSize().height));
      newGame.addActionListener(this);
      newGame.setActionCommand("new");
      oldGame = new JButton("Play an Old Game");
      oldGame.setMaximumSize(new Dimension(Integer.MAX_VALUE, oldGame.getMinimumSize().height));
      settings = new JButton("Settings");
      settings.setMaximumSize(new Dimension(Integer.MAX_VALUE, settings.getMinimumSize().height)); 

     
     
     pane.add(newGame);
     pane.add(oldGame);
     pane.add(settings); */

     setContentPane(pane); 
     setTitle("soDoCa");
     /*setSize(500,500);
     setLocation(100,100); */
     setDefaultCloseOperation(EXIT_ON_CLOSE);
  }


    
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if (event.equals("new")){
	    GameGrid g = new GameGrid();
	    JPanel panel = (JPanel)g.getContentPane(); 
	    this.setContentPane(panel);	    
	}
	if (event.equals("old")){
	    //link to new puzzle?
	}
	if (event.equals("settings")){
	    //link to settings?
	}
    }
	    

  //MAIN JUST INSTANTIATES + MAKE VISIBLE
  public static void main(String[] args) {
     MenuPage g = new MenuPage();
     g.setVisible(true);
  }
}


    
