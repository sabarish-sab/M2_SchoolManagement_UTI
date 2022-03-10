# REPORT

# Abstract

 * Tic-tac-toe, also known as noughts and crosses, or Xs and Os/“X’y O’sies”, is a game for two players, X and O, who take turns marking the spaces in a 3×3 grid. The player who succeeds in placing three of their marks in a diagonal, horizontal, or vertical row is the winner. It is a solved game with a forced draw assuming best play from both players. It is usually played on paper but as the technology evolved, here is a digital version of it.
 * This topic was chosen because it gives me an opportunity to implement and understand JAVA programming concepts.
 
 
# Research
### Tic-tac-toe Game Features and Benefits
It is often used as a pedagogical tool for teaching the concepts of good sportsmanship and the branch of artificial intelligence that deals with the searching of game trees. It is straightforward to write a computer program to play tic-tac-toe perfectly or to enumerate the 765 essentially different positions (the state space complexity) or the 26,830 possible games up to rotations and reflections (the game tree complexity) on this space. If played optimally by both players, the game always ends in a draw, making tic-tac-toe a futile game.

The game can be generalized to an m,n,k-game in which two players alternate placing stones of their own color on an m×n board, with the goal of getting k of their own color in a row. Tic-tac-toe is the (3,3,3)-game.Harary's generalized tic-tac-toe is an even broader generalization of tic-tac-toe. It can also be generalized as a nd game. Tic-tac-toe is the game where n equals 3 and d equals 2.It can be generalised even further by playing on an arbitrary incidence structure, where rows are lines and cells are points.

# Benefits
Tic-tac-toe Game offers a few benefits. Here are just a few of them:

## Good Sportsmanship
Like any game, tic tac toe also teaches a person to accept the defeat as well as ackowledge the win.

## Prepares for more complex games
It prepares a person for more complex games because they have to think of multiple things at one time.

## Developement of Coordination
Tic-tac-toe helps develop coordination, fine motor skills and visual skills.

## Mannerism
It helps one to learn how to follow rules and take turns.

## Concentration
It can help to improve a person's concentration as well as strategic thinking

# Cost and Features with Time 
| Time | Feature | Cost |
| ----- | ----- | ----- |
| 1558| Started as a pen and paper game in Roman Emire, earlier it was called tic tac.   | Free (Pen and Paper) |
| 1952 |In 1952, OXO (or Noughts and Crosses), developed by British computer scientist Sandy Douglas for the EDSAC computer at the University of Cambridge, became one of the first known video games.| $5 |
| 2000-2021 | After Digitalisation, this game is almost free for everyone on multiple mediums.| Cost-effective |

# Defining Our System

![Description](https://github.com/ArnoldKevinDesouza/Tic-Tac-Toe/blob/main/6_Media/flow.png?raw=true)
## Explanation:
* The game starts giving you three input options(1, 2, 3):
    * 1 means you play using 'X'.
    * 2 means you play using 'O'.
    * 3 means you exit the game.
* The game ends when:
    * It is in a draw situation , i.e, a total of 9 moves have been completed and novody has won.
    * You win.
    * The computer wins.
* The game continues in the beginning if the check for draw is false.
* Then it checks if anyone has won yet.
* If not, then it again checks if it is a draw situation.



# SDLC Activity Based Learning
![tic-tac-toe](https://user-images.githubusercontent.com/80390615/132171903-dc7a8320-52e4-431e-8bf0-79afc2778a19.png)


## Folder Structure
Folder             | Description
-------------------| -----------------------------------------
`0_Certificate`    | Sololearn certification and HackerRank Gold badge
`1_Requirements`   | Documents detailing requirements and research
`2_Design`         | Documents specifying design details
`3_Implementation` | All code and documentation
`4_Test_plan`      | Documents with test plans and procedures
`5_Report`         | Report 
  




## SWOT ANALYSIS
![SWOT Analysis](https://github.com/ArnoldKevinDesouza/Tic-Tac-Toe/blob/main/6_Media/swot.png?raw=true)

# 4W&#39;s and 1&#39;H

## Who:
* Anyone can play this game. 
* Also, businesses can use it.

## What:
* This game is for recreational purposes. 
* Businesses can also use is for development of strategies as there are many possible outcomes in this game.

## When:
* This game can be played whenever you are feeling bored or want to figure out ways, outcomes and situations of this game.

## Where:
* A variety of websites make a simple tic tac toe game available.
* Also used in businesses and organizations.


## How:
* It can be implemented in a business strategy to help improve it. Business strategy is about moving swiftly and getting an advantageous position. In Tic-Tac-Toe, this is pretty straight forward: The first mover can choose the best position. In business, it is a bit more complicated. Even if business strategy is more complex, the principle is the same: Move swiftly when the time comes, go for an advantageous position.

# Detail requirements
## High Level Requirements: 
| ID | Description | 
| ----- | ----- | 
| HR01 | User shall be able to choose 'X' to play |
| HR02 | User shall be able to choose 'O' to play |
| HR03 | User shall be able to Exit the game |
| HR04 | User shall lose|
| HR05 | User shall win|
| HR06 | User shall end up in a Draw situation|
##  Low level Requirements:
 
| ID | Description | HLR ID |
| ------ | --------- | ------ |
| LR01 | If the user presses '1', he'll be play with 'X'. | HR01 |
| LR02 | If the user is playing with 'X', he'll get the first turn. | HR01 |
| LR03 | If the user presses '2', he'll be play with 'O'. | HR02 |
| LR04 | If the user is playing with 'O', he'll get the second turn. | HR02 |
| LR05 | If the user presses '3', it'll exit the game. | HR03 |
| LR06 | If the computer gets 3 Xs or 3 Os in vertical,horizontal or diagonal row, User will lose. | HR04 |
| LR07 | If the user gets 3 Xs or 3 Os(as per his choice), in vertical,horizontal or diagonal row, he'll win. | HR05 |
| LR08 | If the total number of moves, i.e., 9 moves have been completed and neithe the user nor the computer has won, it'll end up in a draw. | HR06 |

# Design

## High Level Design 

### Behavioral Usecase Diagram

![Architecture](https://github.com/ArnoldKevinDesouza/Tic-Tac-Toe/blob/main/6_Media/usecase%20HL.png?raw=true)

### Structural Diagram

![Architecture](https://github.com/ArnoldKevinDesouza/Tic-Tac-Toe/blob/main/6_Media/high%20level%20structural.png?raw=true)

## Low Level Design 

### Behavioral Usecase Diagram

![Architecture](https://github.com/ArnoldKevinDesouza/Tic-Tac-Toe/blob/main/6_Media/structural%20HL.png?raw=true)


### Structural Diagram

![Architecture](https://github.com/ArnoldKevinDesouza/Tic-Tac-Toe/blob/main/6_Media/structural%20high%20level.png?raw=true)



# TEST PLAN And Output:

## Table no: High level test plan

|Test ID | Description | Exp I/P | Exp O/P |
|--------|-------------|---------|---------|
|H_01    |  Check if the graph for playing is being drawn or not.           |    No input.     |      3X3 graph is drawn.   |
|H_02    |Check if player/computer got 3 of his inputs in vertical, horizontal or diagonal format.             |   'X' or 'O' i/p from the user/computer.      |The user/computer won the game.|
|H_03    | Check for draw.            |   9 inputs from (user+computer).      |     The game is over.    |

## Table no: Low level test plan

|Test ID | Description | Exp I/P | Exp O/P |
|--------|-------------|---------|---------|
|L_01    | Checking for the basic requirement to the game, i.e., a 3X3 graph is drawn or not. This 3X3 graph is the basic need to play the game as it is like a game board for the game. |    Not input expected from the user. |  3X3 graph is drawn.  |
|L_02    |  Play proceeds with the user/computer alternately placing their marks in any unoccupied cell. Check if any player/computer finishes  with 3 marks in a row(vertical, horizontal or diagonal). |   'X' or 'O' i/p from the user/computer.      |   The user/computer won the game.      |
|L_03    |   Check if a total of 9 moves have been made( combining that of user and computer), the game ends up in a draw when neither the user nor the computer is able to get 3 marks in a row.           |  9 inputs from (user+computer).       |                The game is over.       Somebody won or the game ended as a draw. |


## Learning Resources
1. [markdownCheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)
2. [markdownBasics](https://guides.github.com/features/mastering-markdown/)
3. [git inspector](https://github.com/ejwa/gitinspector.git)
4. [github workflow](https://docs.github.com/en/actions/learn-github-action)
