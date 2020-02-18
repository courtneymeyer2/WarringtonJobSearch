/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Courtney
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class JobSearchSystem {
    private static LinkedList <Student> students = new LinkedList <Student>();
    //private static LinkedList <Job> jobs = new LinkedList<Job>();
    //private static LinkedList <Interview> interviews = new LinkedList<Interview>();
    private static LinkedList <Company> companies = new LinkedList<Company>();
    private static LinkedList <Application> applications = new LinkedList <Application>();
    
    
    public static Company getCompanyByJob(Job job)
    {
        for(int i = 0; i < companies.size(); i++)
        {
            for(int j =0; j < companies.get(i).getJobs().size(); j++)
            {
                if(companies.get(i).getJobs().get(j).equals(job))
                {
                    return companies.get(i);
                }
            }
        }
        return null;
    }

    
    
    
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
    
    public static LinkedList <Application> getApplicants(Job job)
    {
        LinkedList <Application> applicants = new LinkedList();
       for(int i =0; i < applications.size(); i++)
       {
           if(applications.get(i).getJob().equals(job))
           {
               applicants.add(applications.get(i));
           }
       }
       return applicants;
    }
    
       public static LinkedList <Application> getApplicants(Student student)
    {
        LinkedList <Application> applicants = new LinkedList();
       for(int i =0; i < applications.size(); i++)
       {
           if(applications.get(i).getStudent().equals(student))
           {
               applicants.add(applications.get(i));
           }
       }
       return applicants;
    }
    
    public static int statusIndex(Application applicant)
    {
        if(applicant.getStatus().equals("Pending"))
        {
            return 2;
        }
        else if(applicant.getStatus().equals("Interview Requested"))
        {
            return 0;
        }
        else if(applicant.getStatus().equals("Rejected"))
        {
            return 1;
        }
        else 
        {
            return 3;
        }
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
    public static LinkedList<Student> getStudent()
    {
        return students;
    }
    
    public static LinkedList<Application> getApplication()
    {
        return applications;
    }
    
    public static LinkedList<Company> getCompany()
    {
        return companies;
    }
    
//    public static LinkedList<Interview> getInterview()
//    {
//        return interviews;
//    }
    
    public static boolean applicationExists(Job job, Student student)
    {
        for(int i = 0; i < applications.size(); i++)
        {
            if(applications.get(i).getJob().equals(job) && applications.get(i).getStudent().equals(student))
            {
                return true;
            }
        }
        return false;
    }
//    
    public static boolean checkInterviewTimes(Job job, Interview interview) throws ParseException
    {
        String date;
        int duration;
        String interviewDate = interview.getDate();
       // System.out.println("interviewDate" +interviewDate);
        int interviewDuration = interview.getDuration();
        //System.out.println("interviewDuration" +interviewDuration);
        Date interviewD = new SimpleDateFormat("MM/dd/yyyy hh.mm aa").parse(interviewDate);
        Calendar interviewCal = Calendar.getInstance();
        interviewCal.setTime(interviewD);
        //System.out.println("interviewCal" +interviewCal.getTime());
        Calendar interviewCal2 = Calendar.getInstance();
        interviewCal2.setTime(interviewD);
        interviewCal2.add(Calendar.MINUTE, interviewDuration);
        //System.out.println("interviewCal2" +interviewCal2.getTime());
        
        LinkedList <Interview> inters = new LinkedList <Interview>();
        //System.out.println(job.getInterviewList().size());
        for(int i = 0 ; i < job.getInterviewList().size(); i++)
        {
            duration = job.getInterviewList().get(i).getDuration();
            //System.out.println("duration" +duration);
            date = job.getInterviewList().get(i).getDate();
            //System.out.println("date" +date);
            Date date1 = new SimpleDateFormat("MM/dd/yyyy hh.mm aa").parse(date); 
            Calendar cal = Calendar.getInstance();
            cal.setTime(date1);
            //System.out.println("cal" +cal.getTime());
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(date1);
            cal2.add(Calendar.MINUTE, duration);
            //System.out.println("cal2" +cal2.getTime());
            
           
            if(interviewCal.before(cal) && interviewCal2.after(cal))
            {
                                System.out.println("1");

                return false;
                    
            }
            
            else if(interviewCal.after(cal) && interviewCal.before(cal2))
            {
                                //System.out.println("2");

                return false;
            }
            
           
            else if(interviewCal.equals(cal))
            {
                                //System.out.println("4");

                return false;
            }  
        }      
                        //System.out.println("5");

        return true;
    }
    
    public static boolean checkInterviewTimes(Student student, Interview interview) throws ParseException
    {
        LinkedList <Application> applications = new LinkedList <Application>();
        applications = getApplicants(student);
        String date;
        int duration;
        String interviewDate = interview.getDate();
       // System.out.println("interviewDate" +interviewDate);
        int interviewDuration = interview.getDuration();
        //System.out.println("interviewDuration" +interviewDuration);
        Date interviewD = new SimpleDateFormat("MM/dd/yyyy hh.mm aa").parse(interviewDate);
        Calendar interviewCal = Calendar.getInstance();
        interviewCal.setTime(interviewD);
        //System.out.println("interviewCal" +interviewCal.getTime());
        Calendar interviewCal2 = Calendar.getInstance();
        interviewCal2.setTime(interviewD);
        interviewCal2.add(Calendar.MINUTE, interviewDuration);
        //System.out.println("interviewCal2" +interviewCal2.getTime());
        
        LinkedList <Interview> inters = new LinkedList <Interview>();
        //System.out.println(job.getInterviewList().size());
        for(int j = 0; j < applications.size(); j++)
        {
             if(applications.get(j).getInterview() == null)
             {
                 
             }
             else
             {
                    duration = applications.get(j).getInterview().getDuration();
                    //System.out.println("duration" +duration);
                    date = applications.get(j).getInterview().getDate();
                    //System.out.println("date" +date);
                    Date date1 = new SimpleDateFormat("MM/dd/yyyy hh.mm aa").parse(date); 
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(date1);
                    //System.out.println("cal" +cal.getTime());
                    Calendar cal2 = Calendar.getInstance();
                    cal2.setTime(date1);
                    cal2.add(Calendar.MINUTE, duration);
                    //System.out.println("cal2" +cal2.getTime());


                    if(interviewCal.before(cal) && interviewCal2.after(cal))
                    {
                                        //System.out.println("1");

                        return false;

                    }

                    else if(interviewCal.after(cal) && interviewCal.before(cal2))
                    {
                                        //System.out.println("2");

                        return false;
                    }


                    else if(interviewCal.equals(cal))
                    {
                                        //System.out.println("4");

                        return false;
                    }  
        
             }
                    
        }
         
                        //System.out.println("5");

        return true;
        
    }
   
//    public static void addInterview(Interview interview)
//    {
//        interviews.add(interview);
//    }
//   
//    public static void removeInterview(Interview interview)
//    {
//        interviews.remove(interview);
//    }
   
    public static void addNewStudent(Student student)
    {
        students.add(student);
    }
   
    public static LinkedList <Job> getAllJobs()
    {
        LinkedList<Job> j = new LinkedList<> ();
        for(int i = 0; i < companies.size(); i++){
            for (int n = 0; n < companies.get(i).getJobs().size(); n++){
            j.add(companies.get(i).getJobs().get(n));
            }
        }
        return j;
    }
   
    public static LinkedList <Job> filterJobs(String jobTitle, String companyName, String location, String positionType, Student student)
    {
        LinkedList<Job> j = new LinkedList<>();
        LinkedList<Job> allJobs = getAllJobs();
        LinkedList<Job> jobs = new LinkedList<>();
        
        if(student instanceof Undergraduate)
        {
            for (int i=0; i < allJobs.size(); i++)
            {
                if (allJobs.get(i).getDegreeRequired().equals("Undergraduate") || allJobs.get(i).getDegreeRequired().equals("Both Undergraduate and Graduate"))
                    jobs.add(allJobs.get(i));
            }               
        } 
        else
        {
            for (int i=0; i < allJobs.size(); i++)
            {
                if (allJobs.get(i).getDegreeRequired().equals("Graduate") || allJobs.get(i).getDegreeRequired().equals("Both Undergraduate and Graduate"))
                    jobs.add(allJobs.get(i));
            }
        }
               
        for(int i=0; i < jobs.size(); i++)
        {
            Boolean b1 = (jobs.get(i).getJobTitle().equals(jobTitle))|| (jobTitle.equals( " "));
            Boolean b2 = (getCompanyByJob(jobs.get(i)).getCompanyName().equals(companyName))||(companyName.equals( " "));
            Boolean b3 = (jobs.get(i).getLocation().equals(location))||( location.equals( " "));
            Boolean b4 = jobs.get(i).getPostitonType().equals(positionType);
            if(b1 && b2 && b3 && b4)
                j.add(jobs.get(i));
            
        }
        return j;
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
       
        if(application.getStudent().getAddedJobs().contains(application.getJob()))
        {
            application.getStudent().removeFromJobList(application.getJob());
           
        }
    }
    

    public static LinkedList <Interview> getAvailableInterviews(Job job)
    {
       
        LinkedList <Interview> interviews = new LinkedList <Interview>();
        for(int i = 0; i < job.getInterviewList().size(); i++)
        {
            if(job.getInterviewList().get(i).getSelected())
            {
               
            }
            else
            {
                interviews.add(job.getInterviewList().get(i));
            }
        }
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
   
    public static Company getCompanyById(int id)
    {
        for(int i =0; i < companies.size(); i++)
        {
            if(companies.get(i).getCompanyID()==id)
            {
                return companies.get(i);
            }
        }
        return null;
    }
    
        public static Student getStudentById(int id)
    {
        for(int i =0; i < students.size(); i++)
        {
            if(students.get(i).getId()==id)
            {
                return students.get(i);
            }
        }
        return null;
    }
        
      public static Job getJobById(int id)
    {
        for(int j = 0; j < companies.size(); j++)
        {
            for(int k =0; k < companies.get(j).getJobs().size(); k++)
            {
                if(companies.get(j).getJobs().get(k).getJobID() == id)
                {
                    return companies.get(j).getJobs().get(k);
                }
            }
        }
       return null;
    }
      
      public static Application getApplication(Student student, Job job)
      {
          for (int i = 0; i < applications.size(); i++)
          {
              if(applications.get(i).getStudent().equals(student) && applications.get(i).getJob().equals(job))
              {
                  return applications.get(i);
              }
          }
          return null;
      }
         public static Interview getInterviewById(int id)
    {
        for(int j = 0; j < companies.size(); j++)
        {
            for(int k =0; k < companies.get(j).getJobs().size(); k++)
            {
                for(int f = 0; f < companies.get(j).getJobs().get(k).getInterviewList().size(); f++)
                {
                    if(companies.get(j).getJobs().get(k).getInterviewList().get(f).getInterviewID() == id)
                    {
                        return companies.get(j).getJobs().get(k).getInterviewList().get(f);
                    }
                }
                
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
