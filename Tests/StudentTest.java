import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void average_of_grades() {
        ArrayList<Integer> listaocen = new ArrayList<>();
        listaocen.add(3);
        listaocen.add(2);
        Student st1 = new Student("Jan", "Kowalski", 15, "Jan@gmail.com", "Uminskiego24", listaocen);
        boolean wynik=false;
        if(st1.Average_of_grades()==2.5){
            wynik=true;
        }
        assert(wynik);
    }
}