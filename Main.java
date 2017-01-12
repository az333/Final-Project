import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main extends JFrame implements MouseListener, ActionListener{

    private Container menu;

    private JButton newGame;
    private JButton oldGame;
    private JButton settings;
    
    private Container board;

    private JButton back;

    private int xBox;
    private int yBox;


    private Container old;

    private Container settingsPane;
    



    
    public Main(){

        menu = new Container();
	board = new Container();
	old = new Container();
	settingsPane = new Container();
	

	menu.setLayout(new BoxLayout(menu,BoxLayout.Y_AXIS));
	newGame = new JButton("Play a New Game");
	newGame.setMaximumSize(new Dimension(Integer.MAX_VALUE, newGame.getMinimumSize().height));
	newGame.addActionListener(this);
	newGame.setActionCommand("new game");
	menu.add(newGame);
	oldGame = new JButton("Return to an Old Game");
	oldGame.setMaximumSize(new Dimension(Integer.MAX_VALUE, oldGame.getMinimumSize().height));
	oldGame.addActionListener(this);
	oldGame.setActionCommand("old game");
	menu.add(oldGame);
	settings = new JButton("Settings");
	settings.setMaximumSize(new Dimension (Integer.MAX_VALUE, settings.getMinimumSize().height));
	settings.addActionListener(this);
	settings.setActionCommand("settings");
	menu.add(settings);
	


	board.setLayout(new BoxLayout(board,BoxLayout.Y_AXIS));
	back = new JButton("Go Back");
	back.setMaximumSize(new Dimension(Integer.MAX_VALUE, back.getMinimumSize().height));
	back.addActionListener(this);
	back.setActionCommand("back");
	board.add(back);
	

	
	setTitle("soDoCa");
	setSize(500,500);
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
	//System.out.println("true");
	/*if (e.getXOnScreen() < 50){
	    System.out.println("true");
	    board.setXBox(0);
	}
	if (e.getXOnScreen() < 100){
	    board.setXBox(1);
	}
	if (e.getXOnScreen() < 150){
	    board.setXBox(2);
	}
	if (e.getXOnScreen() < 200){
	    board.setXBox(3);
	}
	if (e.getXOnScreen() < 250){
	    board.setXBox(4);
	}
	if (e.getXOnScreen() < 300){
	    board.setXBox(5);
	}
	if (e.getXOnScreen() < 350){
	    board.setXBox(6);
	}
	if (e.getXOnScreen() < 400){
	    board.setXBox(7);
	}
	if (e.getXOnScreen() < 450){
	    board.setXBox(8);
	}
	if (e.getYOnScreen() < 50){
	    board.setYBox(0);
	}
	if (e.getYOnScreen() < 100){
	    board.setYBox(1);
	}
	if (e.getYOnScreen() < 150){
	   board.setYBox(2);
	}
	if (e.getYOnScreen() < 200){
	    board.setYBox(3);
	}
	if (e.getYOnScreen() < 250){
	    board.setYBox(4);
	}
	if (e.getYOnScreen() < 300){
	    board.setYBox(5);
	}
	if (e.getYOnScreen() < 350){
	    board.setYBox(6);
	}
	if (e.getYOnScreen() < 400){
	    board.setYBox(7);
	}
	if (e.getYOnScreen() < 450){
	    board.setYBox(8);
	}
	for (int i = 1; i * 50 < e.getXOnScreen(); i ++){
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
	    System.out.println("true");
	    //SudokuSolver.solveSudoku(board.getBoard());
	    // board.getBoard().repaint();
	}

	if (event.equals("check")){
	     //smthg
	}	
	
	/*if (event.equals("one")){
	    board.getBoard().setNum(board.getXBox(), board.getYBox(), 1);
	    board.getBoard().repaint();
	}
        if (event.equals("two")){
	    board.getBoard().setNum(board.getXBox(), board.getYBox(), 2);
	    board.getBoard().repaint();
	}
	if (event.equals("three")){
	    board.getBoard().setNum(board.getXBox(), board.getYBox(), 3);
	    board.getBoard().repaint();
	}
	if (event.equals("four")){
	    board.getBoard().setNum(board.getXBox(), board.getYBox(), 4);
	    board.getBoard().repaint();
	}
        if (event.equals("five")){
	    board.getBoard().setNum(board.getXBox(), board.getYBox(), 5);
	    board.getBoard().repaint();
	}
	if (event.equals("six")){
	    board.getBoard().setNum(board.getXBox(), board.getYBox(), 6);
	    board.getBoard().repaint();
	}
	if (event.equals("seven")){
	    board.getBoard().setNum(board.getXBox(), board.getYBox(), 7);
	    board.getBoard().repaint();
	}
	if (event.equals("eight")){
	    board.getBoard().setNum(board.getXBox(), board.getYBox(), 8);
	    board.getBoard().repaint();
	}
	if (event.equals("nine")){
	    board.getBoard().setNum(board.getXBox(), board.getYBox(), 9);
	    board.getBoard().repaint();
	}
	

	if (event.equals("new game")){
	    Sudoku a = new Sudoku();
	    board.setBoard(a);
	    board.getBoard().repaint();
	}
	*/
	
	       
    }

    public static void main (String[]args){
	Main a = new Main();
	a.setVisible(true);
    }






}


