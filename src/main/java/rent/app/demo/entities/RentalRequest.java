package rent.app.demo.entities;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
public class RentalRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @ManyToOne
    private User customer;

    private LocalDateTime pickupDate;
    private LocalDateTime returnDate;



    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    private  Status status;
    @ManyToOne
    private Car car;

    public enum Status{
        PENDING,
        APPROVED,
        REJECTED
    }
}
