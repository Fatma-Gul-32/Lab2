package tr.edu.maltepe.oop;
import java.util.*;

public class Library {

    private Vector<Books> booklist= new Vector<Books>();
    private Boolean empty= booklist.isEmpty();

    public Library(){

    }

    public void add_book(Books aBook) {
        booklist.add(aBook);
        System.out.println(aBook.getName()+ " is added");
        for (int i=0; i< booklist.size(); i++){
            System.out.println(booklist.elementAt(i).getName());
        }
    }

    public void borrow_book(Books aBook) {

        if(empty == true){

            System.out.println("The list is empty");
        }

        booklist.remove(aBook);
        System.out.println(aBook.getName()+ " is given");
        for (int i=0; i< booklist.size(); i++){
            System.out.println(booklist.elementAt(i).getName());
        }
    }

}
