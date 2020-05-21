public class LibraryItem {

    // LibraryItem Class properties
    private String title, author;
    private int numberPages, yearPublish;
    private double price;
    private ItemTypes libraryClass;

    // Constructor
    public LibraryItem(String title, String author, int numberPages, int yearPublish, double price,
            ItemTypes libraryClass) {
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

    public ItemTypes getlibraryClass() {
        return libraryClass;
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

    public void setPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override // Overriding to get Book informations
    public String toString() {
        return this.getTitle() + " ,  " + this.getAuthor() + " ,  " + this.getPublish() + " $,  " + this.getPrice();
        // Example :
        // The 7 Habits of Highly Effective People, Stephen R.Covey, 2004, $15.99
    }
}