package br.meli.exe_jpa.repository;

import org.springframework.data.repository.CrudRepository;

import br.meli.exe_jpa.model.TestCase;

public interface TestCaseRepo extends CrudRepository<TestCase, Long>{
    
}
