package org.flexicode.web.domain;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Lecturers {
	
	@Id
	private Long id;
	private LecturerTitle lecturerTitle;
	private LecturerPosition lecturerPosition;
	private String lecturerFirstname;
	private String lecturerLastname;
	@ManyToOne
	private Departments department;
	@ManyToMany
	private Set<Students> students;
}
