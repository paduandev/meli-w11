package br.meli.exe_jpa.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.meli.exe_jpa.model.TestCase;
import java.util.List;

public interface TestCaseRepo extends CrudRepository<TestCase, Long> {
    @Query("select t from TestCase t where t.tested = true")
    List<TestCase> findAllTestedTrue();

    @Query(value = "select * from tbl_test_case t where t.tested = 1", nativeQuery = true)
    List<TestCase> findAllTestedTrueNative();

    List<TestCase> findByTested(Boolean tested);

    List<TestCase> findByTestedAndPassed(Boolean tested, Boolean passed);

    // escreva um método para retornar todos os casos que foram testados
    // porém não passaram no teste e tenha como parâmetro o numero de tentativas
    // 1 - method, 2 - hql, 3 - native

    List<TestCase> findByTestedTrueAndPassedFalseAndNumberOfTries(int numberOfTries);

    @Query("select t from TestCase t where t.tested = true and t.passed=false and t.numberOfTries = :numberOfTries")
    List<TestCase> findExercicio2(int numberOfTries);

    @Modifying
    @Query(value = "select * from tbl_test_case t where t.tested = true and t.passed=false and t.number_of_tries = ?1", nativeQuery = true)
    List<TestCase> findExercicio3(int numberOfTries);
}
