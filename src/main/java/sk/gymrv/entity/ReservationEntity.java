package sk.gymrv.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Table(name = "reservation")
@Entity
@Data
public class ReservationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name= "student_id")
    private StudentEntity student;

    @Column(name = "date")
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name= "schedule_id")
    private ScheduleEntity schedule;
}
