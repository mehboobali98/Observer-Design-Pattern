package ObserverPattern;

public class Member implements Observer {
    String name;

    Member( String name)
    {
        this.name = name;
    }

    public void update(Object o)
    {
        if( o instanceof Book)
        {
            Book b = (Book) o;
            System.out.println(b.name + " is available now.");
        }
    }
}
