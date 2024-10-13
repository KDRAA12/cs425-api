package rent.app.demo.controllers;


import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import rent.app.demo.entities.Car;
import rent.app.demo.entities.RentalRequest;
import rent.app.demo.services.CarService;
import rent.app.demo.services.RentalRequestService;

@RestController
@RequestMapping("/api/rental-reuests")
@AllArgsConstructor
public class RentalController {
    private final RentalRequestService rentalRequestService;

    @GetMapping()
    public Page<RentalRequest> rentalRequests(
            @RequestParam(name = "search",required = false) String search,
            Pageable pageable){
        return rentalRequestService.findAll(search,pageable);
    }

    @GetMapping("/{id}")
    public RentalRequest rentalRequest(@PathVariable Long id){
        return rentalRequestService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteRentalRequest(@PathVariable Long id){
        rentalRequestService.deleteById(id);
    }

    @PostMapping()
    public RentalRequest saveRentalRequest(@RequestBody RentalRequest rentalRequest){
        return rentalRequestService.save(rentalRequest);
    }


}
