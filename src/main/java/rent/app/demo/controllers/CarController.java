package rent.app.demo.controllers;


import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import rent.app.demo.entities.Car;
import rent.app.demo.services.CarService;

@RestController
@AllArgsConstructor
@RequestMapping("/api/cars")
public class CarController {
    private final CarService carService;

    @GetMapping()
    public Page<Car> cars(
            @RequestParam(name = "search",required = false) String search,
            Pageable pageable){
        return carService.findAll(search,pageable);
    }

    @GetMapping("/{id}")
    public Car car(@PathVariable Long id){
        return carService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id){
        carService.deleteById(id);
    }

    @PostMapping()
    public Car saveCar(@RequestBody Car car){
        return carService.save(car);
    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable Long id,@RequestBody Car car){
        return carService.update(id,car);
    }
}
