
import java.io.Serializable;

/**
 *
 * @author Liwen
 */
public class Application implements Serializable{
    private int ID;
    private Student student;
    private Job job;
    private String status;
    private Interview interview;
    private static int nextID = 1;
    
    public Student getStudent() {return student;}
    public Job getJob() {return job;}
    public String getStatus() {return status;} 
    public Interview getInterview(){return interview;}
    public static int getNextID() {return nextID;}
    
//    @Override
//    public String toString()
//    {
//        String str = String.format("%-8d, %-8d, %-20s", student.getId(), job.getJobID(), status);
//        return str;
//    }
    public static void setNextID(int id)
    {
        nextID = id;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public void setInterview(Interview interview)
    {
        this.interview = interview;
    }
            
    public Application(Student student, Job job, String status)
    {
        this.student = student; 
        this.job = job;
        //this.interview = interview;
        this.status = status;
        this.ID = nextID;
        nextID++;
    }
    
    public Application(){}
}
