import java.util.ArrayList;

public class Teacher {
    private String fname;
    private String lname;
    private String email;
    private ArrayList<Subject>Subjects;

public Teacher(String fname, String lname, String email,ArrayList<Subject> subjects){
    this.fname=fname;
    this.lname=lname;
    this.email=email;
    this.Subjects=subjects;
}
public  void AddSubject(Subject subject){
    if(Subjects.size()>=30){
        throw new IllegalStateException("Za dużo przedmiotów");
    }
    Subjects.add(subject);
}

}