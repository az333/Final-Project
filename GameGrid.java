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
	content.add(game, BorderLayout.CENTER);
	setTitle("soDoCa");
	//setResizable(false);
  
    }    
    
    public GameGrid(Game game){
	this.game = game;
	this.grid = new Grid(game);
	content = this.getContentPane();
	content.add(game, BorderLayout.CENTER);
	setTitle("soDoCa");
	//setResizable(false);
  

    }
    
    

    
@Override
    public void actionPerformed(ActionEvent e){

}


    public static void main (String[]args){
	GameGrid b = new GameGrid();
	b.setVisible(true);
    }
    
}
    
	    
    










