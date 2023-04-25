package org.flexicode.web.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="departments")
public class Departments {
	@Id
	@SequenceGenerator(name = "department_sequence", sequenceName = "department_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "department_sequence")
	private Long departmentId;
	@Column(unique=true, nullable=false)
	private String departmentName;
	@Column(unique=true, nullable=false)
	private String departmentTitle;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="department")
	private List<Lecturers> lecturers;
	@OneToOne
 	private Lecturers departmentHod;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="department")
	private List<Students> students;
}
