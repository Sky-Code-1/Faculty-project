package org.flexicode.web.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="students")
public interface StudentsRepository extends CrudRepository<Students, Long>{

}
