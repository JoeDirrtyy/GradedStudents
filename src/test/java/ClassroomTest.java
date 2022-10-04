import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ClassroomTest {

    @Test
    public void testGetStudent(){
        //given
        ArrayList arrayList = new ArrayList<Double>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Student student1 = new Student("joe", "markowski", arrayList);
        Student student2 = new Student("zack", "rivera",arrayList);
        Student student3 = new Student("matt", "vied",arrayList);
        Student[] students = new Student[]{student1,student2,student3};

        Classroom classroom = new Classroom(students);
        //When

        Student[] student = classroom.getStudents();

        //Then
        Student[] test = new Student[3];
        Assert.assertEquals(student, test );
    }
}
