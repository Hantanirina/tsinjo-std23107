package school.hei.tsinjo.service;

import school.hei.tsinjo.model.Donor;

public interface DonorService {
    Donor getOrCreateByEmail(String email);
}
