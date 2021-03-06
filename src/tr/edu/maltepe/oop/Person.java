package tr.edu.maltepe.oop;
import java.util.*;

public class Person {

    private String name;
    private String surname;
    private int id;
    private Vector<Books> lendBook = new Vector<Books>();

    public Person(){
    }

    public Person(String name,String surname, int id){

        this.name=name;
        this.surname= surname;
        this.id= id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void get_book(Books aBook, Person user) {
        lendBook.add(aBook);
        System.out.println(user.getName()+ " lended " + aBook.getName());

        for (int i=0; i< lendBook.size(); i++){
            System.out.println(lendBook.elementAt(i).getName());
        }
    }

    public void give_book(Books aBook, Person user) {
        lendBook.remove(aBook);
        System.out.println(user.getName()+ " gave " + aBook.getName() + " back" );

    }
}
