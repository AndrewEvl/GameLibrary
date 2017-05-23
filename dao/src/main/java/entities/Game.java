package entities;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 23.05.2017.
 */
public class Game {
    private String nsme;
//    private LocalDate releseDate;
    private long id;
    private Genre genre;
    private Publisher publisher;
    private Developer developer;
    private Set<Reviews> reviews = new HashSet<Reviews>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        if (id != game.id) return false;
        if (nsme != null ? !nsme.equals(game.nsme) : game.nsme != null) return false;
        if (genre != null ? !genre.equals(game.genre) : game.genre != null) return false;
        if (publisher != null ? !publisher.equals(game.publisher) : game.publisher != null) return false;
        if (developer != null ? !developer.equals(game.developer) : game.developer != null) return false;
        return reviews != null ? reviews.equals(game.reviews) : game.reviews == null;
    }

    @Override
    public int hashCode() {
        int result = nsme != null ? nsme.hashCode() : 0;
        result = 31 * result + (int) (id ^ (id >>> 32));
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + (developer != null ? developer.hashCode() : 0);
        result = 31 * result + (reviews != null ? reviews.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Game{" +
                "nsme='" + nsme + '\'' +
                ", id=" + id +
                ", genre=" + genre +
                ", publisher=" + publisher +
                ", developer=" + developer +
                ", reviews=" + reviews +
                '}';
    }

    public String getNsme() {
        return nsme;
    }

    public void setNsme(String nsme) {
        this.nsme = nsme;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public Set<Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Reviews> reviews) {
        this.reviews = reviews;
    }
}
