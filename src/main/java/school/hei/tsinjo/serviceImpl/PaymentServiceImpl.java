package school.hei.tsinjo.serviceImpl;

import school.hei.tsinjo.model.Payment;
import school.hei.tsinjo.model.PaymentStatus;
import school.hei.tsinjo.repository.PaymentRepository;
import school.hei.tsinjo.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Payment getById(String id) {
        return paymentRepository.findById(Long.valueOf(id)).orElseThrow();
    }

    @Override
    public Payment updateStatus(String id) {
        Payment p = getById(id);
        p.setStatus(PaymentStatus.valueOf("SUCCEEDED"));
        return paymentRepository.save(p);
    }
}
