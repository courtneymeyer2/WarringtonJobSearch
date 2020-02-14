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
    private static LinkedList <Student> students = new LinkedList <Student>();
    private static LinkedList <Job> jobs = new LinkedList<Job>();
    private static LinkedList <Interview> interviews = new LinkedList<Interview>();
    private static LinkedList <Company> companies = new LinkedList<Company>();
    private static LinkedList <Application> applications = new LinkedList <Application>();
    
    public static boolean checkCredentials(String email, String password, String type)
    {
        if(type.equals("student"))
        {
            for(int i = 0; i < students.size(); i++)
            {
                if(students.get(i).getEmail().equals(email) && students.get(i).getStudentPassword().equals(password))
                    {
                        return true;
                    }
            }
             return false;
        }
        else
        {
             for(int i = 0; i < companies.size(); i++)
            {
                if(companies.get(i).getCompanyEmail().equals(email)&& companies.get(i).getCompanyPassword().equals(password))
                    {
                        return true;
                    }
                }
            }
            return false;
        }
    
    public static void addNewCompany(Company company)
    {
        companies.add(company);
    }
    
    public static LinkedList <Company> getJobsFromCompany()
    {
        return companies;
    }
    
    public static void addNewJob(Job job)
    {
        jobs.add(job);
    }
    
    public static boolean checkRegistration(String email, String type)
    {
        if(type.equals("student"))
        {
            for(int i = 0; i < students.size(); i++)
            {
                if(students.get(i).getEmail().equals(email))
                {
                    return false;
                }
            }
        }
        else
        {
            for(int i =0; i <companies.size(); i++)
            {
                if(companies.get(i).getCompanyEmail().equals(email))
                {
                    return false;
                }
            }      
        }
        return true;
    }
    
//    public static Job getJobInfo(int jobID)
//    {
//        return Job;
//    }
//    
//    public static LinkedList <Undergraduate> getAppliedUndergraduates(Company company, Job job)
//    {
//        return Undergraduates;
//    }
//    
//    public static LinkedList <Graduate> getAppliedGraduates(Company company, Job job)
//    {
//        return Graduates;
//    }
//    
//    public static LinkedList <Interview> getInterviews(Student student, Job job)
//    {
//        return Interview;
//    }
//    
//    public static LinkedList <Interview> getInterviews(Job job)
//    {
//        return Interview;
//    }
//    
//    public static LinkedList <Interview> getInterviews(Student student)
//    {
//        return Interview;
//    }
//    
//    public static Student getStudentInfo(int studentID)
//    {
//        return Student;
//    }
//    
    public static boolean checkInterviewTimes(Job job, Interview interview)
    {
        return true;
    }
    
   public static boolean checkInterviewTimes(Student student, Interview interview)
    {
        return true;
    }
   
   public static void addInterview(Interview interview)
   {
       interviews.add(interview);
   }
   
   public static void removeInterview(Interview interview)
   {
       interviews.remove(interview);
   }
   
   public static void addNewStudent(Student student)
   {
       students.add(student);
   }
   
   public static LinkedList <Job> getAllJobs()
   {
       return jobs;
   }
   
   public static LinkedList <Job> filterJobs(String jobTitle, String companyName, String location, int positionType)
   {
       return jobs;
   }
  
   public static boolean appliedToJob(Student student, Job job)
   {
       return true;
   }
   
   public static boolean addedtoJobs(Student student, Job job)
   {
       return true;
   }
   
   public static void applytoJob(Application application)
   {
       applications.add(application);
   }
   public static void addJob(Job job)
   {
       jobs.add(job);
   }
   
   public static LinkedList <Interview> getAvailableInterviews(Job job)
   {
       return interviews;
   }
   
   public static void selectInterview(Student student, Interview interview)
   {
       
   }
   
   public static Student getStudentByEmail(String email)
   {
       for(int i =0; i < students.size(); i++)
       {
           if(students.get(i).getEmail().equals(email))
           {
               return students.get(i);
           }
       }
       return null;
   }
   
   public static Company getCompanyByEmail(String email)
   {
       for(int i =0; i < companies.size(); i++)
       {
           if(companies.get(i).getCompanyEmail().equals(email))
           {
               return companies.get(i);
           }
       }
       return null;
   }
   
   public static void main(String[] args)
   {
       JobSearchSystem js = new JobSearchSystem();
       Home home = new Home();
       home.setVisible(true);
   }
}
