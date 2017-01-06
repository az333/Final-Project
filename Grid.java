import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Grid extends JComponent {

    private Game game;
    
    private static int boxPixels = 50;
    private static int puzzleSize = 9;
    private static int subSquare = 3;
    private static int boardPixels = boxPixels * puzzleSize;
    private static int textOffset = 15;
    private static Font textFont = new Font ("Sansserif", Font.BOLD, 24);

    public Grid(Game game){
	setPreferredSize(new Dimension(boardPixels + 5, boardPixels + 5));
	setBackground(Color.WHITE);
	this.game = game;
    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(getBackground());
	g.fillRect(0, 0, getWidth(), getHeight());
	g.setColor(Color.BLACK);

	setGridLines(g);
	drawCellValues(g);
    }

    public void setGridLines(Graphics g){
	for (int i = 0; i < puzzleSize; i ++){
	    int num = boxPixels * i;
	    g.drawLine(num, 0, num, boardPixels);
	    g.drawLine(0,num,boardPixels,num);
	    if (i % 3 == 0){
		g.fillRect(num, 0, 2, boardPixels);
	    }
	}
    }


    // Method to simplify paintComponent.
    private void drawCellValues(Graphics g) {
        g.setFont(textFont);
        for (int i = 0; i < puzzleSize; i++) {
            int yDisplacement = (i+1) * boxPixels - textOffset;
            for (int j = 0; j < puzzleSize; j++) {
                if (game.getNum(i, j) != 0) {
                    int xDisplacement = j * boxPixels + textOffset;
                    g.drawString("" + game.getNum(i, j), xDisplacement, yDisplacement);
                }
            }
        }

    }
}
