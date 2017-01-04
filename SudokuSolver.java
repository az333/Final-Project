import java.util.*; //random, scanner, arraylist
import java.io.*; //file, filenotfoundexception
//import java.math.BigInteger;


public class SudokuSolver  {

    
    public static Sudoku solveSudoku (Sudoku s) {
	int[][] board = s.getBoard();
	ArrayList <Integer> numsinrow = new ArrayList <Integer> ();
	ArrayList <Integer> numsincol = new ArrayList <Integer> ();
	ArrayList <Integer> numsinsquare = new ArrayList <Integer> ();
	for (int r = 0; r < board.length; r ++) {
	    for ( int c = 0; c < board[r].length; c ++) {
		if (board[r][c] == 10) {
		    numsinrow = findNumsInRow (s, r);
		    numsincol = findNumsInCol (s, c);
		    numsinsquare = findNumsInSquare (s, r, c); 
		    Random randgen = s.getRandgen ();
		    int nextint = Math.abs(randgen.nextInt()) % 9 + 1;
		    while (numsinrow.indexOf(nextint) != -1 ||
			   numsincol.indexOf(nextint) != -1 ||
			   numsinsquare.indexOf(nextint) != -1 &&
			   (numsinrow.size() != 9 &&
			    numsincol.size() != 9 &&
			    numsinsquare.size() != 9)) {
			nextint = Math.abs(randgen.nextInt()) % 9 + 1;
		    }
		    board[r][c] = nextint; 
		}	
	    }
	}
	s.setBoard(board);
	return s;
    }


    public static ArrayList<Integer> findNumsInRow (Sudoku s, int r) {
	ArrayList <Integer> numsinrow = new ArrayList<Integer>();
	int[][] board = s.getBoard();
	for ( int c = 0; c < board[r].length; c ++) {
	    if (board[r][c] != 10) {
		numsinrow.add(board[r][c]); 
	    }
	}
	return numsinrow; 
    }

    

    public static ArrayList<Integer> findNumsInCol (Sudoku s, int c) {
	ArrayList <Integer> numsincol = new ArrayList <Integer> ();
	int [][] board = s.getBoard(); 
	for (int r = 0; r < board.length; r ++) {
	    if (board[r][c] != 10) {
		numsincol.add(board[r][c]); 
	    }
	}
	return numsincol;
    }

    //only works for 9x9 board
    public static ArrayList<Integer> findNumsInSquare (Sudoku s, int r, int c) {
	int [][] board = s.getBoard();
        ArrayList <Integer> numsinsquare = new ArrayList<Integer> ();
	int square = Sudoku.findSquare (r, c);
	int firstrow = (r < 3) ? 0 : ( (r > 5) ? 6: 3); 
	int firstcol = (c < 3) ? 0 : ( (c > 5) ? 6: 3);
	for (int row = firstrow; row < firstrow + 3; row ++) {
	    for (int col = firstcol; col < firstcol +3; col ++) {
		if (board[row][col] != 10) {
		    numsinsquare.add(board[row][col]);		 		
		}
	    }
	}
	return numsinsquare;
    }

}
    
