package g12c.cw2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Book {
    private static Set<Book> Books = new HashSet<>();
    private Long ID;
    private String name;
    private Genre genre;
    private Lang language;
    private LocalDate publishDate;
    private int borrowCount = 0;
    private String BorrowedBy;
    private boolean availability = true;
    private ArrayList<Person> Authors = new ArrayList<>();


    public Book(Long ID, String name, Genre genre, Lang language, LocalDate publishDate, ArrayList<Person>Authors,
                boolean availability) {
        this.setID(ID);
        this.setName(name);
        this.setGenre(genre);
        this.setLang(language);
        this.setPublishDate(publishDate);
        this.setAvailability(availability);

    }
public void BorrowBook (Person person) {
        if(availability!= true){
            throw new RuntimeException("Nie można wypożyczyć tej książki. Jest ona już wypożyczona");
        } else {
            this.BorrowedBy = person;
            borrowCount++;
        }

    }
     public void placeBack() {
        if(availability== true) {
            throw new RuntimeException("Książka nie była wypożyczona");
        }
            this.BorrowedBy= null;
     }


    public Long getID () {
        return ID;
    }
    public void setID (Long ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void SetName (String name) {
        this.name = name;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre=genre;
    }
    public Lang getLanguage() {
        return language;
    }
    public void setLanguage(Lang language) {
        this.language=language;
    }

 public LocalDate getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(LocalDate publishDate) {
        this.publishDate=publishDate;
    }

    public int getBorrowCount() {
        return borrowCount;
    }
    public void setBorrowCount(int borrowCount) {
        if (borrowCount != 1) {
            throw new RuntimeException("Można wypożyczyć tylko 1 książkę na raz");
        } else {
            this.borrowCount = borrowCount;
        }
    }

    public void setAvailability (boolean Availability) {
            this.availability=availability;
        }


public List<Person> getAuthors () {
        return Authors;
}





}
