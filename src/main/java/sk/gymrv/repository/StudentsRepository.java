package sk.gymrv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.gymrv.entity.StudentEntity;

@Repository
public interface StudentsRepository extends JpaRepository<StudentEntity, Long> {
}
