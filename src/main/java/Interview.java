
import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joshualee
 */
    public class Interview implements Serializable
    {
        private int interviewID;
        private String date;
        private int duration;
        private String feedback = "";
        private boolean selected = false;
        private static int nextID = 1;

    public Interview() {}
 
    public Interview(String date, int duration)
    { 
        this.interviewID = nextID;
        nextID ++;
        this.date = date;
        this.duration = duration;
    }
    public void setFeeback(String feedback)
    {
       this.feedback = feedback;
    }

    public void setSelected(boolean selected)
    {
       this.selected = selected;
    }

    public String getFeedback()
    {
        return feedback;
    }  
    public int getInterviewID()
    {
        return interviewID;
    }
    public String getDate()
    {
        return date;
    }
    public int getDuration()
    {
        return duration;
    }
    public boolean getSelected()
    {
        return selected;
    }
    public static int getNextID()
    {
        return nextID;
    }
    public static void setNextID(int id)
    {
        nextID = id;
    }
}
