package ubx.bookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ubx.bookStore.service.MyBookList;

@Controller
public class MyBookListController {
    @Autowired
     private  MyBookList booklist ;


    @RequestMapping("/deletebooklist/{id}")
    public  String deleteFromBookList(@PathVariable("id") int id ) {
        booklist.deleteBookListById(id);
        return "redirect:/my_books";


    }





}
