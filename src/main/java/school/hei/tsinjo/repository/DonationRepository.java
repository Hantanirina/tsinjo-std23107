package school.hei.tsinjo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.hei.tsinjo.model.Donation;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}

