
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
public class Interview 
{
    private int interviewID;
    private Date date;
    private double duration;
    private String feedback;
    private int studentID;
    private String status;
    private boolean selected;
    
public Interview()
{
        
}
public Interview(int interviewID, Date date, double duration, String feedback, int studentID, String status)
{ 
    this.interviewID = interviewID;
    this.date = date;
    this.duration = duration;
    this.feedback = feedback;
    this.studentID = studentID;
    this.status = status;
}
public void setFeeback(String feedback)
{
   this.feedback = feedback;
}
public void setStatus(String status)
{
   this.status = status;
}
public void setSelected(boolean selected)
{
   this.selected = selected;
}
public String getStatus()
{
    return status;
}
public String getFeedback()
{
    return feedback;
}  
public int getInterviewID()
{
    return interviewID;
}
public Date getDate()
{
    return date;
}
public double getDuration()
{
    return duration;
}
public boolean getSelected()
{
    return selected;
}
}
