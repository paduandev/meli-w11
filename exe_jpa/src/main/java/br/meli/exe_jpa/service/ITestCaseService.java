package br.meli.exe_jpa.service;

import java.util.List;

import br.meli.exe_jpa.model.TestCase;

public interface ITestCaseService {
    TestCase addNew(TestCase testCase);
    List<TestCase> findByTested(Boolean tested);
    List<TestCase> findAllTestedTrue();
    List<TestCase> findAllTestedTrueNative();
    List<TestCase> findByExercicio(int numberOfTries);
}
