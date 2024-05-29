package sk.gymrv.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.gymrv.entity.ReservationEntity;
import sk.gymrv.service.ReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservationEntity> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(reservationService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<ReservationEntity>> findAll(){
        return ResponseEntity.ok(reservationService.findAll());
    }

    @PostMapping
    public ResponseEntity<ReservationEntity> save(@RequestBody ReservationEntity classs){
        return ResponseEntity.ok(reservationService.save(classs));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id){
        reservationService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
