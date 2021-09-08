package controllers;

import models.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.FileRepository;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping("/files")
    public ResponseEntity<List<File>> getAllFiles() {
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }
}
