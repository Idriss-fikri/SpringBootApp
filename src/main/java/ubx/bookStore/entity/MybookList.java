package ubx.bookStore.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "MyBooks")
public class MybookList {
    @Id
    private  int id ;
    @Column(name = "name" ,  nullable = false)
    private String name ;
    @Column(name = "author" ,  nullable = false)
    private  String author;
    @Column(name = "price" ,  nullable = false)
    private  int price ;

    public MybookList(){

    }


    public  MybookList(  int id  ,String name  ,  String author  , int price){
        super();
        this.id=id ;
        this.name =name;
        this.author=author;
        this.price=price;


    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
