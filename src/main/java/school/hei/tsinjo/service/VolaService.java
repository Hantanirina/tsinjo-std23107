package school.hei.tsinjo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import school.hei.tsinjo.model.Payment;

@Service
public class VolaService {

    private final RestTemplate restTemplate;
    private final String baseUrl = "https://42cwka3n4ifcp7ufheyrpmph240iuaxo.lambda-url.eu-west-3.on.aws";
    private final String apiKey;

    public VolaService(RestTemplate restTemplate, String apiKey) {
        this.restTemplate = restTemplate;
        this.apiKey = apiKey;
    }

    public Payment getPayment(String payerEmail, String pspType, String pspPaymentId) {
        String url = baseUrl + "/payment?apiKey={apiKey}&payerEmail={payerEmail}&pspType={pspType}&pspPaymentId={pspPaymentId}";

        ResponseEntity<Payment> response = restTemplate.getForEntity(
                url,
                Payment.class,
                apiKey, payerEmail, pspType, pspPaymentId
        );

        return response.getBody();
    }
}
