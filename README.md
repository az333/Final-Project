Final-Project

SoDoCa (Donia Tung & Angelica Zverovich)

-Brief description of your project: 

Our project is a Sudoku Player. It allows the user to play games, play games they've played before (provided they have the puzzle number and difficulty level), and input puzzles for the program to solve.


-List of Working features / Things I should test: 

•	Create a new, unique Sudoku puzzle of various difficulties. 
•	The user can input numbers into the grid with mouse and action listeners. 
•	There are functions to check the current inputted numbers if the user hasn't finished the entire puzzle, and a reveal option if the user chooses to give up. 
•	If there is a mistake in the user's incomplete grid, they can erase a certain box. 
•	The numbers of the initial puzzle are in a bold font and the user's font is in plain so that a difference is noticeable. 
•	If the user chooses, they can input the seed number (puzzle #) and puzzle difficulty into the old game section, and the same puzzle will display for the user to play (following the same rules for playing a new game and with the same functions). 
•	The user can also input a puzzle for the program to solve. They enter the numbers of their puzzle into the grid in the same way that they would if they were playing a game, and click solve for the program to complete the puzzle.
•	The solver will notify the user if the inputted puzzle does not have any solution. 


-List of unresolved bugs: 

•	There's a slight issue with the solver because it will return a solution regardless of whether or not the inputted puzzle is unique. It's not really a bug since it will still provide a solution, but it's not perfect either. 
•	The checker generally works as well, but sometimes it will say that certain boxes that are correct are actually wrong. 


-Directions on how to compile and run your code: 

You just have to compile and run the file called "Main.java" for the code to function.


-Directions on how to use your program: 

•	The menu page, which is what will appear at first, provides three options: new game, old game, access the solver. 
•	Once either of these three are chosen, a grid will appear with numbers on the sides. 
•	To place a number on the grid, first click on the box in which you'd like the number to go (preferably a double click because sometimes a single click does not register) and then click on whichever number you want to place there. 
•	Everything else is self-explanatory; you click on the buttons and the program does what they say.
•	The solver follows the same rules as the game grid regarding how to place numbers. 
•	Updated messages will appear above the game grid at appropriate times (such as when the user decides to check their solution) 

