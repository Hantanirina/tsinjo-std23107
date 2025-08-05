package school.hei.tsinjo.endpoint.rest.controller.health;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import school.hei.tsinjo.repository.HelpRepository;
import school.hei.tsinjo.service.DonationService;
import school.hei.tsinjo.service.HelpService;

@Controller
public class TsinjoController {

    private final DonationService donationService;
    private final HelpService helpService;

    public TsinjoController(DonationService donationService, HelpService helpService) {
        this.donationService = donationService;
        this.helpService = helpService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("donations", donationService.getAllDonations());
        model.addAttribute("helps", helpService.getAll());
        return "home";
    }
}

