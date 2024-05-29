package sk.gymrv.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "card")
@Entity
@Data
public class CardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "code", length = 30)
    private String code;
}
