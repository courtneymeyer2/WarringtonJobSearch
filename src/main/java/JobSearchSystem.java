/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Courtney
 */
import java.util.*;
public class JobSearchSystem {
    LinkedList <Student> students = new LinkedList <Student>();
    LinkedList <Job> jobs = new LinkedList<Job>();
    LinkedList <Interview> interviews = new LinkedList<Interview>();
    LinkedList <Company> companies = new LinkedList<Company>();
    LinkedList <Application> applications = new LinkedList <Application>;
    
    public boolean checkCredentials(String email, String password, int type)
    {
        return true;
    }
    
    public void addNewCompany(Company company)
    {
        companies.add(company);
    }
    
    public LinkedList <Company> getJobsFromCompany()
    {
        return companies;
    }
    
    public void addNewJob(Job job)
    {
        jobs.add(job);
    }
    
    public Job getJobInfo(int jobID)
    {
        return Job;
    }
    
    public LinkedList <Undergraduate> getAppliedUndergraduates(Company company, Job job)
    {
        return Undergraduates;
    }
    
    public LinkedList <Graduate> getAppliedGraduates(Company company, Job job)
    {
        return Graduates;
    }
    
    public LinkedList <Interview> getInterviews(Student student, Job job)
    {
        return Interview;
    }
    
    public LinkedList <Interview> getInterviews(Job job)
    {
        return Interview;
    }
    
    public LinkedList <Interview> getInterviews(Student student)
    {
        return Interview;
    }
    
    public Student getStudentInfo(int studentID)
    {
        return Student;
    }
    
    public boolean checkInterviewTimes(Job job, Interview interview)
    {
        return true;
    }
    
   public boolean checkInterviewTimes(Student student, Interview interview)
    {
        return true;
    }
   
   public void addInterview(Interview interview)
   {
       interviews.add(interview);
   }
   
   public void removeInterview(Interview interview)
   {
       interviews.remove(interview);
   }
   
   public void addNewStudent(Student student)
   {
       students.add(student);
   }
   
   public LinkedList <Job> getAllJobs()
   {
       return jobs;
   }
   
   public LinkedList <Job> filterJobs(String jobTitle, String companyName, String location, int positionType)
   {
       return jobs;
   }
  
   public boolean appliedToJob(Student student, Job job)
   {
       return true;
   }
   
   public boolean addedtoJobs(Student student, Job job)
   {
       return true;
   }
   
   public void applytoJob(Application application)
   {
       applications.add(application);
   }
   public void addJob(Job job)
   {
       jobs.add(job);
   }
   
   public LinkedList <Interview> getAvailableInterviews(Job job)
   {
       return interviews;
   }
   
   public void selectInterview(Student student, Interview interview)
   {
       
   }
   
   
   
    
    
    
    
}
