package school.hei.tsinjo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.hei.tsinjo.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
