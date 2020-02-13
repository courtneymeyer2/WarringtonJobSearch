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
    
public Company()
{
        
}
public Company(int companyID, String companyName, String companyEmail, String companyPassword)
{ 
    this.companyID = companyID;
    this.companyName = companyName;
    this.companyEmail = companyEmail;
    this.companyPassword = companyPassword;
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
}
