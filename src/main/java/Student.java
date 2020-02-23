
import java.io.File;
import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Liwen
 */
public class Student implements Serializable{
    private int UFId;
    protected String stuName;
    private String stuEmail;
    private String major;
    private int graduatingYear;
    private String positionType;
    private File resume;
    protected double gpa;
    private String stuPassword;
    private LinkedList<Job> addedJobs = new LinkedList<Job>();
    
    public int getId() { return UFId; } 
    public String getName() { return stuName; } 
    public String getEmail() { return stuEmail; }
    public String getMajor() { return major; }
    public int getGraduatingYear() { return graduatingYear; }
    public String getPositionType() { return positionType; }
    public File getResume() { return resume; }
    public double getGPA(){return gpa; }
    public String getStudentPassword() { return stuPassword; }
    public LinkedList<Job> getAddedJobs() { return addedJobs; }

    public void setResume(File f) 
    {
        resume = f;
    }
    
    public void addJob(Job job){
        addedJobs.add(job);
    }
    
    public boolean jobInList(Job job)
    {
        for(int i = 0; i < addedJobs.size(); i++)
        {
            if(addedJobs.get(i).equals(job))
            {
                return true;
            }
        }
        return false;
    }
    
    public void removeFromJobList(Job job)
    {
        addedJobs.remove(job);
    }
    
    
    public String getJobIDs()
    {
       // System.out.println("addedjobs" + addedJobs.size());
        if(addedJobs.size() == 0)
        {
            return "No jobs added";
        }
        String j ="[";
        for(int i=0; i< addedJobs.size();i++)
            {
               
            if(i == addedJobs.size()-1)
            {
                 j += addedJobs.get(i).getJobID() +"]";
            }
            else
            {
                 j += addedJobs.get(i).getJobID() +", ";
            }
             }
        return j;
    }
 
    public Student(int id, String name, String email, String major, int graduatingYear, String positionType, File resume, double gpa, String password){
        this.UFId = id; this.stuName = name; this.stuEmail = email; this.major = major; this.graduatingYear = graduatingYear;
        this.positionType = positionType; this.resume = resume; this.gpa = gpa; this.stuPassword = password;
    }
    
    public Student(){}
    
    }
    

