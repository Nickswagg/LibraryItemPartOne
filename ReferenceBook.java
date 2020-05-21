import java.util.List;

public class ReferenceBook extends Book {

    private String topicMatter;

    public ReferenceBook(String title, String author, int numberPages, int yearPublish, double price,
            String topicMatter) {
        super(title, author, numberPages, yearPublish, price);
        this.topicMatter = topicMatter;
    }

    // Getters
    public String getTopicmatter() {
        return this.topicMatter;
    }

    // Setters
    public void setTopicmatter(String topicMatter) {
        this.topicMatter = topicMatter;
    }

}