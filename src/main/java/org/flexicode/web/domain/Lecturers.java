package org.flexicode.web.domain;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties
public class Lecturers {
	   @Id
	   @SequenceGenerator( 
	   					  sequenceName="lecturer_sequence",
			   			  name="lecturer_sequence",
	   					  allocationSize=1
	   					  )
	   @GeneratedValue(generator = "lecturer_sequence", strategy=GenerationType.AUTO)
	private Long id;
	@Enumerated(EnumType.STRING)
	private LecturerTitle lecturerTitle;
	@Enumerated(EnumType.STRING)
	private LecturerPosition lecturerPosition;
	private String lecturerFirstname;
	private String lecturerLastname;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="department")
	private Departments department;
	@ManyToMany()
	private Set<Students> students;
}
