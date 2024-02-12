package inheritance.task2;

import inheritance.task2.Book;
import inheritance.task2.Status;

public class FromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case BORROWED -> book.setStatus(Status.BORROWED);
            case ARCHIVED -> book.setStatus(Status.ARCHIVED);

        }
    }
}
//public enum Status {
//    AVAILABLE,
//    BORROWED,
//    OVERDUED,
//    ARCHIVED
//}
//
//public class Book {
//    private String title;
//    private Status status;
//
//    public Book(String title) {
//        this.title = title;
//        this.status = Status.AVAILABLE;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public Status getStatus() {
//        return status;
//    }
//
//    public void setStatus(Status status) {
//        this.status = status;
//    }
//}
//
//public class BookMover {
//    protected void moveToStatus(Book book, Status requestedStatus) {
//        System.out.println("Moving status...");
//    }
//}
//
//public class FromAvailableStatusMover extends BookMover {
//    @Override
//    protected void moveToStatus(Book book, Status requestedStatus) {
//        switch (requestedStatus) {
//            case BORROWED:
//                book.setStatus(Status.BORROWED);
//                break;
//            case ARCHIVED:
//                book.setStatus(Status.ARCHIVED);
//                break;
//            default:
//                System.out.println("Transferring a book from status 'AVAILABLE' to status '" + requestedStatus + "' is not possible");
//        }
//    }
//}
//
//public class FromBorrowedStatusMover extends BookMover {
//    @Override
//    protected void moveToStatus(Book book, Status requestedStatus) {
//        switch (requestedStatus) {
//            case ARCHIVED:
//                book.setStatus(Status.ARCHIVED);
//                break;
//            case OVERDUED:
//                book.setStatus(Status.OVERDUED);
//                break;
//            default:
//                System.out.println("Transferring a book from status 'BORROWED' to status '" + requestedStatus + "' is not possible");
//        }
//    }
//}
//
//public class FromOverduedStatusMover extends BookMover {
//    @Override
//    protected void moveToStatus(Book book, Status requestedStatus) {
//        switch (requestedStatus) {
//            case ARCHIVED:
//                book.setStatus(Status.ARCHIVED);
//                break;
//            case AVAILABLE:
//                book.setStatus(Status.AVAILABLE);
//                break;
//            default:
//                System.out.println("Transferring a book from status 'OVERDUED' to status '" + requestedStatus + "' is not possible");
//        }
//    }
//}
//
//public class FromArchivedStatusMover extends BookMover {
//    @Override
//    protected void moveToStatus(Book book, Status requestedStatus) {
//        if (requestedStatus == Status.AVAILABLE) {
//            book.setStatus(Status.AVAILABLE);
//        } else {
//            System.out.println("Transferring a book from status 'ARCHIVED' to status '" + requestedStatus + "' is not possible");
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Book book = new Book("The Lord of the Rings");
//        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
//        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
//        System.out.println(book.getStatus());