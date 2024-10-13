package rent.app.demo.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rent.app.demo.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
//
//    @Query("SELECT c FROM Car c WHERE " +
//            "LOWER(c.make) LIKE LOWER(CONCAT('%',:search,'%')) OR " +
//            "LOWER(c.model) LIKE LOWER(CONCAT('%',:search,'%')) OR " +
//            "LOWER(c.year) LIKE LOWER(CONCAT('%',:search,'%')) OR " +
//            "LOWER(c.color) LIKE LOWER(CONCAT('%',:search,'%'))" +
//            "ORDER BY c.make ASC")
//    Page<Car> findAll(String search, Pageable pageable);
 }
