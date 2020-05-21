public class LibraryItem {

    // LibraryItem Class properties
    private String title, author;
    private int numberPages, yearPublish;
    private double price;

    // Constructor
    public LibraryItem(String title, String author, int numberPages, int yearPublish, double price) {
        this.title = title;
        this.author = author;
        this.numberPages = numberPages;
        this.yearPublish = yearPublish;
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public int getPublish() {
        return yearPublish;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public void getPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    public void getPrice(double price) {
        this.price = price;
    }

}