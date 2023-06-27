package ubx.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ubx.bookStore.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book , Integer> {
}
