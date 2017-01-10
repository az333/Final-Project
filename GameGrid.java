import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameGrid extends JFrame implements MouseListener, ActionListener{ 
    
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
	check.setActionCommand("check");
	menuBar.add(reveal);
	reveal.setActionCommand("reveal");

	JPanel sideBar = new JPanel();
	sideBar.setLayout(new BoxLayout(sideBar, BoxLayout.Y_AXIS));
	sideBar.add(one);
	one.setActionCommand("one");
	sideBar.add(two);
	two.setActionCommand("two");
	sideBar.add(three);
	three.setActionCommand("three");
	sideBar.add(four);
	four.setActionCommand("four");
	sideBar.add(five);
	five.setActionCommand("five");
	sideBar.add(six);
	six.setActionCommand("six");
	sideBar.add(seven);
	seven.setActionCommand("seven");
	sideBar.add(eight);
	eight.setActionCommand("eight");
	sideBar.add(nine);
	nine.setActionCommand("nine");
	

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

    ///I need to add the part that lets you click on a box in the grid if that's possible

    
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
	if (event.equals("reveal")){
	    //   this.fillIn();
	}


	if (event.equals("check")){
	     //smthg
	}	
	
	if (event.equals("one")){
	    //g.drawString("1", xDis, yDis);
	}
        if (event.equals("two")){
	    //g.drawString("2", xDis, yDis);
	}
	if (event.equals("three")){
	    //g.drawString("3", xDis, yDis);
	}
	if (event.equals("four")){
	    //g.drawString("4", xDis, yDis);
	}
        if (event.equals("five")){
	    //g.drawString("5", xDis, yDis);
	}
	if (event.equals("six")){
	    //g.drawString("6", xDis, yDis);
	}
	if (event.equals("seven")){
	    //g.drawString("7", xDis, yDis);
	}
	if (event.equals("eight")){
	    //g.drawString("8", xDis, yDis);
	}
	if (event.equals("nine")){
	    //g.drawString("9", xDis, yDis);
	}
		
    }

    public void fillIn(Graphics g){
	int boxPixels = 50;
        int puzzleSize = 9;
        int textOffset = 15;
        Font textFont = new Font ("Sansserif", Font.BOLD, 24);
	g.setFont(textFont);
	
	SudokuSolver.solveSudoku(initialBoard);
	int[][] board = new int[9][9];
	board = initialBoard.getBoard();
	Sudoku solvedBoard = new Sudoku(board);
	for (int i = 0; i < puzzleSize; i++) {
	    int yDisplacement = (i+1) * boxPixels - textOffset;
	    for (int j = 0; j < puzzleSize; j++) {
		if (solvedBoard.getNum(i, j) > 0 && solvedBoard.getNum(i, j) < 10) {
		    int xDisplacement = j * boxPixels + textOffset;
		    g.drawString("" + solvedBoard.getNum(i,j), xDisplacement, yDisplacement);
		}
	    }
	}
    }
	
    public void drawNums(ActionEvent e, Graphics g){
	
        int boxPixels = 50;
        int puzzleSize = 9;
        int subSquare = 3;
	int boardPixels = boxPixels * puzzleSize;
        int textOffset = 15;
        Font textFont = new Font ("Sansserif", Font.BOLD, 24);
	int xDis = 0;
	int yDis = 0;
	g.setFont(textFont);
	String event = e.getActionCommand();

    }
	


	    
		
	    
    
	

    public static void main (String[]args){
	GameGrid b = new GameGrid();
	b.setVisible(true);
    }
    
}
    
	    
    










