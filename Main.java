import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main  extends JFrame implements ActionListener{
 private Container pane;
 
  //CONSTRUCTOR SETS EVERYTHING UP
  public Main() {


      MenuPage pane = new MenuPage();
      setContentPane(pane); 
      pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
      setTitle("soDoCa");
      setSize(500,500);
      setLocation(100,100); 
      setDefaultCloseOperation(EXIT_ON_CLOSE);
  }


    
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if (event.equals("new")){
	    //GameGrid g = new GameGrid();
	    //JPanel panel = (JPanel)g.getContentPane(); 
	    // this.setContentPane(panel);	    
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
     Main g = new Main();
     g.setVisible(true);
  }
}


    
