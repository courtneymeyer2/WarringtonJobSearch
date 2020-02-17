/**
 *
 * @author Liwen
 */
public class Application {
    private Student student;
    private Job job;
    private String status;
    private Interview interview;
    
    public Student getStudent() {return student;}
    public Job getJob() {return job;}
    public String getStatus() {return status;} 
    public Interview getInterview(){return interview;}
    
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public void setInterview(Interview interview)
    {
        this.interview = interview;
    }
            
    public Application(Student student, Job job, String status){
        this.student = student; 
        this.job = job;
        //this.interview = interview;
        this.status = status;
    }
    
    public Application(){}
}
