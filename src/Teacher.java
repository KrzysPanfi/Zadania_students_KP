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
public double Wage(){
    double wage=0;
    for(Subject i:Subjects){
        if(i.getType().equals("wykład")){
            wage+=(i.getRate()*1.2)*15;
        }
        else{
            wage+=i.getRate()*15;
        }
    }
    return wage;

}
    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLname() {
        return lname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        Subjects = subjects;
    }

    public ArrayList<Subject> getSubjects() {
        return Subjects;
    }
}