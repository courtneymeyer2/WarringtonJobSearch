
import java.io.File;

/**
 *
 * @author Liwen
 */
public class Graduate extends Student implements iRecommend{
   private String undergradmajor;
   private double undergradGPA;
   
   public String getUndergradMajor() { return undergradmajor;}
   public double getUndergradGPA() { return undergradGPA;}
   
   public Graduate(int id, String name, String email, String major, int graduatingYear, String positionType, File resume, double gpa, String password, String undergradmajor, double undergradGPA)
   {
       super(id, name, email, major, graduatingYear, positionType, resume, gpa, password);
       this.undergradmajor = undergradmajor; 
       this.undergradGPA = undergradGPA;
   }
   
   public Graduate(){}
   
   public String getRecommendation(){
        String str = "";
        if((gpa >= 3.9)&&(undergradGPA >= 3.9))
            str = stuName + " is a graduated student with GPA more than 3.9. We recommend " + stuName + " to you!";
        return str;
   }
}
