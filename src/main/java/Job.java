
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
    private int companyID;
    private String jobTitle;
    private String description;
    private String location;
    private String qualification;
    private String requirement;
    private String degreeRequired;
    private String positionType;
    private Date deadline;
    private LinkedList <Interview> interviews = new LinkedList <Interview>();
    private LinkedList <Student> appliedStudents= new LinkedList <Student>();
    private LinkedList <Student> selectedStudents = new LinkedList <Student>();
    
    
    public Job(int companyID, String jobTitle, String description, String location, String qualification, String requirement, String degreeRequired, String positionType, Date deadline)
    {
        
        this.jobID = nextID;
        nextID ++;
        this.companyID = companyID;
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

    public int getCompanyID()
    {
        return companyID;
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
    
    public Date getDeadline()
    {
        return deadline;
    }

    public LinkedList <Interview> getInterviewList()
    {
        return interviews;
    }

    public LinkedList <Student> getAppliedStudents()
    {
        return appliedStudents;
    }

    public LinkedList <Student> getSelectedStudents()
    {
        return selectedStudents;
    }

    public void addAppliedStudent(Student student)
    {
        appliedStudents.add(student);
    }

    public void addInterview(Interview interview)
    {
        interviews.add(interview);
    }


}
