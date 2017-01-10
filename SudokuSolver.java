import java.util.*; //random, scanner, arraylist
import java.io.*; //file, filenotfoundexception
//import java.math.BigInteger;


public class SudokuSolver  {

    
    public static boolean solveSudoku (Sudoku s) {
	int[][] board = s.getBoard();
	//System.out.println(s);
	for (int row = 0; row < board.length; row ++) {
	    for (int col = 0; col < board[row].length; col ++) {
		//skip the number if its empty 
		if (board[row][col] != 10) {
		    continue;
		}
		//go through each number 1 - 9
		for (int num = 1; num < 10; num++) {
		    //if its legit then add it in that spot
		    if (isLegit(s, row, col, num)) {
			board[row][col] = num;

			//recrusive step
			if (solveSudoku(s)) {
			    return true;
			} else {
			    board[row][col] = 10;
			}
		    }
		}
       
	      return false;
	    }
	}
	return true;
    }


    public static boolean isLegit (Sudoku s, int r, int c, int  num) {
	ArrayList <Integer> numsinrow = findNumsInRow (s, r);
	ArrayList <Integer> numsincol = findNumsInCol (s, c);
	ArrayList <Integer> numsinsquare = findNumsInSquare (s, r, c);
	//System.out.println ("Row " + numsinrow);
	//System.out.println ("Col " +numsincol);
	//System.out.println ("Sqaure " + numsinsquare); 
	if (numsinrow.contains(num) && numsincol.contains(num) && numsinsquare.contains(num)) {
		return true; 
	    }
	return false;
    }
	    

    //all possible nums to put based on row 
    public static ArrayList<Integer> findNumsInRow (Sudoku s, int r) {
	ArrayList <Integer> numsinrow = new ArrayList<Integer>();
	for (int i = 1; i < 10; i ++) {
	    numsinrow.add(i); 
	}

	int[][] board = s.getBoard();
	for ( int c = 0; c < board[r].length; c ++) {
	    if (board[r][c] != 10) {
		numsinrow.remove(Integer.valueOf(board[r][c])); 
	    }
	}
	return numsinrow; 
    }

    

    public static ArrayList<Integer> findNumsInCol (Sudoku s, int c) {
	ArrayList <Integer> numsincol = new ArrayList <Integer> ();
	for (int i = 1; i < 10; i ++) {
	    numsincol.add(i); 
	}
	int [][] board = s.getBoard(); 
	for (int r = 0; r < board.length; r ++) {
	    if (board[r][c] != 10) {
		numsincol.remove(Integer.valueOf(board[r][c])); 
	    }
	}
	return numsincol;
    }

    //only works for 9x9 board
    public static ArrayList<Integer> findNumsInSquare (Sudoku s, int r, int c) {
	int [][] board = s.getBoard();
        ArrayList <Integer> numsinsquare = new ArrayList<Integer> ();
	for (int i = 1; i < 10; i ++) {
	    numsinsquare.add(i); 
	}
	int square = Sudoku.findSquare (r, c);
	int firstrow = (r < 3) ? 0 : ( (r > 5) ? 6: 3); 
	int firstcol = (c < 3) ? 0 : ( (c > 5) ? 6: 3);
	for (int row = firstrow; row < firstrow + 3; row ++) {
	    for (int col = firstcol; col < firstcol +3; col ++) {
		if (board[row][col] != 10) {
		    numsinsquare.remove(Integer.valueOf(board[row][col]));		 		
		}
	    }
	}
	return numsinsquare;
    }

    public static boolean validRowSums (Sudoku s) {
	int sum = 0;
	int[][] board = s.getBoard(); 
	for (int r = 0; r < board.length; r ++) {
	    sum = s.sumRow (r);
	    if (sum != 45) {
		return false;
	    }
	}
	return true; 
    }

    public static boolean validColSums (Sudoku s) {
	int sum = 0;
	int[][] board = s.getBoard(); 
	for (int c = 0; c < board[0].length; c ++) {
	    sum = s.sumCol (c);
	    if (sum != 45) {
		return false;
	    }
	}
	return true; 
    }

    public static boolean validSquareSums (Sudoku s) {
	int sum = 0;
	int[][] board = s.getBoard(); 
	for (int r = 0; r < board.length; r ++) {
	    for (int c = 0; c < board[r].length; c ++) {
		sum = s.sumSquare (r, c);
		if (sum != 45) {
		    return false;
		}
	    }
	}
	return true; 
    }

    public static boolean validSums (Sudoku s) {
	if (validRowSums (s) && validSquareSums (s) && validColSums (s)) {
	    return true;
	}
	return false;
    }

    public static void main (String[] args) {

	/*
	Sudoku ra = new Sudoku();
=======
	/*	Sudoku ra = new Sudoku();
>>>>>>> Donia
	int[][] r = ra.getBoard();
	r[0][0] = 6;
	r[1][0] = 9;
	r[7][0] = 2;
 	r[6][1] = 9;
 	r[0][3] = 4;
 	r[1][3] = 7;
 	r[4][3] = 6;
 	r[6][3] = 2;
 	r[3][4] = 3;
 	r[5][4] = 2;
	r[2][5] = 5;
 	r[4][5] = 7;
 	r[7][5] = 3;
 	r[8][5] = 6;
 	r[2][7] = 9;
 	r[1][8] = 5;
 	r[7][8] = 8;
 	r[8][8] = 4;
 	System.out.println (ra);
 	solveSudoku(ra);
 	System.out.println (ra); */
	    }
}


    

