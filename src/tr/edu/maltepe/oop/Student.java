package tr.edu.maltepe.oop;
import java.util.Vector;

public class Student extends Person{

//    private Vector lendBook;

    public Student(){}
    public Student(String name,String surname, int id){

        this.setName(name);
        this.setSurname(surname);
        this.setId(id);
    }


//    public void get_book(Books aBook) {
//        lendBook.add(aBook);
//    }
//
//    public void give_book(Books aBook) {
//        lendBook.remove(aBook);
//    }


}
