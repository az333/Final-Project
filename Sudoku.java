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

    public Sudoku (int[][] gameboard) {
	this ();
	board = gameboard; 
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

	
    //Set all values on the board to 10
    private void clear(){		
	for (int row = 0; row < board.length; row ++) {
	    for ( int column = 0; column < board[row].length; column ++) {
		board[row][column] = 10;
	    }
	}
    }
    

    public int[][] getBoard() { return board; }

    public void setBoard(int[][] board) { this.board = board; }

    public int getDifficulty () {return difficulty; }

    public void setDifficulty (int diff) { difficulty = diff; }

    
    public void addNumber (int row, int col) {
       
    }

    
    //max sum is 45
    public int sumRow (int r) {
	return sumRow (r, 0, board[r].length);
    }

    //non inclusive of endcol
    public  int sumRow (int r, int startcol, int endcol) {
	int sum = 0;
	int[] row = board[r];
	for (int index = startcol; index < endcol; index ++) {
	    if (row[index] != 10) {
		sum += row[index];
	    }
	}

	return sum;
    }

    public int sumCol (int col) {
	return sumCol (col, board.length );
    }

    //noninclusive of endrow
    public  int sumCol (int col, int endrow) {
	int sum = 0;
	for (int row = 0; row < endrow; row ++) {
	    if (board[row][col] != 10) {
		sum += board[row][col];
	    }
	} 
	return sum;
    }

     public  int sumSquare (int row, int col) {
	int sum = 0;
	int square = findSquare ( row,  col);
	int firstrow = (row < 3) ? 0 : ( (row > 5) ? 6: 3); 
	int firstcol = (col < 3) ? 0 : ( (col > 5) ? 6: 3);
	for (int r = firstrow; r < firstrow + 3; r ++) {
	    sum += sumRow(r, firstcol ,firstcol + 3);
	}		   
	return sum;
    }


    public static int findSquare (int row, int col) {
	int square;
	if (row  < 3) {
	    square = ( col < 3) ? 1 : ( (col > 5) ?  3: 2);	    
	}else if (row > 5) {
	    square = ( col < 3) ? 7 : ( (col > 5) ?  9: 8);
	}else {
	    square = ( col < 3) ? 4 : ( (col > 5) ?  6: 5);
	}
	return square;
    }



    public void fillWithNumbers () {
	for (int row = 0; row < board.length; row ++) {
	    for (int col = 0; col < board[row].length; col ++) {
		addNumber (row, col);
	    }
	}
    }

    public String toString () {
	String str = "";
	for (int r = 0 ; r < board.length; r ++) {
	    for (int c = 0; c < board[r].length; c ++) {
		str = str +  board[r][c] + " ";
	    }
	    str += "\n";
	}
	return str; 
    }

    public static void main (String[] args) {
	Sudoku a = new Sudoku ();

	
	
    } 

    }
