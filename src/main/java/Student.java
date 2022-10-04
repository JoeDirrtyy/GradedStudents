import java.util.ArrayList;

public class Student extends Classroom {

    private String firstName;
    private String lastName;
    ArrayList<Double> examScores;
    private int numberOfExamsTaken;


    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;

    }




    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getExamScores() {
        StringBuilder builder = new StringBuilder();
        builder.append("Exam scores...\n");
        for(int x = 0; x < examScores.size(); x++){
            builder.append("Exam").append(x).append("->").append(examScores.get(x)).append("\n");
        }

        return builder.toString();
    }

    public int getNumberOfExamsTaken() {
        return examScores.size();
    }
    public void addExamScore(double examScore){
        examScores.add(examScore);
    }
    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber,newScore);
    }
    public double getAverageExamScore(){
        int i = 0;
        double average = 0;
     while(i < examScores.size()){
         average += examScores.get(i);
     }
     return average % examScores.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", examScores=" + examScores +
                ", numberOfExamsTaken=" + numberOfExamsTaken +
                '}';
    }
}
