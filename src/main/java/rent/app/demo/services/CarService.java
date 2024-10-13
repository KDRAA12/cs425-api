package rent.app.demo.services;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import rent.app.demo.entities.Car;
import rent.app.demo.exceptions.NotFoundException;
import rent.app.demo.repositories.CarRepository;

@Service
@AllArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    public Page<Car> findAll(String search,Pageable pageable){
        return carRepository.findAll(pageable);
    }

    public Car findById(Long id){
        return carRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Car with id "+id+"was not found"));
    }

    public Car save(Car car){
        return carRepository.save(car);
    }

    public void deleteById(Long id){
        carRepository.deleteById(id);
    }

    public Car update(Long id,Car car){
        Car carToUpdate = findById(id);
        carToUpdate.setMake(car.getMake());
        carToUpdate.setModel(car.getModel());
        carToUpdate.setYear(car.getYear());
        carToUpdate.setColor(car.getColor());
        return carRepository.save(carToUpdate);
    }
}
