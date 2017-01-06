import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameGrid extends JFrame implements ActionListener{ //this is the part with the action listener
    private Grid grid;
    private Game game;

    private Container content;

    public GameGrid(){
	this.game = new Game();
	this.grid = new Grid(game);
	content = this.getContentPane();
	content.setLayout(new BorderLayout());
	content.add(game, BorderLayout.CENTER);
	setContentPane(content);
	setTitle("soDoCa");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//setResizable(false);
	pack();
	setLocationRelativeTo(null);
  
    }    
    
    public GameGrid(Game game){
	this.game = game;
	this.grid = new Grid(game);
	content = this.getContentPane();
	content.setLayout(new BorderLayout());
	content.add(game, BorderLayout.CENTER);
	setContentPane(content);
	setTitle("soDoCa");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//setResizable(false);
	pack();
	setLocationRelativeTo(null);
	  
    }
    
    

    
@Override
    public void actionPerformed(ActionEvent e){

}


    public static void main (String[]args){
	GameGrid b = new GameGrid();
	b.setVisible(true);
    }
    
}
    
	    
    










