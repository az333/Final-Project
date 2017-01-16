import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main extends JFrame implements MouseListener, ActionListener{

    private Container menu;

    private JButton newGame = new JButton("Play a New Game");
    private JButton oldGame = new JButton("Play an Old Game");
    private JButton settings = new JButton("Settings");
    private JButton solveOwn = new JButton("Input your own puzzle to be solved"); 
    

    private Container board;

    private Sudoku initialBoard;
    private Grid grid;
    private JLabel seedUnchange;
    private JPanel sideBar = new JPanel();
    private JPanel menuBar = new JPanel();
    
    private int xBox;
    private int yBox;

    private JButton check = new JButton("Check");
    private JButton reveal = new JButton("Reveal");
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
    private JTextField seedNum = new JTextField(5);
    private JLabel seedtext = new JLabel("Enter your puzzle number"); 
    private JTextField diffLevel = new JTextField(5);
    private JLabel difftext = new JLabel("Enter your difficulty level");
    private JButton submitted = new JButton("Enter");
    private JButton backtomenupage = new JButton("Back to Menu");
    private JLabel j = new JLabel("Please enter only integers");

   
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

    private JButton solveit = new JButton("Solve this Puzzle");
    

    public Main() {
	this (new Sudoku(2));
    }
    
    public Main(Sudoku s){

        menu = new Container();
	//board = new Container();
	old = new Container();
	settingsPane = new Container();
	difficulties = new Container();
	//solutionPane  = new Container();

	
	setBoard(s, false);
	setMenu();
	setDifficulties();


	addMouseListener(this);

	//Setting up the Pane 
	setTitle("soDoCa");
	setSize(600,520);
	setLocation(100,100);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setContentPane(menu);
	//pack();
	setLocationRelativeTo(null);
	//	setVisible(true);
    }

       
    public void setDifficulties() {
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
    }

    
    public void setMenu () {
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
	
	solveOwn.setMaximumSize(new Dimension (Integer.MAX_VALUE, solveOwn.getMinimumSize().height));
	solveOwn.addActionListener(this);
	solveOwn.setActionCommand("solve own");
	menu.add(solveOwn);

    }
    
    public void setBoard (Sudoku s, boolean usersolve) {

	board = new Container();
	board.setLayout(new BorderLayout());
        
	//grid.addMouseListener(this);
	addMouseListener(this);
	
	//Creating the Game Pane

	initialBoard = s;
	grid = new Grid (initialBoard);
	
        		
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
	seedUnchange = new JLabel ("Seed #" + initialBoard.getSeed() + "\n");
	sideBar.add(seedUnchange);
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
	//board.add(grid, BorderLayout.CENTER);
        		
	board.add(menuBar, BorderLayout.SOUTH);
	board.add(sideBar, BorderLayout.LINE_END);
	board.add(grid, BorderLayout.CENTER);


	//Creating the Solution Pane

	solutionPane  = new Container();

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
	//System.out.println ("Constructor: " + solution);
	//System.out.println (solution);
	solutionGrid = new Grid (solution); 
	solutionPane.setLayout(new BorderLayout());
	solutionPane.add(solutionMenu, BorderLayout.SOUTH);
	solutionPane.add(solutionGrid, BorderLayout.CENTER);

	if (usersolve) {
	    check.setVisible(false);
	    newfromgrid.setVisible(false);
	    reveal.setVisible(false);
	    solveit.addActionListener(this);
	    solveit.setActionCommand("user solve");
	    menuBar.add(solveit);
	}
    }
    

    private void setOldGame(){

	
	old = new Container();

	diffLevel.setMaximumSize(new Dimension(Integer.MAX_VALUE, submitted.getMinimumSize().height));
	seedNum.setMaximumSize(new Dimension(Integer.MAX_VALUE, submitted.getMinimumSize().height));

	old.add(seedtext); 
	old.add(seedNum);
	old.add(difftext); 
	old.add(diffLevel);

	old.setLayout(new BoxLayout(old,BoxLayout.Y_AXIS));
	submitted.setMaximumSize(new Dimension(Integer.MAX_VALUE, submitted.getMinimumSize().height));
	submitted.addActionListener(this);
	submitted.setActionCommand("goToOldGame");
	old.add(submitted);

	backtomenupage.setMaximumSize(new Dimension(Integer.MAX_VALUE, backtomenupage.getMinimumSize().height));
	backtomenupage.addActionListener(this);
	backtomenupage.setActionCommand("back");
	old.add(backtomenupage);

	
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
	int x = e.getX();
	int y = e.getY();
	//System.out.println("true");
	if (x > 0 && x < 50){
	    xBox = 0;
	}
	if (x > 50 && x < 100){
	    xBox = 1;
	}
	if (x > 100 && x < 150){
	    xBox = 2;
	}
	if (x > 150 && x < 200){
	    xBox = 3;
	}
	if (x > 200 && x < 250){
	    xBox = 4;
	}
	if (x > 250 && x < 300){
	    xBox = 5;
	}
	if (x > 300 && x < 350){
	    xBox = 6;
	}
	if (x > 350 && x < 400){
	    xBox = 7;
	}
	if (x > 400 && x < 450){
	    xBox = 8;
	}
	if (y > 25 && y < 75){
	    yBox = 0;
	}
	if (y > 75 && y < 125){
	    yBox = 1;
	}
	if (y > 125 && y < 175){
	    yBox = 2;
	}
	if (y > 175 && y < 225){
	    yBox = 3;
	}
	if (y > 225 && y < 275){
	    yBox = 4;
	}
	if (y > 275 && y < 325){
	    yBox = 5;
	}
	if (y > 325 && y < 375){
	    yBox = 6;
	}
	if (y > 375 && y < 425){
	    yBox = 7;
	}
	if (y > 425 && y < 475){
	    yBox = 8;
	}
	//System.out.println("( " + x+ ", " + y + ")");
	//System.out.println("XBox: " + xBox);
	//System.out.println("YBox: " + yBox);
	
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
	if (event.equals ("solve own")) {
	    setBoard(new Sudoku("empty"), true);
	    setContentPane(board);	  
	    setVisible(true);
	    
	} 
	if (event.equals("old game")){
	    setOldGame();
	    setContentPane(old);
	    setVisible(true);
	}

	if (event.equals("settings")){
	    setContentPane(settings);
	    setVisible(true);
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
	    setBoard(new Sudoku(0), false);
	    setContentPane(board);
	    setVisible(true);
	    //System.out.println(initialBoard.getDifficulty());
	}
        if (event.equals("easy")){
	    setBoard(new Sudoku(1), false);
	    setContentPane(board);
	    setVisible(true);
	    //System.out.println(initialBoard.getDifficulty());
	}
	if (event.equals("medium")){
	    setBoard(new Sudoku(2), false);
	    setContentPane(this.board);
	    setVisible(true);
	    
	    //System.out.println(initialBoard.getDifficulty());
	}
	if (event.equals("hard")){
	    setBoard(new Sudoku(3), false);
	    setContentPane(board);
	    setVisible(true);
	    //System.out.println(initialBoard.getDifficulty());
	}
        if (event.equals("superhard")){
	    setBoard(new Sudoku (4), false);
	    setContentPane(this.board);
	    setVisible(true);
	    //System.out.println(initialBoard.getDifficulty());
	}
        if (event.equals("backtopuzzle")) {
	    setContentPane(board);
	    grid.repaint();
	    setVisible(true);
	}
	if (event.equals("goToOldGame")) {
	    try {
		long seed = Integer.parseInt( seedNum.getText());
		int diff = Integer.parseInt(diffLevel.getText());
	    } catch (NumberFormatException error) {
		old.add(j);
		return;
	    }
	    	long seed = Integer.parseInt( seedNum.getText());
		int diff = Integer.parseInt(diffLevel.getText());
	    Sudoku s = new Sudoku (diff, seed);
	    setBoard(s, false);
	    setContentPane(board);
	    setVisible(true);
	}
	if (event.equals("user solve")) {
	    System.out.println("in event");
	    int[][] grid  = initialBoard.getBoard();
	    boolean isUnique = true;
	    for (int row = 0; row < grid.length; row ++) {
		for (int col = 0; col < grid[row].length; col ++)  {
		    if (!Sudoku.isUnique(initialBoard,row,col)) {
			System.out.println(isUnique);
			isUnique = false;	
		    }
		    if (isUnique == false) {
			//	System.out.println ("its false");
			break;
		    }
		}
		if (isUnique == false) {
		    System.out.println ("its false");
		    break;
		}
	    }
	    System.out.println(isUnique); 
	    if (Sudoku.isSolvable(initialBoard)) {
		System.out.println("solvable");
		if (isUnique) {
		    System.out.println ("unique");
		    setContentPane(solutionPane);
		    setVisible(true);
		} else {
		    System.out.println("not unique");
		    JLabel notunique = new JLabel("There is more than one possible solution. Please add more numbers") ;
		    menuBar.add(notunique);
		}
	    }
	    else {
		System.out.println ("not solvable"); 
		JLabel notsolvable = new JLabel("This board is not solvable.");
		menuBar.add(notsolvable);
	    }
		    
	}
     }
     
    


    public static void main (String[]args){
	Main a = new Main();
	a.setVisible(true);

    }

}
