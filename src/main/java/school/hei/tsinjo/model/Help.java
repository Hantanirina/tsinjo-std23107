package school.hei.tsinjo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Help {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Beneficiary beneficiary;

    @OneToOne(cascade = CascadeType.ALL)
    private Payment payment;

    private String description;
    private LocalDateTime helpDate;
}

