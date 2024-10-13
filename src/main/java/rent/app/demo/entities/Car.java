package rent.app.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Car {
    @Id
    @GeneratedValue(generator = "increment")
    private Long id;
    private String make;
    private String model;
    private String year;
    private String color;
    private String imageUrl;


}
