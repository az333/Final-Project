import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameGrid extends JFrame implements MouseListener, ActionListener{ 
    
    private Sudoku initialBoard;
    private Grid grid;

    private Container content;


    private JButton check = new JButton("Check My Solution");
    private JButton reveal = new JButton("Reveal the Solution");
    private JButton back = new JButton("Back to Menu");

    private JButton one = new JButton("1");
    private JButton two = new JButton("2");
    private JButton three = new JButton("3");
    private JButton four = new JButton("4");
    private JButton five = new JButton("5");
    private JButton six = new JButton("6");
    private JButton seven = new JButton("7");
    private JButton eight = new JButton("8");
    private JButton nine = new JButton("9");

    private JButton newGame = new JButton("New Game");
    

    
    public GameGrid(){
	this.initialBoard = new Sudoku();
	this.grid = new Grid(initialBoard);


	JPanel menuBar = new JPanel();
	menuBar.setLayout(new FlowLayout());
	back.addActionListener(this);
	back.setActionCommand("back");
	menuBar.add(back);
	check.addActionListener(this);
	check.setActionCommand("check");
	menuBar.add(check);
	reveal.addActionListener(this);
	reveal.setActionCommand("reveal");
	menuBar.add(reveal);

	

	JPanel sideBar = new JPanel();
	sideBar.setLayout(new BoxLayout(sideBar, BoxLayout.Y_AXIS));
	one.addActionListener(this);
	one.setActionCommand("one");
	sideBar.add(one);
	two.addActionListener(this);
	two.setActionCommand("two");
	sideBar.add(two);
	three.addActionListener(this);
	three.setActionCommand("three");
	sideBar.add(three);
	four.addActionListener(this);
	four.setActionCommand("four");
	sideBar.add(four);
	five.addActionListener(this);
	five.setActionCommand("five");
	sideBar.add(five);
	six.addActionListener(this);
	six.setActionCommand("six");
	sideBar.add(six);
	seven.addActionListener(this);
	seven.setActionCommand("seven");
	sideBar.add(seven);
	eight.addActionListener(this);
	eight.setActionCommand("eight");
	sideBar.add(eight);
	nine.addActionListener(this);
	nine.setActionCommand("nine");
	sideBar.add(nine);
	newGame.addActionListener(this);
	newGame.setActionCommand("new game");
	sideBar.add(newGame);
	

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

    ///I need to add the mouseListener part

    
    /*Empty method definition. */
    public void mousePressed(MouseEvent e) {
    }

    /* Empty method definition. */
    public void mouseReleased(MouseEvent e) {
    }

    /* Empty method definition. */
    public void mouseEntered(MouseEvent e) {
    }

    /* Empty method definition. */
    public void mouseExited(MouseEvent e) {
    }
    
    public void mouseClicked(MouseEvent e){
	int xCor = e.getXOnScreen();
	int yCor = e.getYOnScreen();
	int[] pt = new int[2];
	pt[0] = xCor;
	pt[1] = yCor;
    }

  
    public static int xBox(int x){
	int xbox = 0;
	for (int i = 1; x < i * 50; i ++){
	    xbox = i;
	}

	return xbox;
    }

    public static int yBox(int y){
	int ybox = 0;
	for (int j = 1; y < j * 50; j ++){
	    ybox += j;
	}
	return ybox;
    }


    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	int r = 0;
	int c = 0;
	if (event.equals("back")){
	    //smthg
	}
	
	if (event.equals("reveal")){
	    SudokuSolver.solveSudoku(initialBoard);
	    grid.repaint();
	}

	if (event.equals("check")){
	     //smthg
	}	
	
	if (event.equals("one")){
	    initialBoard.setNum(r, c, 1);
	    grid.repaint();
	}
        if (event.equals("two")){
	    initialBoard.setNum(r, c, 2);
	    grid.repaint();
	}
	if (event.equals("three")){
	    initialBoard.setNum(r, c, 3);
	    grid.repaint();
	}
	if (event.equals("four")){
	    initialBoard.setNum(r, c, 4);
	    grid.repaint();
	}
        if (event.equals("five")){
	    initialBoard.setNum(r, c, 5);
	    grid.repaint();
	}
	if (event.equals("six")){
	    initialBoard.setNum(r, c, 6);
	    grid.repaint();
	}
	if (event.equals("seven")){
	    initialBoard.setNum(r, c, 7);
	    grid.repaint();
	}
	if (event.equals("eight")){
	    initialBoard.setNum(r, c, 8);
	    grid.repaint();
	}
	if (event.equals("nine")){
	    initialBoard.setNum(r, c, 9);
	    grid.repaint();
	}

	if (event.equals("new game")){
	    Sudoku a = new Sudoku();
	    initialBoard = a;
	    grid.repaint();
	}
		
    }

       
  
    public static void main (String[]args){
	GameGrid b = new GameGrid();
	b.setVisible(true);
    }
    
}
    
	    
    










