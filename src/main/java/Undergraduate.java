
import java.io.File;
/**
 *
 * @author Liwen
 */
public class Undergraduate extends Student {
    
    public Undergraduate(int id, String name, String email, String major, int graduatingYear, String positionType, File resume, double gpa, String password)
    {
       super(id, name, email, major, graduatingYear, positionType, resume, gpa, password);
       
   }
    
    public Undergraduate(){}
}
