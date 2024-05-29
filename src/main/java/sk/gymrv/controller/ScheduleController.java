package sk.gymrv.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.gymrv.entity.ScheduleEntity;
import sk.gymrv.service.ScheduleService;
import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<ScheduleEntity> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(scheduleService.findById(id));
    }


    @GetMapping
    public ResponseEntity<List<ScheduleEntity>> findAll(){
        return ResponseEntity.ok(scheduleService.findAll());
    }


    @PostMapping
    public ResponseEntity<ScheduleEntity> save(@RequestBody ScheduleEntity schedule){
        return ResponseEntity.ok(scheduleService.save(schedule));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id){
        scheduleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
