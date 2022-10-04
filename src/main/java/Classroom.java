import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {

   Student[] students;
    public Classroom() {
        students = new Student[30];
    }
    public Classroom(int maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];
    }
    public Classroom(Student[] student){
        students = student;
    }

    public Student[] getStudents() {
        return students;
    }
    public double getAverageExamScore(){
        int i = 0;
        double average = 0;
        while(i < students.length){
            average += students[i].getAverageExamScore();
        }
        return average % students.length;
    }
    public void addStudent(Student student){
        List<Student> arrayList = new ArrayList<>(Arrays.asList(students));
        arrayList.add(student);
        students = arrayList.toArray(new Student[arrayList.size()]);
       }
       public void removeStudent(String firstName, String lastName){
        List<Student> arrayList = new ArrayList<>(Arrays.asList(students));
        for(int x = 0; x < students.length; x++){
            if(students[x].getFirstName().equals(firstName)  && students[x].getLastName().equals(lastName)){
                arrayList.remove(students[x]);
                students = arrayList.toArray(new Student[arrayList.size()]);
            }
        }

           }
         public Student[] getStudentsByScore(){
             Arrays.sort(students);
        return students;
      }
//      public char getGradeBook(){
//      }

       }




