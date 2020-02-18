
import java.text.DateFormat;
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
public class Job {
    private int jobID;
    private static int nextID = 1;
    //private int companyID;
    private String jobTitle;
    private String description;
    private String location;
    private String qualification;
    private String requirement;
    private String degreeRequired;
    private String positionType;
    private String deadline;
    private LinkedList <Interview> interviews = new LinkedList <Interview>();
    //private LinkedList <Student> appliedStudents= new LinkedList <Student>();
    //private LinkedList <Student> selectedStudents = new LinkedList <Student>();
    
//    public String toString()
//    {
//        String applicants = "";
//        for(int i=0; i < JobSearchSystem.getApplication().size(); i++)
//        {
//            if(JobSearchSystem.getApplication().get(i).getJob().getJobID() == jobID)
//            {
//                applicants += JobSearchSystem.getApplication().get(i).getStudent().getId();
//            }
//        }
//        if (applicants.equals(""))
//        {
//            applicants = "No applicants";
//        }
//        
//        String company = JobSearchSystem.getCompanyById(companyID).getCompanyName();
//        
//        String str = String.format("%-8d,%-20s, %-20s, %-20s", jobID, jobTitle, company, applicants);
//        return str;
//    }
    
    public Job(String jobTitle, String description, String location, String qualification, String requirement, String degreeRequired, String positionType, String deadline)
    {
        
        this.jobID = nextID;
        nextID ++;
        //this.companyID = companyID;
        this.jobTitle = jobTitle;
        this.description = description;
        this.location = location;
        this.qualification = qualification;
        this.requirement = requirement;
        this.degreeRequired = degreeRequired;
        this.positionType = positionType;
        this.deadline = deadline;
    }

    public Job()
    {

    }
    public int getNextID()
    {
        return nextID;
    }
    
     public int getJobID()
    {
        return jobID;
    }
    public void setNextID()
    {
        this.nextID = nextID;
    }

//    public int getCompanyID()
//    {
//        return companyID;
//    }

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

//    public LinkedList <Student> getAppliedStudents()
//    {
//        return appliedStudents;
//    }
//
//    public LinkedList <Student> getSelectedStudents()
//    {
//        return selectedStudents;
//    }
//
//    public void addAppliedStudent(Student student)
//    {
//        appliedStudents.add(student);
//    }

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

}
