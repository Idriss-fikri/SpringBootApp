package ubx.bookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ubx.bookStore.entity.MybookList;
import ubx.bookStore.repository.MyBookListRepository;

import java.util.List;

@Service
public class MyBookList   {

    @Autowired
    MyBookListRepository myBookListRepository;


    public  void  saveMyBook(MybookList book ){
        myBookListRepository.save(book);

    }

    public  void deleteBookListById( int id ){

        myBookListRepository.deleteById(id);
    }
    public List<MybookList> getAllBookList(){
         return  myBookListRepository.findAll(); // return all the booklist from the database

    }

    

}
