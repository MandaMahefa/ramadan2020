package manda.bryan.ramadan2020.Entity;

public class Article {
    private int id;
    private String titre_book;
    private String description_book;
    private String detail_book;
    private String titre_book_second;
    private String designation_second;
    private String detail_second;
    private String date_book;

    public Article() {
    }

    public Article(int id, String titre_book, String description_book, String detail_book, String titre_book_second, String designation_second, String detail_second, String date_book) {
        this.id = id;
        this.titre_book = titre_book;
        this.description_book = description_book;
        this.detail_book = detail_book;
        this.titre_book_second = titre_book_second;
        this.designation_second = designation_second;
        this.detail_second = detail_second;
        this.date_book = date_book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate_book() {
        return date_book;
    }

    public void setDate_book(String date_book) {
        this.date_book = date_book;
    }

    public String getTitre_book() {
        return titre_book;
    }

    public void setTitre_book(String titre_book) {
        this.titre_book = titre_book;
    }

    public String getDescription_book() {
        return description_book;
    }

    public void setDescription_book(String description_book) {
        this.description_book = description_book;
    }

    public String getDetail_book() {
        return detail_book;
    }

    public void setDetail_book(String detail_book) {
        this.detail_book = detail_book;
    }

    public String getTitre_book_second() {
        return titre_book_second;
    }

    public void setTitre_book_second(String titre_book_second) {
        this.titre_book_second = titre_book_second;
    }

    public String getDesignation_second() {
        return designation_second;
    }

    public void setDesignation_second(String designation_second) {
        this.designation_second = designation_second;
    }

    public String getDetail_second() {
        return detail_second;
    }

    public void setDetail_second(String detail_second) {
        this.detail_second = detail_second;
    }
}
