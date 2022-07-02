class BigBoard {
    //We initialized a 1D array of smallBoard and named it wholeBoard
    SmallBoard[] wholeBoard;
    public BigBoard() {
        //We created a array of 9 SmallBoard and declared it to wholeBoard
        wholeBoard = new SmallBoard[9];
        //We are using a for loop to put 9 smallBoards in the array of wholeBoard
        for(int i = 0; i < 9; i++) {
            wholeBoard[i] = new SmallBoard();
        }

    }
    public void individualBoardWinners() {
        //We are using a public statement to check for individual boards and check if the game is done
        // and we are printing which board number is done and the winner of that baord
        for(int i = 0; i < 9; i++) {
            if(wholeBoard[i].boardIsDone()) {
                System.out.println("The board#" + i + "winner is " + wholeBoard[i].getWinner());
            }
        }
        
    }
    //This public boolean statement which we labeled GameIsOver and we are used a total of possibilities of a 
    //player winning the bigBoard which is 1D and then we labeled it GameIsOver()
    public boolean GameIsOver() {
        //We set the boolean done to be false first then we change it to true when one of the conditional statements below
        //come out to be true
        boolean done = false;
        //The winner is a char statement and we initalized it
        char winner;
        //These are the winning possibilities of the player X and when the if statement which is filled with 3 and statements are 
        //true it prints out the winner to be X and the done statement to equal true
        if(wholeBoard[0].winner == 'X' && wholeBoard[3].winner == 'X' && wholeBoard[6].winner == 'X') {
            done = true;
            winner = 'X';
            System.out.println("Game winner is: X ");
        }
        if(wholeBoard[1].winner == 'X' && wholeBoard[4].winner == 'X' && wholeBoard[7].winner == 'X') {
            done = true;
            winner = 'X';
            System.out.println("Game winner is: X ");
        }
        if(wholeBoard[2].winner == 'X' && wholeBoard[5].winner == 'X' && wholeBoard[8].winner == 'X') {
            done = true;
            winner = 'X';

            System.out.println("Game winner is: X ");

        }
        if(wholeBoard[0].winner == 'X' && wholeBoard[1].winner == 'X' && wholeBoard[2].winner == 'X') {
            done = true;
            winner = 'X';
            //Change
            System.out.println("Game winner is: X ");
        }
        if(wholeBoard[3].winner == 'X' && wholeBoard[4].winner == 'X' && wholeBoard[5].winner == 'X') {
            done = true;
            winner = 'X';
            //Change
            System.out.println("Game winner is: X ");
        }
        if(wholeBoard[6].winner == 'X' && wholeBoard[7].winner == 'X' && wholeBoard[8].winner == 'X') {
            done = true;
            winner = 'X';

            System.out.println("Game winner is: X ");
        }
        if(wholeBoard[0].winner == 'X' && wholeBoard[4].winner == 'X' && wholeBoard[8].winner == 'X') {
            done = true;
            winner = 'X';

            System.out.println("Game winner is: X ");
        }
        if(wholeBoard[6].winner == 'X' && wholeBoard[4].winner == 'X' && wholeBoard[2].winner == 'X') {
            done = true;
            winner = 'X';

            System.out.println("Game winner is: X ");
        }
        //These are the winning possibilities of the player O and when the if statement which is filled with 3 and statements are 
        //true it prints out the winner to be O and the done statement to equal true
        if(wholeBoard[0].winner == 'O' && wholeBoard[3].winner == 'O' && wholeBoard[6].winner == 'O') {
            done = true;
            winner = 'O';
            System.out.println("Game winner is: O ");
        }
        if(wholeBoard[1].winner == 'O' && wholeBoard[4].winner == 'O' && wholeBoard[7].winner == 'O') {
            done = true;
            winner = 'O';

            System.out.println("Game winner is: O ");
        }
        if(wholeBoard[2].winner == 'O' && wholeBoard[5].winner == 'O' && wholeBoard[8].winner == 'O') {
            done = true;
            winner = 'O';

            System.out.println("Game winner is: O ");
        }
        if(wholeBoard[0].winner == 'O' && wholeBoard[1].winner == 'O' && wholeBoard[2].winner == 'O') {
            done = true;
            winner = 'O';

            System.out.println("Game winner is: O ");
        }
        if(wholeBoard[3].winner == 'O' && wholeBoard[4].winner == 'O' && wholeBoard[5].winner == 'O') {
            done = true;
            winner = 'O';

            System.out.println("Game winner is: O ");
        }
        if(wholeBoard[6].winner == 'O' && wholeBoard[7].winner == 'O' && wholeBoard[8].winner == 'O') {
            done = true;
            winner = 'O';

            System.out.println("Game winner is: O ");
        }
        if(wholeBoard[0].winner == 'O' && wholeBoard[4].winner == 'O' && wholeBoard[8].winner == 'O') {
            done = true;
            winner = 'O';

            System.out.println("Game winner is: O ");
        }
        if(wholeBoard[6].winner == 'O' && wholeBoard[4].winner == 'O' && wholeBoard[2].winner == 'O') {
            done = true;
            winner = 'O';

            System.out.println("Game winner is: O ");
        }
        //We returned done to exit out and set the boolean to doen to signal that we found a winner of the main board
        return done;
    }

    public void print() { 
        //We are printing out the main board here whihc we are going to be playing on
        //This M and n statement goes through the rows and columns
        for(int m = 0; m < 3; m++) {
            for(int n = 0; n < 3; n++) {
                //We usee the mathematic calculations for the row = 3 and col = 3
                //Then we use these calculations to go from left to right instead of top to bottom since the program does not go from bottom to top again 
                for(int b = m * 3; b < (m * 3) + 3; b++) {
                    SmallBoard boards = wholeBoard[b];
                    //We print out the value of b which is concatenated to print out Board value with integer 
                    System.out.print(" Board#" + b + " "); 
                    //Then we print out the values of the numbers so that they follow what the ultimate tic tac toe board is supposed to look like
                    for(int i = n * 3; i < (3*n) + 3; i++) {
                        //Print out the whole board
                        System.out.print("| " + boards.getBoard()[i / 3][i % 3] + " |");
                    }                 
                }
                System.out.println();
            }
        }
    }
}