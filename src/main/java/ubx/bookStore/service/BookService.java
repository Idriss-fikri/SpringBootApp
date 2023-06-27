package ubx.bookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ubx.bookStore.BookStoreApplication;
import ubx.bookStore.entity.Book;
import ubx.bookStore.repository.BookRepository;

import java.util.List;

@Service
public class BookService {
        @Autowired //  injection de dependence
        private BookRepository bookRepository ; // on  cree un objet de type repository



        public void SaveBook(Book book){

            bookRepository.save(book);
        }

        public void deleteBookById( int  id){
            bookRepository.deleteById(id);

        }



        public List<Book> getAllBook(){
           return  bookRepository.findAll();
        }
        public  Book getBookById(int id ){
            return bookRepository.findById(id).get();

        }
}
