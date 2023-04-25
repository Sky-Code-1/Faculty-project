package org.flexicode.web.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="departments")
@Repository
public interface DepartmentsRepository extends CrudRepository<Departments, String>{

}
