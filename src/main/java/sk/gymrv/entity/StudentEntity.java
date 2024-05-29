package sk.gymrv.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

@Table(name = "student")
@Entity
@Data
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 30)
    private String name;

    @Column(name = "surname", length = 20)
    private String surname;

    @ManyToOne
    @JoinColumn(name= "school_class_id")
    private SchoolClassEntity schoolClass;

    @OneToOne
    @JoinColumn(name = "card_id")
    private CardEntity card;

    @Column(name = "password", length = 30)
    private String password;

    @Column(name = "email", length = 30)
    private String email;

    @ToString.Exclude
    @OneToMany(mappedBy = "student")
    private Set<ReservationEntity> reservations;
}