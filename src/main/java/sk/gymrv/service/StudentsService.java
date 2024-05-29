package sk.gymrv.service;

import org.springframework.stereotype.Service;
import sk.gymrv.entity.StudentEntity;
import sk.gymrv.repository.StudentsRepository;

import java.util.List;

@Service
public class StudentsService {

    private final StudentsRepository studentsRepository;


    public StudentsService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }


    public StudentEntity findById(Long id){
        return studentsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    public List <StudentEntity> findAll() {
        return studentsRepository.findAll();
    }

    public StudentEntity save(StudentEntity students) {
        return studentsRepository.save(students);
    }

    public void deleteById(Long id) {
        studentsRepository.deleteById(id);
    }
}