package sk.gymrv.service;

import org.springframework.stereotype.Service;
import sk.gymrv.entity.ReservationEntity;
import sk.gymrv.repository.ReservationRepository;

import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public ReservationEntity findById(Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Clas not found with id: " + id));
    }

    public List<ReservationEntity> findAll() { return reservationRepository.findAll();}

    public ReservationEntity save(ReservationEntity reservationEntity) {
        return reservationRepository.save(reservationEntity);
    }

    public void deleteById(Long id) { reservationRepository.deleteById(id); }
}
