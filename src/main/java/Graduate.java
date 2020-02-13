
import java.util.LinkedList;

/**
 *
 * @author Liwen
 */
public class Graduate extends Student {
   private String undergradMajor;
   private double undergradGPA;
   
   public String getUndergradMajor() { return undergradMajor;}
   public double getUndergradGPA() { return undergradGPA;}
   
   public Graduate(int id, String name, String email, String major, int graduatingYear, String positionType, String resume, double gpa, String password, String undergradmajor, double undergradGPA){
       super(id, name, email, major, graduatingYear, positionType, resume, gpa, password);
       this.undergradMajor = undergradMajor; this.undergradGPA = undergradGPA;
   }
   
   public Graduate(){}
}
