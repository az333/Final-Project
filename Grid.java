import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Grid extends JComponent {

    private static int boxPixels = 50;
    private static int puzzleSize = 9;
    private static int subSquare = 3;
    private static int boardPixels = boxPixels * puzzleSize;
    private static int textOffset = 15;
    private static Font textFont = new Font ("Sansserif", Font.BOLD, 24);



    private Sudoku initialBoard;
    

    public Grid(Sudoku initialBoard) {
        setPreferredSize(new Dimension(boardPixels + 5, boardPixels + 5));
        setBackground(Color.WHITE);
        this.initialBoard = initialBoard;

    }
    

    @Override public void paintComponent(Graphics g) {
        //... Draw background.
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);        
        drawGridLines(g);
        drawCellValues(g);
    }

    private void drawGridLines(Graphics g) {
	//this draws the grid by making lines every 50 pixels
        for (int i = 0; i <= puzzleSize; i++) {
            int acrossOrDown = i * boxPixels;
            g.drawLine(acrossOrDown, 0, acrossOrDown, boardPixels);
            g.drawLine(0, acrossOrDown, boardPixels, acrossOrDown);
             if (i % subSquare == 0) {
                acrossOrDown++; 
                g.drawLine(acrossOrDown, 0, acrossOrDown, boardPixels);
                g.drawLine(0, acrossOrDown, boardPixels, acrossOrDown);
            }
        }
    }

    public void setFontColor(Font f){
	textFont = f;

    }
    
    private void drawCellValues(Graphics g) {
        g.setFont(textFont);
        for (int i = 0; i < puzzleSize; i++) {
            int yDisplacement = (i+1) * boxPixels - textOffset;
            for (int j = 0; j < puzzleSize; j++) {
		if (initialBoard.ogNum(i,j) == 10){
		    g.setFont(new Font ("Sansserif", Font.PLAIN, 24));
		    if (initialBoard.getColor() == "Red"){
			g.setColor(Color.RED);
		    }
		    if (initialBoard.getColor() == "Orange"){
			g.setColor(Color.ORANGE);
		    }
		    if (initialBoard.getColor() == "Pink"){
			g.setColor(Color.PINK);
		    }
		    if (initialBoard.getColor() == "Green"){
			g.setColor(Color.GREEN);
		    }
		    if (initialBoard.getColor() == "Blue"){
			g.setColor(Color.BLUE);
		    }
		    if (initialBoard.getColor() == "Magenta"){
			g.setColor(Color.MAGENTA);
		    }
		    if(initialBoard.getColor() == "Dark Gray"){
			g.setColor(Color.DARK_GRAY);
		    }
		    if (initialBoard.getColor() == "Black"){
			g.setColor(Color.BLACK);
		    }
		}
		if (initialBoard.ogNum(i,j) != 10){
		    g.setFont(textFont);
		    g.setColor(Color.BLACK);
		}
                if (initialBoard.getNum(i, j) > 0 && initialBoard.getNum(i, j) < 10) {
                    int xDisplacement = j * boxPixels + textOffset;
                    g.drawString("" + initialBoard.getNum(i,j), xDisplacement, yDisplacement);
		}
		else{
		    int xDisplacement = j * boxPixels + textOffset;
		    g.drawString("", xDisplacement, yDisplacement);
		}
	    }
	}
    }
}




