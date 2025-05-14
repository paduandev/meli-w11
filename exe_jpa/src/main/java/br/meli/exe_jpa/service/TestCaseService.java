package br.meli.exe_jpa.service;

import org.springframework.stereotype.Service;

import br.meli.exe_jpa.model.TestCase;
import br.meli.exe_jpa.repository.TestCaseRepo;

@Service
public class TestCaseService implements ITestCaseService {

    private TestCaseRepo repo;

    public TestCaseService(TestCaseRepo repo) {
        this.repo = repo;
    }

    @Override
    public TestCase addNew(TestCase testCase) {
        // testCase.setLastUpdate(LocalDate.now());
        return repo.save(testCase);
    }

}
