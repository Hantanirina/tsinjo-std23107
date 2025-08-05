package school.hei.tsinjo.service;

import school.hei.tsinjo.model.Payment;

public interface PaymentService {
    Payment save(Payment payment);
    Payment getById(String id);
    Payment updateStatus(String id);
}