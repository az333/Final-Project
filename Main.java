import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main extends JFrame implements MouseListener, ActionListener{

    private Container menu;

    private JButton newGame = new JButton("Play a New Game");
    private JButton oldGame = new JButton("Play an Old Game");
    private JButton settings = new JButton("Settings");
    

    private Container board;

    private Sudoku initialBoard;
    private Grid grid;
    
    private int xBox;
    private int yBox;

    private JButton check = new JButton("Check My Solution");
    private JButton reveal = new JButton("Reveal the Solution");
    private JButton back = new JButton("Back to Menu");
    private JButton newfromgrid = new JButton("New Game");

    private JButton one = new JButton("1");
    private JButton two = new JButton("2");
    private JButton three = new JButton("3");
    private JButton four = new JButton("4");
    private JButton five = new JButton("5");
    private JButton six = new JButton("6");
    private JButton seven = new JButton("7");
    private JButton eight = new JButton("8");
    private JButton nine = new JButton("9");

    

    private Container old;

    private Container difficulties;
    private JButton zerodiff= new JButton("Super Easy");
    private JButton onediff = new JButton("Easy");
    private JButton twodiff = new JButton("Medium");
    private JButton threediff = new JButton("Hard");
    private JButton fourdiff = new JButton("Super Hard");
    

    private Container settingsPane;
    

    private Container solutionPane;
    private Sudoku solution;
    private JButton backtopuzzle = new JButton("Back to Puzzle");
    private JButton newpuzzle = new JButton("New Puzzle");
    private JButton backtomenu = new JButton ("Back to Menu");
    private Grid solutionGrid; 


    
    public Main(){

        menu = new Container();
	board = new Container();
	old = new Container();
	settingsPane = new Container();
	difficulties = new Container();
	solutionPane  = new Container();
        
	
	//Creating the Game Pane

	xBox = 9;
	yBox = 9;
	
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
	newfromgrid.addActionListener(this);
	newfromgrid.setActionCommand("new game");
	sideBar.add(newfromgrid);

	this.initialBoard = new Sudoku();
	this.grid = new Grid(initialBoard); 

	
	board.setLayout(new BorderLayout());
	board.add(menuBar, BorderLayout.SOUTH);
	board.add(grid, BorderLayout.CENTER);
	board.add(sideBar, BorderLayout.LINE_END);
	grid.addMouseListener(this);
	addMouseListener(this); 

		
	//Creating the Menu Pane
	menu.setLayout(new BoxLayout(menu,BoxLayout.Y_AXIS));
	newGame.setMaximumSize(new Dimension(Integer.MAX_VALUE, newGame.getMinimumSize().height));
	newGame.addActionListener(this);
	newGame.setActionCommand("new game");
	menu.add(newGame);
	
	oldGame.setMaximumSize(new Dimension(Integer.MAX_VALUE, oldGame.getMinimumSize().height));
	oldGame.addActionListener(this);
	oldGame.setActionCommand("old game");
	menu.add(oldGame);
	
	settings.setMaximumSize(new Dimension (Integer.MAX_VALUE, settings.getMinimumSize().height));
	settings.addActionListener(this);
	settings.setActionCommand("settings");
	menu.add(settings);

	
	//Creating the Settings Pane



	//Creating the Old Puzzle Pane


	//Creating the Difficulties Pane
	difficulties.setLayout(new BoxLayout(difficulties,BoxLayout.Y_AXIS));
	zerodiff.setMaximumSize(new Dimension(Integer.MAX_VALUE, zerodiff.getMinimumSize().height));
	zerodiff.addActionListener(this);
	zerodiff.setActionCommand("supereasy");
	difficulties.add(zerodiff);

	onediff.setMaximumSize(new Dimension(Integer.MAX_VALUE, onediff.getMinimumSize().height));
	onediff.addActionListener(this);
	onediff.setActionCommand("easy");
	difficulties.add(onediff);

	twodiff.setMaximumSize(new Dimension(Integer.MAX_VALUE, twodiff.getMinimumSize().height));
	twodiff.addActionListener(this);
	twodiff.setActionCommand("medium");
	difficulties.add(twodiff);

	threediff.setMaximumSize(new Dimension(Integer.MAX_VALUE, threediff.getMinimumSize().height));
	threediff.addActionListener(this);
	threediff.setActionCommand("hard");
	difficulties.add(threediff);

	fourdiff.setMaximumSize(new Dimension(Integer.MAX_VALUE, fourdiff.getMinimumSize().height));
	fourdiff.addActionListener(this);
	fourdiff.setActionCommand("superhard");
	difficulties.add(fourdiff);


	//Creating the Solution Pane


	JPanel solutionMenu = new JPanel();
	solutionMenu.setLayout(new FlowLayout());
	backtomenu.addActionListener(this);
	backtomenu.setActionCommand("back");
	solutionMenu.add(backtomenu);
	newpuzzle.addActionListener(this);
	newpuzzle.setActionCommand("new game");
	solutionMenu.add(newpuzzle);
	backtopuzzle.addActionListener(this);
	backtopuzzle.setActionCommand("backtopuzzle");
	solutionMenu.add(backtopuzzle);
	Sudoku a = new Sudoku(initialBoard.getBoard());
	SudokuSolver.solveSudoku(a);
	solution = new Sudoku (a.getBoard());
	//System.out.println (initialBoard);
	//System.out.println (solution);
	solutionGrid = new Grid (solution); 
	solutionPane.setLayout(new BorderLayout());
	solutionPane.add(solutionMenu, BorderLayout.SOUTH);
	solutionPane.add(solutionGrid, BorderLayout.CENTER);

	
	
	//Setting up the Pane 
	setTitle("soDoCa");
	setSize(620,500);
	setLocation(100,100);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setContentPane(menu);
	//pack();
	setLocationRelativeTo(null);
	setVisible(true);
    }
    

    
    
    //Empty method definition. 
     public void mousePressed(MouseEvent e) {
    }

    // Empty method definition. 
    public void mouseReleased(MouseEvent e) {
    }

    // Empty method definition. 
    public void mouseEntered(MouseEvent e) {
    }

    // Empty method definition. 
    public void mouseExited(MouseEvent e) {
    }

    
    
    public void mouseClicked(MouseEvent e){
	/*
	int x = e.getX();
	int y = e.getY();
	//System.out.println("true");
	if (x > 330 && x < 380){
	    xBox = 0;
	}
	if (x > 380 && x < 430){
	    xBox = 1;
	}
	if (x > 430 && x < 480){
	    xBox = 2;
	}
	if (x > 480 && x < 530){
	    xBox = 3;
	}
	if (x > 530 && x < 580){
	    xBox = 4;
	}
	if (x > 580 && x < 630){
	    xBox = 5;
	}
	if (x > 630 && x < 680){
	    xBox = 6;
	}
	if (x > 680 && x < 730){
	    xBox = 7;
	}
	if (x > 730 && x < 780){
	    xBox = 8;
	}
	if (y > 200 && y < 250){
	    yBox = 0;
	}
	if (y > 250 && y < 300){
	    yBox = 1;
	}
	if (y > 300 && y < 350){
	    yBox = 2;
	}
	if (y > 350 && y < 400){
	    yBox = 3;
	}
	if (y > 400 && y < 450){
	    yBox = 4;
	}
	if (y > 450 && y < 500){
	    yBox = 5;
	}
	if (y > 500 && y < 550){
	    yBox = 6;
	}
	if (y > 550 && y < 600){
	    yBox = 7;
	}
	if (y > 600 && y < 650){
	    yBox = 8;
	}
	System.out.println("( " + x+ ", " + y + ")");
	System.out.println("XBox: " + xBox);
	System.out.println("YBox: " + yBox);

	*/
    }


     public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	int r = 0;
	int c = 0;

	if (event.equals("new game")){
	    setContentPane(difficulties);
	    setVisible(true);
	    // repaint();
	}

	if (event.equals("old game")){
	    setContentPane(old);
	    repaint();
	}

	if (event.equals("settings")){
	    setContentPane(settings);
	    repaint();
	}

	if (event.equals("back")){
	    setContentPane(menu);
	    setVisible(true);
	    //repaint();
	    
	}
	
	if (event.equals("reveal")){
	    setContentPane(solutionPane);
	    setVisible(true);
	    //repaint();
	}

	if (event.equals("check")){
	     //smthg
	}	
	
	if (event.equals("one")){
	    initialBoard.setNum(yBox, xBox, 1);
	    grid.repaint();
	}
        if (event.equals("two")){
	    initialBoard.setNum(yBox, xBox, 2);
	    grid.repaint();
	}
	if (event.equals("three")){
	    initialBoard.setNum(yBox, xBox, 3);
	    grid.repaint();
	}
	if (event.equals("four")){
	    initialBoard.setNum(yBox, xBox, 4);
	    grid.repaint();
	}
        if (event.equals("five")){
	    initialBoard.setNum(yBox, xBox, 5);
	    grid.repaint();
	}
	if (event.equals("six")){
	    initialBoard.setNum(yBox, xBox, 6);
	    grid.repaint();
	}
	if (event.equals("seven")){
	    initialBoard.setNum(yBox, xBox, 7);
	    grid.repaint();
	}
	if (event.equals("eight")){
	    initialBoard.setNum(yBox, xBox, 8);
	    grid.repaint();
	}
	if (event.equals("nine")){
	    initialBoard.setNum(yBox, xBox, 9);
	    grid.repaint();
	}
	if (event.equals("supereasy")){
	    setContentPane(board);
	    initialBoard = new Sudoku (0);
	    grid.repaint();
	    setVisible(true);
	    //System.out.println(initialBoard.getDifficulty());
	}
        if (event.equals("easy")){
	   setContentPane(board);
	    initialBoard = new Sudoku (1);
	    grid.repaint();
	    setVisible(true);
	    //System.out.println(initialBoard.getDifficulty());
	}
	if (event.equals("medium")){
	    setContentPane(board);
	    initialBoard = new Sudoku (2);
	    grid.repaint();
	    setVisible(true);
	    //System.out.println(initialBoard.getDifficulty());
	}
	if (event.equals("hard")){
	    setContentPane(board);
	    initialBoard = new Sudoku (3);
	    grid.repaint();
	    setVisible(true);
	    //System.out.println(initialBoard.getDifficulty());
	}
        if (event.equals("superhard")){
	    setContentPane(board);
	    initialBoard = new Sudoku (4);
	    grid.repaint();
	    setVisible(true);
	    //System.out.println(initialBoard.getDifficulty());
	}
        if (event.equals("backtopuzzle")) {
	    setContentPane(board);
	    grid.repaint();
	    setVisible(true);
	} 
     }
    


    public static void main (String[]args){
	Main a = new Main();

    }

}
