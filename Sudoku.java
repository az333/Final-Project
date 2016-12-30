import java.util.*; //random, scanner, arraylist
import java.io.*; //file, filenotfoundexception
//import java.math.BigInteger;

public class Sudoku { 
    private int[][] board;
    private Random randgen;
    private int difficulty; //1 for easy, 2 for medium, 3 for hard


    //default difficulty is medium
    public Sudoku () {
	this (2, (long)(Math.random()* 999999999), false);
    }

    
    public Sudoku (int diff, boolean showKey) { 
	this (diff, (long)(Math.random()* 999999999), false); 
    }

    public Sudoku (int diff, long seed, boolean showKey) { 
	board = new int[9][9];
	difficulty = diff; 
	randgen = new Random(seed);
	clear();
	//fillWithNumbers ();
	if (showKey) {
	    // System.out.println(this);
	} else { 
	    //deleteSomeNumbers();
	    // System.out.println (this);
	}	
    }

	
    /**Set all values on the board to underscores'_'*/
    private void clear(){		
	for (int row = 0; row < board.length; row ++) {
	    for ( int column = 0; column < board[row].length; column ++) {
		board[row][column] = '_';
	    }
	}
    }
    
    //max sum is 45 
   
    public void addNumber (int row, int col) {
     
    }

    public int sumRow (int r) {
	int sum = 0;
	int[] row = board[r];
	for (int index = 0; index < row.length; index ++) {
	    sum += row[index]; 
	}

	return sum;
    }

    public int sumCol (int col) {
	int sum = 0;
	for (int row = 0; row < board.length; row ++) {
	    sum += board[row][col];
	} 
	return sum;
    }

    public int sumSquare (int row, int col) {
	int sum = 0;
	return sum;
    }

    public void fillWithNumbers () {
	for (int row = 0; row < board.length; row ++) {
	    for (int col = 0; col < board[row].length; col ++) {
		addNumber (row, col);
	    }
	}
    }




    }
