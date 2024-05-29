package sk.gymrv.service;

import org.springframework.stereotype.Service;
import sk.gymrv.entity.ScheduleEntity;
import sk.gymrv.repository.ScheduleRepository;

import java.util.List;

@Service
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;


    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }


    public ScheduleEntity findById(Long id){
        return scheduleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Schedule not found with id: " + id));
    }

    public List<ScheduleEntity> findAll() {
        return scheduleRepository.findAll();
    }

    public ScheduleEntity save(ScheduleEntity schedule) {
        return scheduleRepository.save(schedule);
    }

    public void deleteById(Long id) {
        scheduleRepository.deleteById(id);
    }
}