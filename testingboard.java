import java.util.Scanner;
import java.util.Random;


/*
Author: Abhinav Soma
Date:May 4th 2022
Description: I built an ultimate tic tac toe board where each player who enters the square of the board that the player wants
to play in the corresponding square of the big board the next player plays in and then they do that until they win 3 of the mini
games in a formation that it is 3 in a row. 

*/
public class testingboard {   

    public static void main(String[] args) {
        //This scanner is for all the user inputs for the game
        Scanner scan = new Scanner(System.in);
        //Brought BigBoard class and renamedit Abord and called it to the main function
        BigBoard Aboard = new BigBoard();
        //The statment that is printed out before the gameboard
        System.out.println("WELCOME TO THE ULTIMATE TIC-TAC-TOE GAME!!");
        //The bigboard class which is not called Aboard is printed after the statement above
        Aboard.print();
        //newline is printed out
        System.out.println();
        //Declared and initalized player variable with the char type and gave it X
        char player = 'X';

        char test;

        //This random function is used for the ai to randomize what board and square in that board the O will go in
        Random rand = new Random();
        //Initialized and declared 2 variables which is a selectedBoard and selectedSquare for the ultimate TicTacToe
        int selectedBoard = -1, selectedSquare = 0;
        //These code section is for the choice of the game the user wants by using a switch statement to go through all the cases
        System.out.println("Enter the choice you want 1: Player versus AI or 2: AI vs AI or 3: Player vs Player");
        //Choice is an int and the user inputs it using the scanner operation
        int choice = scan.nextInt();
        System.out.println("You choice that you picked is " + choice);
        switch(choice) {
            case 1:
                System.out.println("The choice you picked is Player versus AI");
                break;
            case 2:
                System.out.println("The choice you picked is AI vs AI");
                break;
            case 3:
                System.out.println("The choice you picked is Player vs Player");
                break;
            default:
                System.out.println("The choice you have made is not available please try again!");
                break;
        }
        //This first do while loop is for the Player vs Player 
            do {
                //This is the the first message that you get after the printing of the board which tells the user of the game what player it is 
                // it is either an X or O
                System.out.println("Current player is : " + player);
                if(selectedBoard == -1){
                    System.out.print("Please select a valid board : ");
                    selectedBoard = scan.nextInt();
                }
                //We are checking the worst case senarios of the player putting a number that is not in range
                if(selectedBoard > 8) {
                    System.out.println("invalid move!");
                    System.out.println("Please Try again!");
                    selectedBoard = -1;
                    continue;

                }
                if(selectedBoard < 0) {
                    System.out.println("invalid move!");
                    System.out.println("Please Try again!");
                    selectedBoard = -1;
                    continue;
                }
                //This is the same as above but we use a while loop for selectedSquare in that if they select a square that is above 8 and below 0 it prints out an error
                //and you have to try again
                System.out.println("Selected Board : " + selectedBoard);
                System.out.print("Please select a valid square on the selected board: ");
                selectedSquare = scan.nextInt();
                while(selectedSquare > 8 || selectedSquare < 0) {
                    if(selectedSquare > 8) {
                        System.out.println("invalid move!");
                        System.out.println("Please Try again!");
                    }

                    if(selectedSquare < 0) {
                        System.out.println("invalid move!");
                        System.out.println("Please Try again!");
                    }
                    //Check if the sqaure is a char
                    
                }


                
                //We are printing out the selectedSquare int and the string by concatenation and then we print it out in newline
                System.out.print("Selected Square : " + selectedSquare);
                System.out.println();
        
                //This for the row and col for the board
                int row = selectedSquare / 3;
                int col = selectedSquare % 3;
                Aboard.wholeBoard[selectedBoard].board[row][col] = player;
                Aboard.print();

                //This if and else statement changes the player X and O over every turn of the game/every player plays each turn
                if(player == 'X') {
                    player = 'O';
                }
                else {
                    player = 'X';
                }
                //This if statement is going to check the board that you are picking is full and then it will set it to -1
                //and then it goes back to the top of the loop so you can select another board number
                if(Aboard.wholeBoard[selectedBoard].isFull()) {
                    selectedBoard = -1;
                }
                //We are printing the the indiviual/smallBoard winners in the do while loop
                Aboard.individualBoardWinners(); 
                //This changes the board everytime the player enters the selectedSquare that sets the next players board that they will
                //play on
                selectedBoard = selectedSquare;
                 
        }while(choice == 3);
        //This second do while loop is for the Player vs AI 
        do {
            
            //This is the the first message that you get after the printing of the board which tells the user of the game what player it is 
            // it is either an X or O
            System.out.println("Current player is : " + player);
            //This if statement connects with the variable we declared earlier in that we declared selectedBoard = -1 which means that it never changes 
            // So we ask the user to select a valid board
            if(selectedBoard == -1){
                System.out.print("Please select a valid board : ");
                selectedBoard = scan.nextInt();
            }
            //This if statement checks for the worst case senario in selectedBoard that if the user puts a value of 9 or -1 it prints out an error and 
            //you have to try again
            if(selectedBoard > 8) {
                System.out.println("invalid move!");
                System.out.println("Please Try again!");
                selectedBoard = -1;
                continue;

            }

            if(selectedBoard < 0) {
                System.out.println("invalid move!");
                System.out.println("Please Try again!");
                selectedBoard = -1;
                continue;
            }
            //This is the same as above but we use a while loop for selectedSquare in that if they select a square that is above 8 and below 0 it prints out an error
            //and you have to try again
            while(selectedSquare > 8 || selectedSquare < 0) {
                System.out.println("Selected Board : " + selectedBoard);
                System.out.print("Please select a valid square on the selected board: ");
                selectedSquare = scan.nextInt();
                if(selectedSquare > 8) {
                    System.out.println("invalid move!");
                    System.out.println("Please Try again!");
                }
                if(selectedSquare < 0) {
                    System.out.println("invalid move!");
                    System.out.println("Please Try again!");
                }
            }
            //This prints out what the selected square was which i concatenations with a string and an int to form one statement that prints
            //for the user to see
            System.out.print("Selected Square : " + selectedSquare);
            System.out.println();
            
            //This for the row and col for the board and then we print
            int row = selectedSquare / 3;
            int col = selectedSquare % 3;
            Aboard.wholeBoard[selectedBoard].board[row][col] = player;
            //Prints board
            Aboard.print();
            //This allows the player of X and O to go back and forth
            if(player == 'X') {
                player = 'O';
            }
            else {
                player = 'X';
            }
            //This means that one of the player that I set to with the if statement is randomized

            if(player == 'O') {
                
                selectedBoard = rand.nextInt(9);
                selectedSquare = rand.nextInt(9);
            }
            //This changes the board everytime the player enters the selectedSquare that sets the next players board that they will
            //play on
            selectedBoard = selectedSquare;
            //Checks if the board is full and then if it is it sets the selectedBoard to -1 which means that it starts over from
            //the start and you have to set the value of the board you want to play in
            if(Aboard.wholeBoard[selectedBoard].isFull()) {

                selectedBoard = -1;
            }
            //Checks for individualBoard winners in the main Board/Aboard
            Aboard.individualBoardWinners(); 

        }while(choice == 1);

        // This is AI vs AI choice
        do {
            //This prints out the current player
            System.out.println("Current player is : " + player);
            //This if statement allows for the ai to pick which board it wants to play in randomized
            if(selectedBoard == -1){
                System.out.print("Please select a valid board : ");
                selectedBoard = scan.nextInt();
            }

            //This covers for the worst possible case for the selectedBoard
            if(selectedBoard > 8) {
                System.out.println("invalid move!");
                System.out.println("Please Try again!");
                selectedBoard = -1;
                continue;

            }

            if(selectedBoard < 0) {
                System.out.println("invalid move!");
                System.out.println("Please Try again!");
                selectedBoard = -1;
                continue;
            }
            //This allows to check for the worst possible case of the selectedSquare
            while(selectedSquare > 8 || selectedSquare < 0) {
                System.out.println("Selected Board : " + selectedBoard);
                System.out.print("Please select a valid square on the selected board: ");
                selectedSquare = scan.nextInt();
                if(selectedSquare > 8) {
                    System.out.println("invalid move!");
                    System.out.println("Please Try again!");
                }

                if(selectedSquare < 0) {
                    System.out.println("invalid move!");
                    System.out.println("Please Try again!");
                }
            }
            //This prints out what the selected square was which i concatenations with a string and an int to form one statement that prints
            //for the user to see
            System.out.print("Selected Square : " + selectedSquare);
            System.out.println();   

            //This for the row and col for the board and then we print
            int row = selectedSquare / 3;
            int col = selectedSquare % 3;
            Aboard.wholeBoard[selectedBoard].board[row][col] = player;
            //Prints board
            Aboard.print();
            //This allows the player of X and O to go back and forth
            if(player == 'X') {
                player = 'O';
            }

            else {
                player = 'X';
            }
            //I sent player X and O and we put the selectedBoard and selectedSquare numbers randomized so that it is like an Ai player
            if(player == 'O') {
                
                selectedBoard = rand.nextInt(9);
                selectedSquare = rand.nextInt(9);
            }

            if(player == 'X') {

                selectedBoard = rand.nextInt(9);
                selectedSquare = rand.nextInt(9);
            }
            //This declares that the selectedSquare value that the previous player plays will the board that the next person plays in
            selectedBoard = selectedSquare;
            //Checks if the board is full and then if it is it sets the selectedBoard to -1 which means that it starts over from
            //the start and you have to set the value of the board you want to play in
            if(Aboard.wholeBoard[selectedBoard].isFull()) {

                selectedBoard = -1;
            }
            //This prints out the individual board winner and the overall winner
            Aboard.individualBoardWinners(); 

        }while(choice == 2);
        //We close the scan
        scan.close();
    }
}

