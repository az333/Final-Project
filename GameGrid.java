import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameGrid extends JFrame extends ActionListener{ //this is the part with the action listener



    
    private int[][] puzzleNums = new int[9][9];
    public int[][] createPuzzle(int n){
    for (int i = 0; i < n*n ; i++){
	for (int j = 0; j < n*n ; j++){
	puzzleNums[i][j] = (i * n + i / n + j %10);
	}
    }
    puzzleNums.createPuzzle(n);



    
    
    }
    
	    
    










    

}
