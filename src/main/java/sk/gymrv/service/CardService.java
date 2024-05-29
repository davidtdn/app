package sk.gymrv.service;

import org.springframework.stereotype.Service;
import sk.gymrv.entity.CardEntity;
import sk.gymrv.repository.CardRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public CardEntity findById(Long id) {
        Optional<CardEntity> cardOptional = cardRepository.findById(id);
        return cardOptional.orElseThrow(() -> new RuntimeException("Card not found with id: " + id));
    }

    public List<CardEntity> findAll() {
        return cardRepository.findAll();
    }

    public CardEntity save(CardEntity card) {
        return cardRepository.save(card);
    }

    public void deleteById(Long id) {
        cardRepository.deleteById(id);
    }
}

