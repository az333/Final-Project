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

    private Container settingsPane;
    



    
    public Main(){

        menu = new Container();
	board = new Container();
	old = new Container();
	settingsPane = new Container();
	
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
	sideBar.add(newGame);

	this.initialBoard = new Sudoku();
	this.grid = new Grid(initialBoard);

	
	board.setLayout(new BorderLayout());
	board.add(menuBar, BorderLayout.NORTH);
	board.add(grid, BorderLayout.CENTER);
	board.add(sideBar, BorderLayout.LINE_END);
	grid.addMouseListener(this);
	addMouseListener(this);

	//Creating the Settings Pane



	//Creating the Old Puzzle Pane
	
	setTitle("soDoCa");
	setSize(620,540);
	setLocation(100,100);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setContentPane(board);
	//pack();
	setLocationRelativeTo(null);
	
    }
    



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
	int x = e.getXOnScreen();
	int y = e.getYOnScreen();
	//System.out.println("true");
	if (x > 350 && x < 400){
	    xBox = 0;
	}
	if (x > 400 && x < 450){
	    xBox = 1;
	}
	if (x > 450 && x < 500){
	    xBox = 2;
	}
	if (x > 500 && x < 550){
	    xBox = 3;
	}
	if (x > 550 && x < 600){
	    xBox = 4;
	}
	if (x > 600 && x < 650){
	    xBox = 5;
	}
	if (x > 650 && x < 700){
	    xBox = 6;
	}
	if (x > 700 && x < 750){
	    xBox = 7;
	}
	if (x > 750 && x < 800){
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
	System.out.println("" + x);
	System.out.println("" + xBox);
	System.out.println("" + y);
	System.out.println("" + yBox);
    }


     public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	int r = 0;
	int c = 0;

	if (event.equals("new game")){
	    setContentPane(board);
	    repaint();
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
	    repaint();
	}
	
	if (event.equals("reveal")){
	    SudokuSolver.solveSudoku(initialBoard);
	    repaint();
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

	if (event.equals("new game")){
	    Sudoku a = new Sudoku();
	    initialBoard = a;
	    grid.repaint();
     
	}
     }
	


    public static void main (String[]args){
	Main a = new Main();
	a.setVisible(true);
    }






}


