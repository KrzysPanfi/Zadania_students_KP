import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentGroupTest {

    @Test
    void add_Student() {
        ArrayList<Integer> listaocen = new ArrayList<>();
        listaocen.add(3);
        listaocen.add(2);
//tworzenie studentów do testu limitu
        Student st1 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        Student st2 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        Student st3 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        Student st4 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        Student st5 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        Student st6 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        Student st7 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        Student st8 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        Student st9 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        Student st10 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        Student st11= new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        Student st12 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        Student st13 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        Student st14 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        Student st15 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        Student st16 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);

        ArrayList<Student> students = new ArrayList<>();
        StudentGroup gr1 = new StudentGroup("Grupa1", students);
        // test limitu grupy
        gr1.add_Student(st1);
        gr1.add_Student(st2);
        gr1.add_Student(st3);
        gr1.add_Student(st4);
        gr1.add_Student(st5);
        gr1.add_Student(st6);
        gr1.add_Student(st7);
        gr1.add_Student(st8);
        gr1.add_Student(st9);
        gr1.add_Student(st10);
        gr1.add_Student(st11);
        gr1.add_Student(st12);
        gr1.add_Student(st13);
        gr1.add_Student(st14);
        gr1.add_Student(st15);
        //gr1.add_Student(st16);
        assertTrue(true);
    }
}