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
        setPreferredSize(new Dimension(boardPixels + 2, boardPixels + 2));
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
    
    private void drawCellValues(Graphics g) {
        g.setFont(textFont);
        for (int i = 0; i < puzzleSize; i++) {
            int yDisplacement = (i+1) * boxPixels - textOffset;
            for (int j = 0; j < puzzleSize; j++) {
                if (initialBoard.getNum(i, j) != 0) {
		    String value = boxValue(initialBoard.getNum(i,j));
                    int xDisplacement = j * boxPixels + textOffset;
                    g.drawString(value, xDisplacement, yDisplacement);
                }
            }
        }
    }


    private String boxValue(int num){
	String ans = "";
	if (num < 10 && num > 0){
	    ans = num + "";
	}
	return ans;
    }
	
    
}




