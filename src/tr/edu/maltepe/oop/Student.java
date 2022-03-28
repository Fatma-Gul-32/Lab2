package tr.edu.maltepe.oop;
import java.util.Vector;

public class Student extends Person{

    public Student(){}
    public Student(String name,String surname, int id){

        this.setName(name);
        this.setSurname(surname);
        this.setId(id);
    }

}
