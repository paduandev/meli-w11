package br.meli.exe_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.meli.exe_jpa.model.TestCase;
import br.meli.exe_jpa.service.TestCaseService;

@RestController
@RequestMapping("/api/testcases")
public class TestCaseController {
    
    @Autowired
    private TestCaseService service;

    @PostMapping("/new")
    public ResponseEntity<TestCase> addNew(@RequestBody TestCase testCase) {
        TestCase newTestCase = service.addNew(testCase);
        return ResponseEntity.ok(newTestCase);
    }

    @GetMapping("/{tested}")
    public ResponseEntity<List<TestCase>> getTested(@PathVariable boolean tested) {
        return ResponseEntity.ok(service.findByTested(tested));
    }
    
    @GetMapping("/tested")
    public ResponseEntity<List<TestCase>> getTestedTrue() {
        return ResponseEntity.ok(service.findAllTestedTrue());
    }

    @GetMapping("/testednative")
    public ResponseEntity<List<TestCase>> getTestedTrueNative() {
        return ResponseEntity.ok(service.findAllTestedTrueNative());
    }
    
    @GetMapping("/ex/{numerOfTries}")
    public ResponseEntity<List<TestCase>> getExercicio(@PathVariable int numerOfTries) {
        return ResponseEntity.ok(service.findByExercicio(numerOfTries));
    }
}
