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


    //================================================================ fields
    private Game initialBoard;      // Set in constructor.
    
    //============================================================== constructor
    public Grid(Game initialBoard) {
        setPreferredSize(new Dimension(boardPixels + 2, boardPixels + 2));
        setBackground(Color.WHITE);
        this.initialBoard = initialBoard;
    }
    
    //=========================================================== paintComponent
    @Override public void paintComponent(Graphics g) {
        //... Draw background.
        g.setColor(getBackground());
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLACK);
        
        drawGridLines(g);
        drawCellValues(g);
    }
    
    //============================================================ drawGridLines
    // Separate method to simlify paintComponent.
    private void drawGridLines(Graphics g) {
        
        //... Draw grid lines.  Terminates on <= to get final line.
        for (int i = 0; i <= puzzleSize; i++) {
            int acrossOrDown = i * boxPixels;
            //... Draw at different x's from y=0 to y=BOARD_PIXELS.
            g.drawLine(acrossOrDown, 0, acrossOrDown, boardPixels);
            //... Draw at different y's from x=0 to d=BOARD_PIXELS.
            g.drawLine(0, acrossOrDown, boardPixels, acrossOrDown);
            
            //... Draw a double line for subsquare boundaries.
            if (i % subSquare == 0) {
                acrossOrDown++;  // Move one pixel and redraw as above
                g.drawLine(acrossOrDown, 0, acrossOrDown, boardPixels);
                g.drawLine(0, acrossOrDown, boardPixels, acrossOrDown);
            }
        }
    }
    
    //=========================================================== drawCellValues
    // Method to simplify paintComponent.
    private void drawCellValues(Graphics g) {
        g.setFont(textFont);
        for (int i = 0; i < puzzleSize; i++) {
            int yDisplacement = (i+1) * boxPixels - textOffset;
            for (int j = 0; j < puzzleSize; j++) {
                if (initialBoard.getNum(i, j) != 0) {
                    int xDisplacement = j * boxPixels + textOffset;
                    g.drawString("" + initialBoard.getNum(i, j), xDisplacement, yDisplacement);
                }
            }
        }
    }
    
}







    /*
    public Grid(Game initalBoard){
	setPreferredSize(new Dimension(boardPixels + 5, boardPixels + 5));
	setBackground(Color.WHITE);
	this.initialBoard = initialBoard;
	
    }

    @Override
    public void paint(Graphics g){
        g.setColor(getBackground());
	g.fillRect(0, 0, getWidth(), getHeight());
	g.setColor(Color.BLACK);

	setGridLines(g);
	drawCellValues(g);
    }

    public void setGridLines(Graphics g){
	for (int i = 0; i <= puzzleSize; i ++){
	    int num = boxPixels * i;
	    g.drawLine(num, 0, num, boardPixels);
	    g.drawLine(0,num,boardPixels,num);
            if (i % subSquare == 0) {
                num++; 
                g.drawLine(num, 0, num, boardPixels);
                g.drawLine(0, num, boardPixels, num);
	    }
	}
    }

    
    private void drawCellValues(Graphics g) {
        g.setFont(textFont);
        for (int i = 0; i < puzzleSize; i++) {
            int yDisplacement = (i+1) * boxPixels - textOffset;
            for (int j = 0; j < puzzleSize; j++) {
                if (initialBoard.getNum(i, j) != 0) {
                    int xDisplacement = j * boxPixels + textOffset;
                    g.drawString("" + initialBoard.getNum(i, j), xDisplacement, yDisplacement);
                }
            }
        }

    }
    */

    


