package org.flexicode.web.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DepartmentsRepository extends CrudRepository<Departments, String>{

}
