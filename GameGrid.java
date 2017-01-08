import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameGrid extends JFrame{ 
    
    private Sudoku initialBoard;
    private Grid grid;

    private Container content;


    private JButton check = new JButton("Check My Solution");
    private JButton reveal = new JButton("Reveal the Solution");

    private JButton one = new JButton("1");
    private JButton two = new JButton("2");
    private JButton three = new JButton("3");
    private JButton four = new JButton("4");
    private JButton five = new JButton("5");
    private JButton six = new JButton("6");
    private JButton seven = new JButton("7");
    private JButton eight = new JButton("8");
    private JButton nine = new JButton("9");

    
    public GameGrid(){
	this.initialBoard = new Sudoku();
	this.grid = new Grid(initialBoard);


	JPanel menuBar = new JPanel();
	menuBar.setLayout(new FlowLayout());
	menuBar.add(check);
	menuBar.add(reveal);

	JPanel sideBar = new JPanel();
	sideBar.setLayout(new BoxLayout(sideBar, BoxLayout.Y_AXIS));
	sideBar.add(one);
	sideBar.add(two);
	sideBar.add(three);
	sideBar.add(four);
	sideBar.add(five);
	sideBar.add(six);
	sideBar.add(seven);
	sideBar.add(eight);
	sideBar.add(nine);
	

	JPanel content = new JPanel();
	content.setLayout(new BorderLayout());
        content.add(menuBar, BorderLayout.NORTH);
	content.add(grid, BorderLayout.CENTER);
	content.add(sideBar, BorderLayout.LINE_END);
	
	setContentPane(content);
	setTitle("soDoCa");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	pack();
	setLocationRelativeTo(null);
    }    

    
    public GameGrid(Sudoku initialBoard){
	this.initialBoard = initialBoard;
	this.grid = new Grid(initialBoard);

	JPanel menuBar = new JPanel();
	menuBar.setLayout(new FlowLayout());
	menuBar.add(check);
	menuBar.add(reveal);

	JPanel content = new JPanel();
	content.setLayout(new BorderLayout());
	content.add(menuBar, BorderLayout.NORTH);
	content.add(grid, BorderLayout.CENTER);

	setContentPane(content);
	setTitle("soDoCa");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	pack();
	setLocationRelativeTo(null);
     }


    public static void main (String[]args){
	GameGrid b = new GameGrid();
	b.setVisible(true);
    }
    
}
    
	    
    










