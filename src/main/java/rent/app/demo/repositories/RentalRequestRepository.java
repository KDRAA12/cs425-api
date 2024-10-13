package rent.app.demo.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rent.app.demo.entities.Car;
import rent.app.demo.entities.RentalRequest;

@Repository
public interface RentalRequestRepository extends JpaRepository<RentalRequest,Long> {

 }
