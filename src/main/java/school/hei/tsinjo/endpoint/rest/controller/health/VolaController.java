package school.hei.tsinjo.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import school.hei.tsinjo.model.Payment;
import school.hei.tsinjo.service.VolaService;

@RestController
@RequestMapping("/vola")
public class VolaController {

    private final VolaService volaService;

    public VolaController(VolaService volaService) {
        this.volaService = volaService;
    }

    @GetMapping("/payment")
    public Payment getPayment(
            @RequestParam String payerEmail,
            @RequestParam String pspType,
            @RequestParam String pspPaymentId) {
        return volaService.getPayment(payerEmail, pspType, pspPaymentId);
    }
}