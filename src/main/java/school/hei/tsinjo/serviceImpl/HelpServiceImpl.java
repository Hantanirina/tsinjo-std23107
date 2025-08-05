package school.hei.tsinjo.serviceImpl;

import org.springframework.stereotype.Service;
import school.hei.tsinjo.model.Help;
import school.hei.tsinjo.repository.HelpRepository;
import school.hei.tsinjo.service.HelpService;

import java.util.List;

@Service
public class HelpServiceImpl implements HelpService {
    private final HelpRepository helpRepository;

    public HelpServiceImpl(HelpRepository helpRepository) {
        this.helpRepository = helpRepository;
    }

    @Override
    public Help save(Help help) {
        return helpRepository.save(help);
    }

    @Override
    public List<Help> getAll() {
        return helpRepository.findAll();
    }

    @Override
    public Help getById(String id) {
        return helpRepository.findById(Long.valueOf(id)).orElseThrow();
    }
}
