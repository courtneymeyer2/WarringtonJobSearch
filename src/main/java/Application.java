/**
 *
 * @author Liwen
 */
public class Application {
    private Student student;
    private Job job;
    private String status;
    
    public Student getStudent() {return student;}
    public Job getJob() {return job;}
    public String getStatus() {return status;} 
    
    public void setStatus(String status){
        this.status = status;
    }
            
    public Application(Student student, Job job){
        this.student = student; this.job = job;
    }
    
}
