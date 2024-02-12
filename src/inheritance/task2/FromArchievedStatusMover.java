package inheritance.task2;

public class FromArchievedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        switch (requestedStatus) {
            case AVAILABLE:
            case ARCHIVED:
                book.setStatus(requestedStatus);
                System.out.println("Статус книги был изменен на: " + requestedStatus);
                break;
            case BORROWED:
            case OVERDUED:
                System.out.println("Перевод книги из статуса " + book.getStatus() + " в статус " + requestedStatus + " невозможен");
        }
    }
}
