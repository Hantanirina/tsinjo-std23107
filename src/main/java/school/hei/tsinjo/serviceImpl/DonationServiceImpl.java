package school.hei.tsinjo.serviceImpl;

import org.springframework.stereotype.Service;
import school.hei.tsinjo.model.Donation;
import school.hei.tsinjo.repository.DonationRepository;
import school.hei.tsinjo.service.DonationService;

import java.util.List;

@Service
public class DonationServiceImpl implements DonationService {

    private final DonationRepository donationRepository;

    public DonationServiceImpl(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    @Override
    public Donation saveDonation(Donation donation) {
        return donationRepository.save(donation);
    }

    @Override
    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    @Override
    public Donation getDonationById(Long id) {
        return donationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Donation not found with id: " + id));
    }

    @Override
    public void deleteDonation(Long id) {
        donationRepository.deleteById(id);
    }
}

