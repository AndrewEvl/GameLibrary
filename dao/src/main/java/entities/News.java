package entities;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 23.05.2017.
 */
public class News {

    private String name;
//    private LocalDate date;
    private String text;
    private long id;
    private Set<Review> reviews = new HashSet<Review>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        if (id != news.id) return false;
        if (name != null ? !name.equals(news.name) : news.name != null) return false;
        if (text != null ? !text.equals(news.text) : news.text != null) return false;
        return reviews != null ? reviews.equals(news.reviews) : news.reviews == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (int) (id ^ (id >>> 32));
        result = 31 * result + (reviews != null ? reviews.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "News{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", id=" + id +
                ", reviews=" + reviews +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }
}
