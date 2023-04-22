package org.flexicode.web.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Departments {
	@Id
	private Long departmentName;
	@OneToMany
	private List<Lecturers> lecturers;
//	private Lecturers departmentHod;
	@OneToMany
	private List<Students> students;
}
