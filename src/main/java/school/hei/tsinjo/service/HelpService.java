package school.hei.tsinjo.service;

import school.hei.tsinjo.model.Help;

import java.util.List;

public interface HelpService {
    Help save(Help help);
    List<Help> getAll();
    Help getById(String id);
}
