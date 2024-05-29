package sk.gymrv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.gymrv.entity.SchoolClassEntity;

@Repository
public interface SchoolClassRepository extends JpaRepository<SchoolClassEntity, Long> {
}
