
import java.io.File;
import java.util.LinkedList;

/**
 *
 * @author Liwen
 */
public class Graduate extends Student {
   private String undergradmajor;
   private double undergradGPA;
   
   public String getUndergradMajor() { return undergradmajor;}
   public double getUndergradGPA() { return undergradGPA;}
   
   public Graduate(int id, String name, String email, String major, int graduatingYear, String positionType, File resume, double gpa, String password, String undergradmajor, double undergradGPA){
       super(id, name, email, major, graduatingYear, positionType, resume, gpa, password);
       this.undergradmajor = undergradmajor; 
       this.undergradGPA = undergradGPA;
   }
   
   public Graduate(){}
}
