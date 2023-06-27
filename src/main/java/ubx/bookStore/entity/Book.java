package ubx.bookStore.entity;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(name = "name_book",nullable = false)
    private String name;
    @Column(name = "author_book",nullable = false)
    private  String author;
    @Column(name = "price_book",nullable = false)
    private int price ;

        public  Book(){

    }
    public Book ( String name , String author , int price){

            this.name=name ;
            this.author=author;
            this.price=price;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
