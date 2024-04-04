import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    @Test
    void wage() {
        ArrayList<Subject> subjects = new ArrayList<>();
        Teacher teach1=new Teacher("Andrzej","Nowak","NowA@gmail.com",subjects);
        Subject subj2= new Subject("Metody_numeryczne","wykład",30);
        teach1.AddSubject(subj2);
        assertEquals(540,teach1.Wage());
    }
}