import java.util.ArrayList;

public class StudentGroup {
    private String nazwa;
    private ArrayList<Student>students;
    public StudentGroup(String nazwa,ArrayList<Student>students){
        this.nazwa=nazwa;
        this.students=students;
    }
    public void add_Student(Student student){
        if(students.size()>=15||students.contains(student)){
        throw new IllegalStateException("Nie można dodać tego studenta");
        }
        students.add(student);
    }
}
