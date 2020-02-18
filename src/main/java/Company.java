/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joshualee
 */
import java.util.LinkedList;

public class Company 
{
    private int companyID;
    private String companyName;
    private String companyEmail;
    private String companyPassword;
    private LinkedList <Job> jobs = new LinkedList <Job>();
    private static int nextID = 1;
    
    public Company()
    {

    }
    public Company(String companyName, String companyEmail, String companyPassword)
    { 
        this.companyID = nextID;
        nextID++;
        this.companyName = companyName;
        this.companyEmail = companyEmail;
        this.companyPassword = companyPassword;
    }
    
//    public String toString()
//    {
//        String j = "[";
//        if(jobs == null)
//        {
//            j = "No jobs posted.";
//        }
//        else
//        {
//            for(int i=0; i< jobs.size();i++)
//            {
//               
//            if(i == jobs.size()-1)
//            {
//                 j += jobs.get(i).getJobID() +"]";
//            }
//            else
//            {
//                 j += jobs.get(i).getJobID() +", ";
//            }
//             }
//        }
//        
//        
//        String str = ("" + companyID + ", "+companyName + "," +companyEmail + ", "+companyPassword + "," + j);
//        return str;
//    }

    public String getJobIDs()
    {
        if(jobs.size() == 0)
        {
            return "No jobs added";
        }
        String j ="[";
        for(int i=0; i< jobs.size();i++)
            {
               
            if(i == jobs.size()-1)
            {
                 j += jobs.get(i).getJobID() +"]";
            }
            else
            {
                 j += jobs.get(i).getJobID() +", ";
            }
             }
        return j;
    }
    
  

    public static int getNextId()
    { 
        return nextID; 
    }
    public static void setNextId(int i) 
    { 
        nextID = i; 
    }
    public int getCompanyID()
    {
        return companyID;
    }
    public String getCompanyName()
    {
        return companyName;
    }        
    public String getCompanyEmail()
    {
        return companyEmail;
    }    
    public String getCompanyPassword()
    {
        return companyPassword;
    }      
    public LinkedList <Job> getJobs()
    {
        return jobs;
    }          
    public void addJobs(Job job)
    {
       jobs.add(job);
    }  
    
    public Job getJobByID(int jobID)
    {
        for (int i =0; i < jobs.size(); i++)
        {
            if(jobs.get(i).getJobID() == jobID)
            {
                return jobs.get(i);
            }
        }
        return null;
    }
}
