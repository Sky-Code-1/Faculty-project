package org.flexicode.web.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="lecturers")
public interface LecturersRepository extends CrudRepository<Lecturers, Long>{

}
