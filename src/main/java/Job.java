
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Courtney
 */
public class Job implements Serializable{
    private int jobID;
    private static int nextID = 1;
    private String jobTitle;
    private String description;
    private String location;
    private String qualification;
    private String requirement;
    private String degreeRequired;
    private String positionType;
    private String deadline;
    private LinkedList <Interview> interviews = new LinkedList <Interview>();
    
    public String toString()
    {
        String company = JobSearchSystem.getCompanyByJob(this).getCompanyName();        
        String str = String.format("%-8d%-30s%-30s%-30s", jobID, jobTitle, company, deadline);
        return str;
    }
    
    public Job(String jobTitle, String description, String location, String qualification, String requirement, String degreeRequired, String positionType, String deadline)
    {
        
        this.jobID = nextID;
        nextID ++;
        this.jobTitle = jobTitle;
        this.description = description;
        this.location = location;
        this.qualification = qualification;
        this.requirement = requirement;
        this.degreeRequired = degreeRequired;
        this.positionType = positionType;
        this.deadline = deadline;
    }

    public Job() {}
    
    public static int getNextID()
    {
        return nextID;
    }
    public static void setNextID(int id)
    {
        nextID = id;
    }
    
     public int getJobID()
    {
        return jobID;
    }

    public String getJobTitle()
    {
        return jobTitle;
    }

    public String getDescription()
    {
        return description;
    }

    public String getLocation()
    {
        return location;
    }

    public String getQualifications()
    {
        return qualification;
    }

    public String getRequirement()
    {
        return requirement;
    }

    public String getDegreeRequired()
    {
        return degreeRequired;
    }
    
     public String getPostitonType()
    {
        return positionType;
    }
    
    public String getDeadline()
    {
        return deadline;
    }

    public LinkedList <Interview> getInterviewList()
    {
        return interviews;
    }

    public void addInterview(Interview interview)
    {
        interviews.add(interview);
    }

    public String getInterviewIDs()
    {
        if(interviews.isEmpty())
        {
            return "No interviews added";
        }
        String j ="[";
        for(int i=0; i< interviews.size();i++)
            {
               
                if(i == interviews.size()-1)
                {
                    j += interviews.get(i).getInterviewID() +"]";
                }
                else
                {
                    j += interviews.get(i).getInterviewID() +", ";
                }
            }
        
        return j;
    }

    public boolean checkTime () throws ParseException 
    {
        LocalDateTime localDateTime = LocalDateTime.now();
        Date D = new SimpleDateFormat("MM/dd/yyyy").parse(deadline);
        Calendar Cal = Calendar.getInstance();
        Cal.setTime(D);
        Cal.set(Calendar.HOUR, localDateTime.getHour());
        Cal.set(Calendar.MINUTE, localDateTime.getMinute());
        Cal.set(Calendar.SECOND, localDateTime.getSecond());
        System.out.println(Cal.getTime());
        Calendar cal2 = Calendar.getInstance();
        System.out.println(LocalDateTime.now());
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(localDateTime.getYear(), localDateTime.getMonthValue()-1, localDateTime.getDayOfMonth()+1, localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());

        if(Cal.getTime().equals(calendar.getTime()))
        {
            System.out.println("test");
            return true;
        }
        
        return false;
        }
}
