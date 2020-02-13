
import java.util.LinkedList;

/**
 *
 * @author Liwen
 */
public class Student {
    private int UFId;
    private String stuName;
    private String stuEmail;
    private String major;
    private int graduatingYear;
    private String positionType;
    private String resume;
    private double gpa;
    private String stuPassword;
    private LinkedList<Job> addedJobs = new LinkedList<Job>();
    private LinkedList<Interview> stuInterviews = = new LinkedList<Interview>();
    
    public int getId() { return UFId; } 
    public String getName() { return stuName; } 
    public String getEmail() { return stuEmail; }
    public String getMajor() { return major; }
    public int getGraduatingYear() { return graduatingYear; }
    public String getPositionType() { return positionType; }
    public String getResume() { return resume; }
    public String getStudentPassword() { return stuPassword; }
    public LinkedList<Job> getAddedJobs() { return addedJobs; }
    public LinkedList<Interview> getInterview() { return stuInterviews; }
    
    public void addInterview(Interview interview){
        stuInterviews.add(interview);
    }
    
    public void addJob(Job job){
        addedJobs.add(job);
    }
    
    public void removeFromJobList(Job job)
    {
        addedJobs.remove(job);
    }
    
    //public exportJobList(){}
    
    public Student(int id, String name, String email, String major, int graduatingYear, String positionType, String resume, double gpa, String password){
        this.UFId = id; this.stuName = name; this.stuEmail = email; this.major = major; this.graduatingYear = graduatingYear;
        this.positionType = positionType; this.resume = resume; this.gpa = gpa; this.stuPassword = password;
    }
    
    public Student(){}
    
}
