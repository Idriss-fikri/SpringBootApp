package ubx.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ubx.bookStore.entity.Book;
import ubx.bookStore.entity.MybookList;
@Repository
public interface MyBookListRepository  extends JpaRepository<MybookList,Integer> {

}
