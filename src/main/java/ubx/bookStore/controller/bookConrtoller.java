package ubx.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ubx.bookStore.entity.Book;
import ubx.bookStore.entity.MybookList;
import ubx.bookStore.service.BookService;
import ubx.bookStore.service.MyBookList;

import java.util.List;


@Controller
public class bookConrtoller {

    @Autowired
     private  BookService bookService ;
    @Autowired
     private  MyBookList bookListservice ;

    @GetMapping("/") // this repsrent the href home used in thymeleaf
    public String Home(){
        return "home";
    }
    @GetMapping("/book_register") //this represent the href that we use in thymeleaf
    public String GetBookRegister(){
        return "bookregister"; // same name of the page html  in templates
    }
    @GetMapping("/available_books")
    public ModelAndView GetAvailable_books(){
        //ModelAndview  renvoie a la fois les données au modele et a vue associé au donne
        List<Book> bookList = bookService.getAllBook();
        ModelAndView m = new ModelAndView() ;
        m.setViewName("availablebooks"); //  precicse qu'elle vue on va afficher dans quelle page html que le controlleur va afficher
        m.addObject("Book" , bookList );
        return  m ;
    }
    @PostMapping( "/save")
    public  String add( @ModelAttribute Book book) {
        bookService.SaveBook(book);
        return "redirect:/available_books";

    }
    @RequestMapping("mylist/{id}")
    public  String addListBook(@PathVariable("id") int id){
        Book b = bookService.getBookById(id);
        MybookList mybookList =  new MybookList( b.getId(),  b.getName() , b.getAuthor() , b.getPrice());
        bookListservice.saveMyBook(mybookList);
        return "redirect:/my_books";

    }
    @RequestMapping("/delete/{id}")
    public  String RemoveAvailableBook(@PathVariable("id") int id){
        bookService.deleteBookById(id);
        return "redirect:/available_books";

    }


   @GetMapping("/my_books")
    public ModelAndView GetMyBook(Model model){
        List<MybookList> booklist=bookListservice.getAllBookList();
        ModelAndView m  = new ModelAndView() ;
        m.setViewName("myBooks");
        m.addObject("bkl" ,booklist);
        return m ;
   }



}
