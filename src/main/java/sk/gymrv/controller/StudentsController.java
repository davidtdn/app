package sk.gymrv.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.gymrv.entity.StudentEntity;
import sk.gymrv.service.StudentsService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    private final StudentsService studentsService;

    public StudentsController(StudentsService studentsService) {
        this.studentsService = studentsService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<StudentEntity> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(studentsService.findById(id));
    }


    @GetMapping
    public ResponseEntity<List<StudentEntity>> findAll(){
        return ResponseEntity.ok(studentsService.findAll());
    }


    @PostMapping
    public ResponseEntity<StudentEntity> save(@RequestBody StudentEntity students){
        return ResponseEntity.ok(studentsService.save(students));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id){
        studentsService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
