package school.hei.tsinjo.serviceImpl;

import org.springframework.stereotype.Service;
import school.hei.tsinjo.model.Donor;
import school.hei.tsinjo.repository.DonorRepository;
import school.hei.tsinjo.service.DonorService;

@Service
public class DonorServiceImpl implements DonorService {
    private final DonorRepository donorRepository;

    public DonorServiceImpl(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    @Override
    public Donor getOrCreateByEmail(String email) {
        return donorRepository.findByEmail(email)
                .orElseGet(() -> donorRepository.save(Donor.builder().email(email).build()));
    }
}
