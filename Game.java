import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Game extends JComponent{

    private int[][] puzzleNums = new int[9][9];
    public Game(){
	for (int i = 0; i < 9 ; i++){
	    for (int j = 0; j < 9 ; j++){
		puzzleNums[i][j] = (i * 3 + i / 3 + j % 10);
	    }
	}
    }
    //going to have to write a constructor that takes in an int[][] and sets puzzleNums = to that

    
    public void setNum(int r, int c, int x){
	puzzleNums[r][c] = x;
    }
    
    public int getNum(int r, int c){
	return puzzleNums[r][c];
    }
    
    public void clear(){
	for (int row = 0; row < 9; row++){
	    for (int col = 0; col < 9; col++){
		setNum(row,col, 0);
	    }
	}
    }
    





    

}
