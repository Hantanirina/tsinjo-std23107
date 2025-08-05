package school.hei.tsinjo.serviceImpl;

import org.springframework.stereotype.Service;
import school.hei.tsinjo.model.Beneficiary;
import school.hei.tsinjo.repository.BeneficiaryRepository;
import school.hei.tsinjo.service.BeneficiaryService;

@Service
public class BeneficiaryServiceImpl implements BeneficiaryService {
    private final BeneficiaryRepository beneficiaryRepository;

    public BeneficiaryServiceImpl(BeneficiaryRepository beneficiaryRepository) {
        this.beneficiaryRepository = beneficiaryRepository;
    }

    @Override
    public Beneficiary getOrCreateByEmail(String email) {
        return beneficiaryRepository.findByEmail(email)
                .orElseGet(() -> beneficiaryRepository.save(Beneficiary.builder().email(email).build()));
    }
}
