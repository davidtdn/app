package sk.gymrv.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.gymrv.entity.SchoolClassEntity;
import sk.gymrv.service.SchoolClassService;
import java.util.List;

@RestController
@RequestMapping("/school-class")
public class SchoolClassController {

    private final SchoolClassService schoolClassService;

    public SchoolClassController(SchoolClassService schoolClassService) {
        this.schoolClassService = schoolClassService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<SchoolClassEntity> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(schoolClassService.findById(id));
    }


    @GetMapping
    public ResponseEntity<List<SchoolClassEntity>> findAll(){
        return ResponseEntity.ok(schoolClassService.findAll());
    }


    @PostMapping
    public ResponseEntity<SchoolClassEntity> save(@RequestBody SchoolClassEntity classs){
        return ResponseEntity.ok(schoolClassService.save(classs));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id){
        schoolClassService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}