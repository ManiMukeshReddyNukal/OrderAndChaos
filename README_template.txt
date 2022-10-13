# CS611-ASSIGNMENT 1
## Tic Tac Toe and other variants
---------------------------------------------------------------------------
Mani Mukesh Reddy Nukal
nmani@bu.edu
U44103738

## Files
---------------------------------------------------------------------------
1, Main : This is the game entry point. This needs to be run. Each game runner is called from here
2, TicTacToeRunner : TicTacToeRunner is the main class to run TIK TAC TOE game where we initilize the board, set the pieces , move the pieces based on user inputs
3, OrderAndChaosRunner : OrderAndChaosRunner is the main class to run ORDER AND CHAOS game , it is extension of TicTacToeRunner. Methods which are different for order and chaos game are @override here
4, Player : Here methods related to players are stored, from initilizing the user with name, to moving players move. Movers are different for tictactoe and orderandchaos as user can select even which peace to place in Order and chaos
5, UnitCell : This is the basic building block of the board. For tic tac toe and order and chaose we can only store the peace with which it is filled with. I store a X with +1, O with -1 and empty cell with 0. If we want to color code each unit cell ( ie in the case of chess) we can add color component over here and use it color code
6, TicTacBoard : This is the combination of unit cells, the board size is based on user inputs. Logic to check across the board after every move if any result is obtained is over here. We have seperate logics here for tic tac toe and order and choas 
7, Messenger : All the methods where the message is displayed here. This will enable to make change at single place to be reflected at everywhere.



## Notes
---------------------------------------------------------------------------
1. <Files to be parsed should be stored in ConfigFiles, for parser class to
read class>
2. Tic Tac Toe tables dimension is based on user input. The min length is 3 and the max is 15.
3. For tic tac toe , the board size should be given. No default value is taken. Please enter 3 for board size if you want to play the default version

## How to compile and run
---------------------------------------------------------------------------
1. Navigate to the directory "pa1" after unzipping the files
2. Run the following instructions:
<Example below>
javac Main.java
java Main

## Input/Output Example
---------------------------------------------------------------------------
<Place here an example of how the program runs. Include both its
outputs and correctly formatted inputs. Please clearly mark the inputs.>
step 1 : Go to the src folder in the code

D:\STUDY\CS\MS\CS 611 ALGO\Game\Game\src>javac Main.java

D:\STUDY\CS\MS\CS 611 ALGO\Game\Game\src>java Main
 Welcome to Mani's Game
Please enter t/T to play TIC TAC TOE or o/O to play ORDER AND CHAOS
o
 Welcome to ORDER AND CHAOS
Please enter y/Y if you would like to play a game
y
Please enter the name of the Player1 :
mani
Please enter the name of the Player2 :
reddy
The current board configuration is the below
|------|------|------|------|------|------|
|   1   |  2   |  3   |  4   |  5   |  6  |
|------|------|------|------|------|------|
|   7   |  8   |  9  |  10  |  11  |  12  |
|------|------|------|------|------|------|
|  13  |  14  |  15  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player mani pls enter your move position between 1 to 36
1
Player mani pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  2   |  3   |  4   |  5   |  6  |
|------|------|------|------|------|------|
|   7   |  8   |  9  |  10  |  11  |  12  |
|------|------|------|------|------|------|
|  13  |  14  |  15  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player reddy pls enter your move position between 1 to 36
2
Player reddy pls enter your move piece between 'X' and 'O'
o
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  3   |  4   |  5   |  6  |
|------|------|------|------|------|------|
|   7   |  8   |  9  |  10  |  11  |  12  |
|------|------|------|------|------|------|
|  13  |  14  |  15  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player mani pls enter your move position between 1 to 36
3
Player mani pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  4   |  5   |  6  |
|------|------|------|------|------|------|
|   7   |  8   |  9  |  10  |  11  |  12  |
|------|------|------|------|------|------|
|  13  |  14  |  15  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player reddy pls enter your move position between 1 to 36
4
Player reddy pls enter your move piece between 'X' and 'O'
o
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  5   |  6  |
|------|------|------|------|------|------|
|   7   |  8   |  9  |  10  |  11  |  12  |
|------|------|------|------|------|------|
|  13  |  14  |  15  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player mani pls enter your move position between 1 to 36
5
Player mani pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  6  |
|------|------|------|------|------|------|
|   7   |  8   |  9  |  10  |  11  |  12  |
|------|------|------|------|------|------|
|  13  |  14  |  15  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player reddy pls enter your move position between 1 to 36
6
Player reddy pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   7   |  8   |  9  |  10  |  11  |  12  |
|------|------|------|------|------|------|
|  13  |  14  |  15  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player mani pls enter your move position between 1 to 36
7
Player mani pls enter your move piece between 'X' and 'O'
o
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  8   |  9  |  10  |  11  |  12  |
|------|------|------|------|------|------|
|  13  |  14  |  15  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player reddy pls enter your move position between 1 to 36
8
Player reddy pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  9  |  10  |  11  |  12  |
|------|------|------|------|------|------|
|  13  |  14  |  15  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player mani pls enter your move position between 1 to 36
9
Player mani pls enter your move piece between 'X' and 'O'
o
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O  |  10  |  11  |  12  |
|------|------|------|------|------|------|
|  13  |  14  |  15  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player reddy pls enter your move position between 1 to 36
10
Player reddy pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X  |  11  |  12  |
|------|------|------|------|------|------|
|  13  |  14  |  15  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player mani pls enter your move position between 1 to 36
11
Player mani pls enter your move piece between 'X' and 'O'
o
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O  |  12  |
|------|------|------|------|------|------|
|  13  |  14  |  15  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player reddy pls enter your move position between 1 to 36
12
Player reddy pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|  13  |  14  |  15  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player mani pls enter your move position between 1 to 36
13
Player mani pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X  |  14  |  15  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player reddy pls enter your move position between 1 to 36
14
Player reddy pls enter your move piece between 'X' and 'O'
o
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O  |  15  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player mani pls enter your move position between 1 to 36
15
Player mani pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X  |  16  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player reddy pls enter your move position between 1 to 36
16
Player reddy pls enter your move piece between 'X' and 'O'
o
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O  |  17  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player mani pls enter your move position between 1 to 36
17
Player mani pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X  |  18  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player reddy pls enter your move position between 1 to 36
18
Player reddy pls enter your move piece between 'X' and 'O'
o
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  O  |
|------|------|------|------|------|------|
|  19  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player mani pls enter your move position between 1 to 36
19
Player mani pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  O  |
|------|------|------|------|------|------|
|   X  |  20  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player reddy pls enter your move position between 1 to 36
20
Player reddy pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  O  |
|------|------|------|------|------|------|
|   X   |  X  |  21  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player mani pls enter your move position between 1 to 36
21
Player mani pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  O  |
|------|------|------|------|------|------|
|   X   |  X   |  X  |  22  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player reddy pls enter your move position between 1 to 36
22
Player reddy pls enter your move piece between 'X' and 'O'
o
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  O  |
|------|------|------|------|------|------|
|   X   |  X   |  X   |  O  |  23  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player mani pls enter your move position between 1 to 36
23
Player mani pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  O  |
|------|------|------|------|------|------|
|   X   |  X   |  X   |  O   |  X  |  24  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player reddy pls enter your move position between 1 to 36
24
Player reddy pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  O  |
|------|------|------|------|------|------|
|   X   |  X   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|  25  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player mani pls enter your move position between 1 to 36
25
Player mani pls enter your move piece between 'X' and 'O'
o
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  O  |
|------|------|------|------|------|------|
|   X   |  X   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O  |  26  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player reddy pls enter your move position between 1 to 36
26
Player reddy pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  O  |
|------|------|------|------|------|------|
|   X   |  X   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X  |  27  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player mani pls enter your move position between 1 to 36
27
Player mani pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  O  |
|------|------|------|------|------|------|
|   X   |  X   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  X  |  28  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player reddy pls enter your move position between 1 to 36
28
Player reddy pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  O  |
|------|------|------|------|------|------|
|   X   |  X   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  X   |  X  |  29  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player mani pls enter your move position between 1 to 36
29
Player mani pls enter your move piece between 'X' and 'O'
x
The current board configuration is the below
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  O  |
|------|------|------|------|------|------|
|   X   |  X   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  X   |  X   |  X  |  30  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Player reddy pls enter your move position between 1 to 36
30
Player reddy pls enter your move piece between 'X' and 'O'
x
ORDER : player mani has won
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  O   |  X   |  O   |  X  |
|------|------|------|------|------|------|
|   X   |  O   |  X   |  O   |  X   |  O  |
|------|------|------|------|------|------|
|   X   |  X   |  X   |  O   |  X   |  X  |
|------|------|------|------|------|------|
|   O   |  X   |  X   |  X   |  X   |  X  |
|------|------|------|------|------|------|
|  31  |  32  |  33  |  34  |  35  |  36  |
|------|------|------|------|------|------|
Do you want to play another round
Press y/Y to play a another round
n
player 1 : mani has won 1 games and player 2 : reddy has won 0 games
 Terminating :  Game ended