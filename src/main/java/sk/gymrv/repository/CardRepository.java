package sk.gymrv.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.gymrv.entity.CardEntity;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Long> {
}
