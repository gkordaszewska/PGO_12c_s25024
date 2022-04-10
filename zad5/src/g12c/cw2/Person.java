package g12c.cw2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String surname;
    private LocalDate dateofBirth;
    private Adress adress;

    private List<Book> Books = new ArrayList<>();
    private List<Book> Authors = new ArrayList<>();


    public Person(String name, String surname, LocalDate dateofBirth, Adress adress) {
        this.setName(name);
        this.setSurname(surname);
        this.setDateofBirth(dateofBirth);
        this.setAdress(adress);
    }


    public int getAge() {
        return LocalDate.now().getYear() - this.dateofBirth.getYear();
    }

    public List<Book> getBooks() {
        return Books;
    }

    public List<Book> getAuthorsofBooks() {
        return Authors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("wartość imię nie może być pusta");
        } else {
            this.name = name;
        }
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new RuntimeException("wartość nazwisko nie może być pusta");
        } else {
            this.surname = surname;
        }
    }


    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        if (dateofBirth == null) {
            throw new RuntimeException("wartość data urodzenia nie może być pusta");
        } else {
            this.dateofBirth = dateofBirth;
        }
    }


    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        if (adress == null) {
            throw new RuntimeException("wartość adres nie może być pusta");
        } else {
            this.adress = adress;
        }
    }

    public Book publishBook(String name, Genre genre, Lang language, LocalDate publishDate) {
        Book newpublishedBook= new Book (name, genre, language, publishDate, new ArrayList<>(List.of(this)));
        this.Books.add(newpublishedBook);
        return newpublishedBook;
    }
 }



