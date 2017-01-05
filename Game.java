import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Game {

    private int[][] puzzleNums = new int[9][9];
    public Game(){
	for (int i = 0; i < 81 ; i++){
	    for (int j = 0; j < 81 ; j++){
		puzzleNums[i][j] = (i * 3 + i / n + j % 10);
	    }
	}
    }

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
