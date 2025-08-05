package school.hei.tsinjo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.hei.tsinjo.model.Help;

public interface HelpRepository extends JpaRepository<Help, Long> {
}
