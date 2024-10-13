package rent.app.demo;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rent.app.demo.entities.Car;
import rent.app.demo.repositories.CarRepository;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class DataHelper implements CommandLineRunner {
    private final CarRepository carRepository;

    @Override
    public void run(String... args) throws Exception {
            List<Car> cars = new ArrayList<>();

            cars.add(new Car(8L, "Audi", "A4", "2020", "White", "https://cs425mui.s3.amazonaws.com/cars/a4.png"));
            cars.add(new Car(6L, "BMW", "X5", "2023", "Gray", "https://cs425mui.s3.amazonaws.com/cars/bmwx5.png"));
            cars.add(new Car(5L, "Chevrolet", "Malibu", "2018", "Blue", "https://cs425mui.s3.amazonaws.com/cars/malibu.png"));
            cars.add(new Car(3L, "Ford", "Mustang", "2021", "Red", "https://cs425mui.s3.amazonaws.com/cars/form-mustang.png"));
            cars.add(new Car(2L, "Honda", "Accord", "2019", "Black", "https://cs425mui.s3.amazonaws.com/cars/accord.png"));
            cars.add(new Car(9L, "Hyundai", "Elantra", "2019", "Blue", "https://cs425mui.s3.amazonaws.com/cars/2023+Hyundai+Elantra.png"));
            cars.add(new Car(10L, "Kia", "Sorento", "2021", "Silver", "https://cs425mui.s3.amazonaws.com/cars/mlp-img-top-2023-sorento-temp.png"));
            cars.add(new Car(7L, "Mercedes-Benz", "C-Class", "2021", "Black", "https://cs425mui.s3.amazonaws.com/cars/png-clipart-mercedes-benz-c-class-car-2018-nissan-sentra-mercedes-s-class-2018-compact-car-sedan.png"));
            cars.add(new Car(4L, "Tesla", "Model 3", "2022", "White", "https://cs425mui.s3.amazonaws.com/cars/png-clipart-tesla-model-3-tesla-motors-car-electric-vehicle-tesla-model-3-compact-car-sedan.png"));
            cars.add(new Car(1L, "Toyota", "Camry", "2020", "Silver", "https://cs425mui.s3.amazonaws.com/cars/2023+Toyota+Camry.png"));


            for (Car car : cars) {
                carRepository.save(car);

                log.info(car.toString());
            }



    }
}
