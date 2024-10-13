package rent.app.demo.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import rent.app.demo.entities.RentalRequest;
import rent.app.demo.exceptions.NotFoundException;
import rent.app.demo.repositories.RentalRequestRepository;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class RentalRequestService {
    @Autowired
    private final RentalRequestRepository rentalRequestRepository;

    public Page<RentalRequest> findAll(String search, Pageable pageable) {
        return rentalRequestRepository.findAll(pageable);
    }

    public RentalRequest findById(Long id) {
        return rentalRequestRepository.findById(id).orElseThrow(() -> new NotFoundException("Rental request not found id:" + id));
    }

    public void deleteById(Long id) {
        rentalRequestRepository.deleteById(id);
    }

    public RentalRequest save(RentalRequest rentalRequest) {
        rentalRequest.setStatus(RentalRequest.Status.PENDING);
        rentalRequest.setCreatedAt(LocalDateTime.now());
        rentalRequest.setUpdatedAt(LocalDateTime.now());
        return rentalRequestRepository.save(rentalRequest);
    }

    public RentalRequest update(Long id, RentalRequest rentalRequest) {
        RentalRequest rentalRequest1 = rentalRequestRepository.findById(id).orElseThrow(() -> new NotFoundException("Rental request not found id:" + id));
      rentalRequest1.setCustomer(rentalRequest.getCustomer());
        rentalRequest1.setPickupDate(rentalRequest.getPickupDate());
        rentalRequest1.setReturnDate(rentalRequest.getReturnDate());
        rentalRequest1.setCar(rentalRequest.getCar());
        return rentalRequestRepository.save(rentalRequest1);
    }
}
