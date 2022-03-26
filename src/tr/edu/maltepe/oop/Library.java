package tr.edu.maltepe.oop;
import java.util.*;

public class Library {

    private Vector<Books> booklist= new Vector<Books>();
    private String message;
    private String user;

    public Library(){
//        this.user= user;
    }

    public void add_book(Books aBook) {
        booklist.add(aBook);
        System.out.println(aBook.getName()+ " is added");
        for (int i=0; i< booklist.size(); i++){
            System.out.println(booklist.elementAt(i));
        }
    }

    public void borrow_book(Books aBook) {
        booklist.remove(aBook);
        System.out.println(aBook.getName()+ " is given");
        for (int i=0; i< booklist.size(); i++){
            System.out.println(booklist.elementAt(i));
        }
    }

//    public String toSting(){
//
//        for (Books b: booklist){
//
//            message= b.getName() + " is lended from " + user;
//        }
//        return message;
//    }

}
