package br.meli.exe_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    
}
