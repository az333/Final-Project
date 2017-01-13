import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameGrid extends JFrame implements MouseListener, ActionListener{ 

    private int xBox;
    private int yBox;
    
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
	xBox = 9;
	yBox = 9;
	
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
    
    //this is my job for today!
    
    public void mouseClicked(MouseEvent e){
	if (e.getXOnScreen() < 50){
	    setBackground(Color.RED);
	    grid.repaint();
	    xBox = 0;
	}
	if (e.getXOnScreen() < 100){
	    xBox = 1;
	}
	if (e.getXOnScreen() < 150){
	    xBox = 2;
	}
	if (e.getXOnScreen() < 200){
	    xBox = 3;
	}
	if (e.getXOnScreen() < 250){
	    xBox = 4;
	}
	if (e.getXOnScreen() < 300){
	    xBox = 5;
	}
	if (e.getXOnScreen() < 350){
	    xBox = 6;
	}
	if (e.getXOnScreen() < 400){
	    xBox = 7;
	}
	if (e.getXOnScreen() < 450){
	    xBox = 8;
	}
	if (e.getYOnScreen() < 50){
	    yBox = 0;
	}
	if (e.getYOnScreen() < 100){
	    yBox = 1;
	}
	if (e.getYOnScreen() < 150){
	    yBox = 2;
	}
	if (e.getYOnScreen() < 200){
	    yBox = 3;
	}
	if (e.getYOnScreen() < 250){
	    yBox = 4;
	}
	if (e.getYOnScreen() < 300){
	    yBox = 5;
	}
	if (e.getYOnScreen() < 350){
	    yBox = 6;
	}
	if (e.getYOnScreen() < 400){
	    yBox = 7;
	}
	if (e.getYOnScreen() < 450){
	    yBox = 8;
	}
	/*for (int i = 1; i * 50 < e.getXOnScreen(); i ++){
	    xBox = i - 1;
	}
	for (int j = 1; j * 50 < e.getYOnScreen(); j ++){
	    yBox = j - 1;
	}
	*/
    }

  

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	int r = 0;
	int c = 0;
	if (event.equals("back")){
	    MenuPage m = new MenuPage ();
	    //JPanel menu = (JPanel)m.getContentPane(); 
	    //this.setContentPane(menu);
	}
	
	if (event.equals("reveal")){
	    SudokuSolver.solveSudoku(initialBoard);
	    grid.repaint();
	}

	if (event.equals("check")){
	     //smthg
	}	
	
	if (event.equals("one")){
	    initialBoard.setNum(xBox, yBox, 1);
	    grid.repaint();
	}
        if (event.equals("two")){
	    initialBoard.setNum(xBox, yBox, 2);
	    grid.repaint();
	}
	if (event.equals("three")){
	    initialBoard.setNum(xBox, yBox, 3);
	    grid.repaint();
	}
	if (event.equals("four")){
	    initialBoard.setNum(xBox, yBox, 4);
	    grid.repaint();
	}
        if (event.equals("five")){
	    initialBoard.setNum(xBox, yBox, 5);
	    grid.repaint();
	}
	if (event.equals("six")){
	    initialBoard.setNum(xBox, yBox, 6);
	    grid.repaint();
	}
	if (event.equals("seven")){
	    initialBoard.setNum(xBox, yBox, 7);
	    grid.repaint();
	}
	if (event.equals("eight")){
	    initialBoard.setNum(xBox, yBox, 8);
	    grid.repaint();
	}
	if (event.equals("nine")){
	    initialBoard.setNum(xBox, yBox, 9);
	    grid.repaint();
	}

	if (event.equals("new game")){
	    //System.out.println("true");
	    GameGrid a = new GameGrid();
	    a.setVisible(true);
	    // this.setContentPane(a.getContentPane());
	    
	}
		
    }

     
    public static void main (String[]args){
	GameGrid b = new GameGrid();
	b.setVisible(true);
    }
    
}
    
	    
    










