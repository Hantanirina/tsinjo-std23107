package school.hei.tsinjo.service;

import school.hei.tsinjo.model.Beneficiary;

public interface BeneficiaryService {
    Beneficiary getOrCreateByEmail(String email);
}
