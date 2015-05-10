package BattleShip;

import javax.swing.*;

import java.awt.*;
import java.awt.color.*;

import acm.graphics.*;
import acm.gui.TableLayout;


public class GameWindow extends JFrame 
{

// Variables declaration

JFrame MainFrame;
JButton btn1, btn2, btn3, btn4, btn5, btn6;
JPanel MainPanel, Panel1, Panel2, Panel2North, Panel2East, Panel2West, Panel2South, Panel3, Panel4, Panel5;
JTextField TargetField;
JLabel TargetLabel;
GameBoard EnemyBoard, UserBoard;
Color Panel2Color;
ImageIcon icon1, icon2;
GCanvas MainCanvas;

//Constructors

public GameWindow()
{   

    createFrames();	
    createLabels();
    createTextFields();
    createButtons(); 
    createPanels();
    createCanvas();
    addToCanvas();
    addToPanels();
    MainFrame.add(MainPanel);
    MainFrame.setVisible(true);

}

//Classe Methods

public void createTextFields()
{
    TargetField=new JTextField(3);
}

public void createLabels()
{
    TargetLabel=new JLabel("Choose a Target: ");
}

public void createButtons()
{

    btn1=new JButton("Destroyer");
    btn2=new JButton("Submarine");
    btn3=new JButton("Cruiser");
    btn4=new JButton("Battleship");
    btn5=new JButton("Carrier");
    btn6=new JButton("Clear");

    icon1=new ImageIcon("Battleship_icon.gif");
    icon2=new ImageIcon("Destroyer_icon.gif");

    btn1.setIcon(icon1);
    btn2.setIcon(icon2);

    btn1.setPreferredSize(new Dimension(200,42));
    btn2.setPreferredSize(new Dimension(200,42));
    btn3.setPreferredSize(new Dimension(200,42));
    btn4.setPreferredSize(new Dimension(200,42));
    btn5.setPreferredSize(new Dimension(200,42));
    btn6.setPreferredSize(new Dimension(200,42));

}

public void createPanels()
{

    MainPanel=new JPanel();

    MainCanvas=new GCanvas();

    Panel1=new JPanel();
    Panel2=new JPanel();
    Panel3=new JPanel();
    Panel4=new JPanel();
    Panel5=new JPanel();

    Panel2North=new JPanel();
    Panel2East=new JPanel();
    Panel2West=new JPanel();
    Panel2South=new JPanel();

    Panel2Color=new Color(138,43,226);

    MainPanel.setPreferredSize(new Dimension(720,565));
    MainPanel.setMinimumSize(new Dimension(720,565));
    MainPanel.setMaximumSize(new Dimension(720,565));
    MainPanel.setLayout(new BoxLayout(MainPanel,BoxLayout.Y_AXIS));

    Panel1.setBorder(BorderFactory.createEtchedBorder());
    Panel1.setLayout( new FlowLayout());
    Panel1.setPreferredSize(new Dimension(660,35));
    Panel1.setMinimumSize(new Dimension(660,35));
    Panel1.setMaximumSize(new Dimension(660,35));

    Panel2.setBorder(BorderFactory.createEtchedBorder());
    Panel2.setBackground(Panel2Color);
    Panel2.setLayout(new BorderLayout());
    Panel2.setPreferredSize(new Dimension(660,330));
    Panel2.setMinimumSize(new Dimension(660,330));
    Panel2.setMaximumSize(new Dimension(660,330));

    Panel3.setBorder(BorderFactory.createEtchedBorder());
    Panel3.setBackground(Panel2Color);
    Panel3.setPreferredSize(new Dimension(660,30));
    Panel3.setMinimumSize(new Dimension(660,30));
    Panel3.setMaximumSize(new Dimension(660,30));

    Panel4.setBorder(BorderFactory.createEtchedBorder());
    Panel4.setBackground(Panel2Color);
    Panel4.setPreferredSize(new Dimension(660,30));
    Panel4.setMinimumSize(new Dimension(660,30));
    Panel4.setMaximumSize(new Dimension(660,30));

    Panel5.setBorder(BorderFactory.createEtchedBorder());
    Panel5.setBackground(Color.BLACK);
    Panel5.setPreferredSize(new Dimension(660,110));
    Panel5.setMinimumSize(new Dimension(660,110));
    Panel5.setMaximumSize(new Dimension(660,110));
    Panel5.setLayout(new TableLayout(2,3,5,5));

    MainCanvas.setPreferredSize(new Dimension(620,300));
    MainCanvas.setMinimumSize(new Dimension(620,300));
    MainCanvas.setMaximumSize(new Dimension(620,300));

    Panel2East.setBackground(Panel2Color);
    Panel2East.setPreferredSize(new Dimension(20,330));
    Panel2East.setMinimumSize(new Dimension(20,330));
    Panel2East.setMaximumSize(new Dimension(20,330));

    Panel2West.setBackground(Panel2Color);
    Panel2West.setPreferredSize(new Dimension(20,330));
    Panel2West.setMinimumSize(new Dimension(20,330));
    Panel2West.setMaximumSize(new Dimension(20,330));

    Panel2North.setBackground(Panel2Color);
    Panel2North.setPreferredSize(new Dimension(330,20));
    Panel2North.setMinimumSize(new Dimension(330,20));
    Panel2North.setMaximumSize(new Dimension(330,20));

    Panel2South.setBackground(Panel2Color);
    Panel2South.setPreferredSize(new Dimension(330,20));
    Panel2South.setMinimumSize(new Dimension(330,20));
    Panel2South.setMaximumSize(new Dimension(330,20));

}

public void addToPanels()
{
	
    Panel1.add(TargetLabel);
    Panel1.add(TargetField);

    Panel2.add(Panel2North,BorderLayout.NORTH);
    Panel2.add(Panel2South,BorderLayout.SOUTH);
    Panel2.add(Panel2East,BorderLayout.EAST);
    Panel2.add(Panel2West,BorderLayout.WEST);
    Panel2.add(MainCanvas,BorderLayout.CENTER);

    Panel5.add(btn1);
    Panel5.add(btn2);
    Panel5.add(btn3);
    Panel5.add(btn4);
    Panel5.add(btn5);
    Panel5.add(btn6);

    MainPanel.add(Panel1);
    MainPanel.add(Panel2);
    MainPanel.add(Panel3);
    MainPanel.add(Panel4);
    MainPanel.add(Panel5);

}

public void createCanvas(){

    MainCanvas=new GCanvas();
    EnemyBoard=new GameBoard(30,20);
    UserBoard=new GameBoard(20+250+60,20);

}

public void addToCanvas(){
	
    MainCanvas.add(EnemyBoard);
    MainCanvas.add(UserBoard);
	
}

public void createFrames(){

    MainFrame=new JFrame();

    MainFrame.setTitle("BattleShip");
    MainFrame.setSize(660,525);
    MainFrame.setPreferredSize(new Dimension(660,565));
    MainFrame.setMinimumSize(new Dimension(660,565));
    MainFrame.setMaximumSize(new Dimension(660,565));

}

}
