
public static boolean isGameOver(char [][] gameboard){


    //Horizontal Win
    if(gameboard[0][0] == 'X'&& gameboard[0][2] == 'X' && gameboard [0][3] == 'X' ){
        System.out.println("Player Wins");
        playerScore++;
        return true;
    }
    if(gameboard[0][0] == 'O'&& gameboard[0][2] == 'O' && gameboard [0][3] == 'O' ){
        System.out.println("Computer Wins");
        computerScore++;
        return true;
    }
    if(gameboard[1][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [1][3] == 'X' ){
        System.out.println("Player Wins");
        playerScore++;
        return true;
    }
    if(gameboard[1][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [1][3] == 'O' ){
        System.out.println("Computer Wins");
        computerScore++;
        return true;
    }
    if(gameboard[2][0] == 'X'&& gameboard[2][2] == 'X' && gameboard [2][3] == 'X' ){
        System.out.println("Player Wins");
        playerScore++;
        return true;
    }
    if(gameboard[2][0] == 'O'&& gameboard[2][2] == 'O' && gameboard [2][3] == 'O' ) {
        System.out.println("Computer Wins");
        computerScore++;
        return true;
    }

    //Vertical Wins

        if(gameboard[0][0] == 'X'&& gameboard[1][0] == 'X' && gameboard [2][0] == 'X' ){
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(gameboard[0][0] == 'O'&& gameboard[1][0] == 'O' && gameboard [2][0] == 'O' ){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }

        if(gameboard[0][2] == 'X'&& gameboard[1][2] == 'X' && gameboard [2][2] == 'X' ){
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(gameboard[0][2] == 'O'&& gameboard[1][2] == 'O' && gameboard [2][2] == 'O' ){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }

        if(gameboard[0][3] == 'X'&& gameboard[1][3] == 'X' && gameboard [2][3] == 'X' ){
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(gameboard[0][3] == 'O'&& gameboard[1][3] == 'O' && gameboard [2][3] == 'O' ){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }

        //Diagonal Wins
        if(gameboard[0][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [2][3] == 'X' ){
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(gameboard[0][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [2][3] == 'O' ){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }

        if(gameboard[2][0] == 'X'&& gameboard[1][2] == 'X' && gameboard [0][3] == 'X' ){
            System.out.println("Player Wins");
            playerScore++;
            return true;
        }
        if(gameboard[2][0] == 'O'&& gameboard[1][2] == 'O' && gameboard [0][3] == 'O' ){
            System.out.println("Computer Wins");
            computerScore++;
            return true;
        }

        if(gameboard[0][0] != '_' && gameboard[0][2] != '_' && gameboard[0][3] != '_' && gameboard[1][0] !='_'&&
            gameboard[1][2] != '_' && gameboard[1][3] != '_' && gameboard[2][0] != ' ' && gameboard[2][2] != ' ' && gameboard[2][3] != ' '){
            System.out.println("Its a tie");
            return true;
        }
