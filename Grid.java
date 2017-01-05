import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class Grid extends JComponent {

    private Game = game;
    
    private static int cellPixels = 50;
    private static int puzzleSize = 9;
    private static int subSquare = 3;
    private static int boardPixels = cellPixels * puzzleSize;
    private static int textOffset = 15;
    private static Font textFont = new Font ("Sansserif", Font.BOLD, 24);

    public Grid(Game game){
	setPreferredSize(new Dimension(boardPixels, boardPixels));
	setBackground(Color.WHITE);
	this.game = game;
    }

   
	
