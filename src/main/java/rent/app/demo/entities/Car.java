package rent.app.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(generator = "increment")
    private Long id;
    private String make;
    private String model;
    @Column(name = "manufactureYear")
    private String year;
    private String color;
    private String imageUrl;

    public String toString() {
        return "Car(id=" + this.getId() + ", make=" + this.getMake() + ", model=" + this.getModel() + ", year=" + this.getYear() + ", color=" + this.getColor() + ", imageUrl=" + this.getImageUrl() + ")";
    }
}
