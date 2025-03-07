public class Books {
    String title;
    String author;
    Boolean isAvailable;
    public Books(String a, String b, Boolean c) {
        title = a;
        author = b;
        isAvailable = c;
    }
    public String getTitle() {
        return title;
    }
    public void setIsAvailable(Boolean change) {
        isAvailable = change;
    }
}
