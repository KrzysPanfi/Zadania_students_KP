import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listaocen = new ArrayList<>();
        listaocen.add(3);
        listaocen.add(2);
        Student st1 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Subject> subjects = new ArrayList<>();

        System.out.println(st1.Average_of_grades());

        StudentGroup gr1 = new StudentGroup("Grupa1", students);
        gr1.add_Student(st1);

        Teacher teach1=new Teacher("Andrzej","Nowak","NowA@gmail.com",subjects);
        Subject subj1= new Subject("Programowianie_obiekt","zajęcia",30);
        Subject subj2= new Subject("Metody_numeryczne","wykład",30);
        Subject subj3= new Subject("Struktury_danych","zajęcia",30);
        Subject subj4= new Subject("Arytmetyka","zajęcia",30);
        //teach1.AddSubject(subj1);
        teach1.AddSubject(subj2);
        //teach1.AddSubject(subj3);
        //teach1.AddSubject(subj4);
        System.out.println(teach1.Wage());


    }
    }
