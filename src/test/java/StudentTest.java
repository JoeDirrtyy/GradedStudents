import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void testGetStudent(){
       ArrayList arrayList = new ArrayList<Double>();
        Student student = new Student("joe", "markowski", arrayList );
        Assert.assertEquals(student.getFirstName(),"joe");
    }

}
