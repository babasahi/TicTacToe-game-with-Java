package com.company;
import java.util.Scanner;
import java.lang.*;


public class TicTacToe {
    
    private static Scanner scanner = new Scanner(System.in);
    
    private static char[][] board = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
    private static final char X ='X';
    private static final char O ='O';
    private static int playNumber = 0;
    private static boolean finisher = false;
 
   
    
    private static void  LogicUnit (){
        if (board[0][0]==X && board[0][1]==X && board[0][2]==X){
            System.out.println("The PLayer X Wins !!");
            finisher=true;
        }else if(board[1][0]==X && board[1][1]==X && board[1][2]==X){
            System.out.println("The PLayer X Wins !!");
            finisher=true;
        } else if(board[2][0]==X && board[2][1]==X && board[2][2]==X){
            System.out.println("The PLayer X Wins !!");
            finisher=true;
        } else if(board[0][0]==X && board[1][1]==X && board[2][2]==X){
            System.out.println("The PLayer X Wins !!");
            finisher=true;
        } else if (board[0][0]==O && board[0][1]==O && board[0][2]==O){
            System.out.println("The PLayer X Wins !!");
            finisher=true;
        }else if(board[1][0]==O && board[1][1]==O && board[1][2]==O){
            System.out.println("The PLayer X Wins !!");
            finisher=true;
        } else if(board[2][0]==O && board[2][1]==O && board[2][2]==O){
            System.out.println("The PLayer X Wins !!");
            finisher=true;
        } else if(board[0][0]==O && board[1][1]==O && board[2][2]==O){
            System.out.println("The PLayer X Wins !!");
            finisher=true;
        }

       }
  
  
  
   private static void BoardPrinter(int p,char ch){

        if (!finisher) {

            switch (p) {
                case 1 -> {
                    board[0][0] = ch;
                    System.out.println("     " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
                }
                case 2 -> {
                    board[0][1] = ch;
                    System.out.println("     " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
                }
                case 3 -> {
                    board[0][2] = ch;
                    System.out.println("     " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
                }
                case 4 -> {
                    board[1][0] = ch;
                    System.out.println("     " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
                }
                case 5 -> {
                    board[1][1] = ch;
                    System.out.println("     " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
                }
                case 6 -> {
                    board[1][2] = ch;
                    System.out.println("     " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
                }
                case 7 -> {
                    board[2][0] = ch;
                    System.out.println("     " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
                }
                case 8 -> {
                    board[2][1] = ch;
                    System.out.println("     " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
                }
                case 9 -> {
                    board[2][2] = ch;
                    System.out.println("     " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
                    System.out.println("    " + "---+---+---");
                    System.out.println("     " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
                }
                default -> throw new IllegalStateException("Unexpected value: " + p);
            }
            LogicUnit();
            playNumber++;
        }
    }
  
  
  
     private static int PositionFinder(){

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter position : ");
        return scan.nextInt();
    }
    
    
  
    private static void ShowBoard(){
        char[][] board = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};

        System.out.println("     "+ board[0][0] +" | "+ board[0][1] +" | "+ board[0][2]);
        System.out.println("    "+ "---+---+---");
        System.out.println("     "+ board[1][0] +" | "+ board[1][1] +" | "+ board[1][2]);
        System.out.println("    "+ "---+---+---");
        System.out.println("     "+ board[2][0] +" | "+ board[2][1] +" | "+ board[2][2]);

    }
     
	 
       
    public static void main(String[] args) {
        
           if(!finisher){
            ShowBoard();

            System.out.print("Which you would like to start with X or O ? :");
            char choice = scanner.next().charAt(0);


            if (choice == 'X') {
                while (playNumber < 9 && !finisher) {

                    BoardPrinter(PositionFinder(), X);
                    BoardPrinter(PositionFinder(), O);

                }
                System.out.println("End Game !");
            } else if (choice == 'O') {
                while (playNumber < 9 && !finisher) {

                    BoardPrinter(PositionFinder(), O);
                    BoardPrinter(PositionFinder(), X);


                }
                System.out.println("End Game !");
            } else {
                System.out.println("Invalid inputs !, Please enter X or O ");

            }
        }
    }
    
	
    
    
}

