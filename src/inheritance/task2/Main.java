package inheritance.task2;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("The Lord of the Rings");
        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book1, Status.BORROWED);
        System.out.println(book1.getStatus());
    }

}
