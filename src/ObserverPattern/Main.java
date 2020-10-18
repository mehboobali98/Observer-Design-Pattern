package ObserverPattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book b1 = new Book("50 shades of grey");

        Member m1 = new Member("Mehboob");
        Member m2 = new Member("Ukasha");
        Member m3 = new Member("Saad");

        b1.issueBook(m1);
        b1.issueBook(m2);
        b1.issueBook(m3);

        b1.returnBook();

        b1.issueBook(m2);
        b1.issueBook(m3);

    }
}
