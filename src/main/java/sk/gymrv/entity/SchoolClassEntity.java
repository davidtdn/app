package sk.gymrv.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

@Table(name = "school_class")
@Entity
@Data
public class SchoolClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 7)
    private String name;

    @ToString.Exclude
    @OneToMany(mappedBy = "schoolClass")
    private Set<StudentEntity> students;
}
