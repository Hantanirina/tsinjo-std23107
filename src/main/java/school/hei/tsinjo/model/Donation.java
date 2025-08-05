package school.hei.tsinjo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Donor donor;

    @OneToOne(cascade = CascadeType.ALL)
    private Payment payment;

    private LocalDateTime donationDate;
}
