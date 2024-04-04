import java.util.ArrayList;

public class StudentGroup {
    private String nazwa;
    private ArrayList<Student>students;
    public StudentGroup(String nazwa,ArrayList<Student>students){
        this.nazwa=nazwa;
        this.students=students;
    }
    public void add_Student(Student student){
        if(students.size()>=15){
        throw new IllegalStateException("Limit miejsc");
        }
        if(students.contains(student)){
            throw new IllegalStateException("Ten student już należy do tej grupy");
        }
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
