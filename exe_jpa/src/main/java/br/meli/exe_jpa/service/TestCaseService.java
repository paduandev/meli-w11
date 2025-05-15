package br.meli.exe_jpa.service;

import java.util.List;

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

    @Override
    public List<TestCase> findByTested(Boolean tested) {
        return repo.findByTested(tested);
    }

    @Override
    public List<TestCase> findAllTestedTrue() {
        return repo.findAllTestedTrue();
    }

    @Override
    public List<TestCase> findAllTestedTrueNative() {
        return repo.findAllTestedTrueNative();
    }

    @Override
    public List<TestCase> findByExercicio(int numberOfTries) {
        // return repo.findByTestedTrueAndPassedFalseAndNumberOfTries(numberOfTries);
        // return repo.findExercicio2(numberOfTries);
        return repo.findExercicio3(numberOfTries);
    }


}
