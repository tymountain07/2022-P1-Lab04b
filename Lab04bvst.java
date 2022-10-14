// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawLine(125,50,225,50);
        g.drawLine(175,100,125,50);
        g.drawLine(225,50,275,100);
        g.drawLine(175,100,275,100);
        g.drawLine(125,150,225,150);
        g.drawLine(175,200,275,200);
        g.drawLine(125,150,175,200);
        g.drawLine(225,150,275,200);
        g.drawLine(125,150,125,50);
        g.drawLine(225,50,225,150);
        g.drawLine(175,200,175,100);
        g.drawLine(275,100,275,200);


        // DRAW SPHERE
        g.drawOval(550,100,200,200);
        g.drawOval(550,150, 200,100);
        g.drawOval(550,175,200,50);
        g.drawOval(550,125,200,150);
        g.drawOval(600,100,100,200);
        g.drawOval(625,100,50,200);
        g.drawOval(575,100,150,200);



        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(174,375,75,75);
        g.drawLine(250,485,125,400);
        g.drawLine(125,400,250,360);
        g.drawLine(250,485,250,360);
        g.drawOval(123,335,151,173);



        // DRAW APCS
        g.fillRect(450,550,30,15);
        g.fillRect(450,550,15,75);
        g.fillRect(480,550,15,75);
        g.fillRect(450,580,30,15);
        g.fillRect(510,550,30,15);
        g.fillRect(540,550,15,45);
        g.fillRect(510,550,15,75);
        g.fillRect(510,580,45,15);
        g.fillRect(570,550,45,15);
        g.fillRect(570,550,15,75);
        g.fillRect(570,610,45,15);
        g.fillRect(630,550,45,15);
        g.fillRect(630,565,15,30);
        g.fillRect(630,580,45,15);
        g.fillRect(660,580,15,45);
        g.fillRect(630,610,45,15);

        // DRAW PACMAN FLOWER
        g.fillArc(700,425,50,50,45,270);
        g.fillArc(630,425,50,50,135,-270);
        g.fillArc(665,395,50,50,45,-270);
        g.fillArc(665,455,50,50,-45,270);


    }

}


