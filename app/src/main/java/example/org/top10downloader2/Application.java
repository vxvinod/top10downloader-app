package example.org.top10downloader2;

/**
 * Created by 60010743 on 6/21/2017.
 */
public class Application {
    private String title;
    private String releaseDate;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Name "+getTitle() +"\n"+
                "Author "+getAuthor() + "\n"+
                "Release Date "+ getReleaseDate() + "\n";
    }
}
