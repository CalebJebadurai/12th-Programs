/**
*
*
*
*
*/
import java.awt.*;
import java.awt.Color;
class SodaGraph
    {
        SodaGraph() //Default constructor
        {
        }
        
        public static void SodaGraphMain()
        {
            int Picture;
            ///Soda Graph main
            Picture pictureObj = new Picture("IterationsGraph.png");
            World worldObj = new World();
            worldObj.setPicture(pictureObj);
            Turtle myrtleTheTurtle = new Turtle(0,0,worldObj);
            
            String cokeVotes = "0101010101";
            SodaGraphCoke(myrtleTheTurtle, (String) cokeVotes);
            SodaGraphGrape(myrtleTheTurtle);
            SodaGraphDrPeper(myrtleTheTurtle);
        }
        
        public static void SodaGraphCoke(int Turtlemyrtle,int cokeVotes)
        {
            int number = 0;
            int total = 0;
            String subData = "";
            ///Graphs the number of votes for coke soda
            myrtle.hide();
            myrtle.penUp();
            myrtle.setColor(Color.RED);
            myrtle.moveTo(160,318);
            myrtle.penDown();
            myrtle.setPenWidth(10);
            for(int votes = 0; votes <= cokeVotes.length() ; votes+=2)
            {
                subData = cokeVotes.substring(votes,votes+2);
                number = Integer.parsInt(subData);
                total+=number;
                myrtle.forward(40);
            }
        }
        
        public static void SodaGraphGrape(int Turtlemyrtle)
        {
            ///Graphs number of votes for grape soda
            myrtle.hide();
            myrtle.penUp();
            myrtle.setColor(Color.BLUE);
            myrtle.moveTo(270,318);
            myrtle.penDown();
            myrtle.setPenWidth(10);
            for(int votes = 0; votes <= 3; votes++)
            {
                myrtle.forward(40);
            }
        }
        
        public static void SodaGraphDrPeper(int Turtlemyrtle)
        {
            ///Graps number of votes for Dr.Peper
            myrtle.hide();
            myrtle.penUp();
            myrtle.setColor(Color.GREEN);
            myrtle.moveTo(390,318);
            myrtle.penDown();
            myrtle.setPenWidth(10);
            for(int votes = 0; votes <= 2; votes++)
            {
                myrtle.forward(30);
            }
        }
        
    }
    public class Iterations1
    {
        public static void main(String[] args)
        {
            SodaGraph sodaG = new SodaGraph();
            sodaG.SodaGraphMain();
        }
    }