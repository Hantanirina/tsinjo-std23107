package school.hei.tsinjo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.hei.tsinjo.model.Donor;

import java.util.Optional;

public interface DonorRepository extends JpaRepository<Donor, Long> {
    Optional<Donor> findByEmail(String email);
}
