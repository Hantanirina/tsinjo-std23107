package school.hei.tsinjo.service;

import school.hei.tsinjo.model.Donation;

import java.util.List;

public interface DonationService {
    Donation saveDonation(Donation donation);
    List<Donation> getAllDonations();
    Donation getDonationById(Long id);
    void deleteDonation(Long id);
}

