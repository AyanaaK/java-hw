package inheritance.task2;

public class Book {
    private String title;
    private Status requestedStatus;

    public Book(String title) {
        this.title = title;
        this.requestedStatus = Status.AVAILABLE;
    }

    public Status getStatus() {
        return requestedStatus;
    }

    public void setStatus(Status status) {
        this.requestedStatus = status;
    }

    public String getTitle() {
        return title;
    }
}
