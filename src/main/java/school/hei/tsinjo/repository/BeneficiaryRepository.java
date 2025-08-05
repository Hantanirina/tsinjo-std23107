package school.hei.tsinjo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.hei.tsinjo.model.Beneficiary;

import java.util.Optional;

public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long> {
    Optional<Beneficiary> findByEmail(String email);
}
