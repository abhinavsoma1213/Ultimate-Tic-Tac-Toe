public class SmallBoard {
    //I are creating the small board and we created a new public class and named it smallBoard
    //created a 2D board and with char values
    char[][] board;
    //Created a boolean and labeled it done
    Boolean done;
    //Created a char and initalized it with the variable of winner
    char winner;
    
    public SmallBoard() {
        //I put the board variable and created a 2D array with 3 by 3 space in memory
        board = new char[3][3];
        //set the boolean variable done and declared it to be false
        done = false;
        //put the initialized variable winner and declared it with a char of N
        winner = 'N';
        //I created a for loop that fills the board with i++ for the row
        for(int i = 0; i < board.length; i++) {
            //The for loop was created and set the columns of j++
            for(int j = 0; j < board[i].length; j++) {
                //Performed mathematical equations and converted int values to char and set them to the 2D board[i][j]
                board[i][j] = (char)((i * 3 + j) + '0');
            }
        }
    }
    //Created a public char getWinner function to get winner
    public char getWinner() {
        //We reuturned winner
        return winner;
    }
    //Created a public boolean isFull
    public boolean isFull() {
        //I initalized int row and col
        int row, col;
        //I created a for loop to check if the row and col of the board is full
        for(int i = 0; i < 9; i++) {
            row = i / 3;
            col = i % 3;
            //if the board[row][col] had a empty place it returned false
            if(board[row][col] == ' ') {
                return false;
            }
        }
        return true;

    }
    //Creadted a char 2D getBoard function to return board
    public char[][] getBoard() {

        return board;

    }
    //This public void print() function is going to format the way that the rows and the columns of the bigboard
    public void print() {
        for(int i = 0; i < board.length; i++) {

            for(int j = 0; j < board[i].length; j++) {

                System.out.printf("| %d |", ((3 * i) + j));
            }
        }

    }
    public Boolean boardIsDone() {
        // Small Board
        //This is the winning possibilities of X  and O for the small board and we returned a winner for the smallBoard which will be connected to 
        //Winning the big board
        if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            done = true;
            winner = 'X';

        }
        if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
            done = true;
            winner = 'X';
        }
        if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
            done = true;
            winner = 'X';
        }
        if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
            done = true;
            winner = 'X';
        }
        if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
            done = true;
            winner = 'X';
        }
        if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            done = true;
            winner = 'X';
        }
        if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            done = true;
            winner = 'X';
        }
        if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            done = true;
            winner = 'X';
        }
        
        if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
            done = true;
            winner = 'O';
        }
        if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
            done = true;
            winner = 'O';
        }
        if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
            done = true;
            winner = 'O';
        }
        if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
            done = true;
            winner = 'O';
        }
        if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
            done = true;
            winner = 'O';
        }
        if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
            done = true;
            winner = 'O';
        }
        if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            done = true;
            winner = 'O';
        }
        if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            done = true;
            winner = 'O';
        }
        //returns done as a boolean
        return done;
    }

}
