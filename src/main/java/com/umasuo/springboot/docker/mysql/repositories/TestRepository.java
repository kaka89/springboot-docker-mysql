package com.umasuo.springboot.docker.mysql.repositories;

import org.springframework.data.repository.CrudRepository;

import com.umasuo.springboot.docker.mysql.model.TestTable;

/**
 * 
 * @author bruceliu
 * @date 2016-10-02
 *
 */
public interface TestRepository extends CrudRepository<TestTable, Long> {

}
