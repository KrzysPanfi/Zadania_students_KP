import java.lang.reflect.Array;
import java.util.ArrayList;

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
    public int  Average_of_grades(){
        int sum=0;
        if(grades.size()==0){
            throw  new IllegalArgumentException("Brak ocen");
        }
        for(int i:grades){
            sum+=i;
        }return sum/grades.size();
    }
}
