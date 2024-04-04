import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.lang.Math.round;

public class Student {
    private String fname;
    private String lname;
    private int indexNumber;
    private String email;
    private String address;
    private ArrayList<Integer> grades;
    public Student(String fname,String lname,int indexNumber, String email, String address,ArrayList<Integer> grades){
        this.fname=fname;
        this.lname=lname;
        this.indexNumber=indexNumber;
        this.email=email;
        this.address=address;
        this.grades=grades;
    }
    public double  Average_of_grades(){
        double sum=0;
        if(grades.size()==0){
            throw  new IllegalArgumentException("Brak ocen");
        }
        for(int i:grades){
            sum+=i;
        }
        return round(sum/grades.size()*2)/2.0;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
