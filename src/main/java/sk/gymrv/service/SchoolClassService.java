package sk.gymrv.service;


import org.springframework.stereotype.Service;
import sk.gymrv.entity.SchoolClassEntity;
import sk.gymrv.repository.SchoolClassRepository;

import java.util.List;

@Service
public class SchoolClassService {

    private final SchoolClassRepository schooolClassRepository;


    public SchoolClassService(SchoolClassRepository schooolClassRepository) {
        this.schooolClassRepository = schooolClassRepository;
    }


    public SchoolClassEntity findById(Long id){
        return schooolClassRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Clas not found with id: " + id));
    }

    public List<SchoolClassEntity> findAll() {
        return schooolClassRepository.findAll();
    }

    public SchoolClassEntity save(SchoolClassEntity schooolClassEntity) {
        return schooolClassRepository.save(schooolClassEntity);
    }

    public void deleteById(Long id) {
        schooolClassRepository.deleteById(id);
    }
}