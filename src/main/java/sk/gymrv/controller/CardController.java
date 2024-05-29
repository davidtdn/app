package sk.gymrv.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.gymrv.service.CardService;
import sk.gymrv.entity.CardEntity;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {

    private final CardService cardService;


    public CardController(CardService cardService) {
        this.cardService = cardService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<CardEntity> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(cardService.findById(id));
    }


    @GetMapping
    public ResponseEntity<List<CardEntity>> findAll() {
        return ResponseEntity.ok(cardService.findAll());
    }


    @PostMapping
    public ResponseEntity<CardEntity> save(@RequestBody CardEntity card) {
        return ResponseEntity.ok(cardService.save(card));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
        cardService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
