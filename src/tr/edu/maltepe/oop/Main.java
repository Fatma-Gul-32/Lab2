package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {

        Prof p1=new Prof("Ensar", "Gül", 41);
        Student s1=new Student("Fatma Gül", "Bağrıaçık", 190704023);

        Books b1=new Books("Intro to Java", 984);
        Books b2=new Books("C Programming", 184);
        Books b3=new Books("Operating Systems", 786);

        Library myLib= new Library();

        myLib.add_book(b1);
        myLib.add_book(b2);
        myLib.add_book(b3);

        System.out.println("\n");

        s1.get_book(b1,s1);
        p1.get_book(b3,p1);

        System.out.println("\n");

        myLib.borrow_book(b1);
        myLib.borrow_book(b3);

        System.out.println("\n");

        s1.give_book(b1,s1);
        p1.give_book(b3,p1);

        System.out.println("\n");

        myLib.add_book(b1);
        myLib.add_book(b3);
    }
}
