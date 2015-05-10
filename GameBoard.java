package BattleShip;

import java.awt.*;
import acm.graphics.*;


public class GameBoard extends GCompound 
{

//Variables Declaration

int x, y, i, j, BoardLetters_Y, BoardNumbers_X;	
GRect cell;
GLabel BoardLettersLabel, BoardNumbersLabel;

//Constants Declaration

static final int CELL_WIDTH = 25, N_ROWS = 10, N_COLUMNS = N_ROWS;
static final String[] BoardLetters = {"A ","B ","C ","D ","E ","F ","G ","H ","I ","J "};
static final String[] BoardNumbers = {"1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 "};

public GameBoard(int x,int y)
{
 
this.BoardLetters_Y= y - 3;
this.BoardNumbers_X= x - 18;

    for (i=0; i<N_ROWS; i++)
    {
        for(j=0; j<N_COLUMNS; j++)
        {
	    renderUnit(x, y);
	    displayGrid(x, y, i, j);
	    x += CELL_WIDTH;

        }

    x -= CELL_WIDTH * 10;
    y += CELL_WIDTH;
	
    }

}


public void renderUnit(int x, int y)
{
    cell=new GRect(x, y, CELL_WIDTH, CELL_WIDTH);

    cell.setFilled(true);
    cell.setFillColor(Color.cyan);

    add(cell);
}

public void displayGrid(int x, int y, int i, int j)
{

    BoardLettersLabel=new GLabel(BoardLetters[j]);
    BoardNumbersLabel=new GLabel(BoardNumbers[i]);

    add(BoardLettersLabel, x + (CELL_WIDTH - BoardLettersLabel.getWidth())/2, BoardLetters_Y);
    add(BoardNumbersLabel, BoardNumbers_X, y + CELL_WIDTH - BoardNumbersLabel.getHeight()/2);		

}

}
