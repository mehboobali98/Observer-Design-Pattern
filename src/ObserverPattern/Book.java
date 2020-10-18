package ObserverPattern;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Book implements Subject {
    String name;
    boolean status;
    ArrayList<Observer> o_list;

    Book(String name) {
        this.name = name;
        this.o_list = new ArrayList<>();
        status = true; //true means available
    }

    public void issueBook(Member m) {
        if (status == true) { //if book is available
            this.status = false;
            System.out.println("Book issued successfully to " + m.name);
        } else {

            this.addObserver(m);
        }
    }

    public void returnBook() {
        this.status = true;
        this.notifyObservers();//notify observers when book is returned

    }

    public void addObserver(Observer o) {
        this.o_list.add(o);
        System.out.println("Observer added successfully.");
    }

    public void removeObserver(Observer o) {
        this.o_list.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : this.o_list) {
            o.update(this);
        }
    }

}
