import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameGrid extends JFrame{ //this is the part with the action listener
    private Grid grid;
    private Sudoku initialBoard;

    private Container content;


    private JButton check = new JButton("Check My Solution");
    private JButton reveal = new JButton("Reveal the Solution");

    public GameGrid(){
	this.initialBoard = new Sudoku();
	this.grid = new Grid(initialBoard);


	JPanel menuBar = new JPanel();
	menuBar.setLayout(new FlowLayout());
	menuBar.add(check);
	menuBar.add(reveal);
	
	//content = this.getContentPane();
	JPanel content = new JPanel();
	content.setLayout(new BorderLayout());
	content.add(menuBar, BorderLayout.NORTH);
	content.add(grid, BorderLayout.CENTER);

	
	setContentPane(content);
	setTitle("soDoCa");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//setResizable(false);
	pack();
	setLocationRelativeTo(null);
  
    }    
    
    public GameGrid(Sudoku initialBoard){
	this.initialBoard = initialBoard;
	this.grid = new Grid(initialBoard);

	
	content = this.getContentPane();
	content.setLayout(new BorderLayout());
	content.add(initialBoard, BorderLayout.CENTER);


	
	setContentPane(content);
	setTitle("soDoCa");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//setResizable(false);
	pack();
	setLocationRelativeTo(null);
	  
    }


    public static void main (String[]args){
	GameGrid b = new GameGrid();
	b.setVisible(true);
    }
    
}
    
	    
    










