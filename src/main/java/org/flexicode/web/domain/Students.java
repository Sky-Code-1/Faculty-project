package org.flexicode.web.domain;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
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
public class Students {
   @Id
   @SequenceGenerator( 
		   			  name="student_sequence",
   					  sequenceName="student_sequence",
   					  allocationSize=1
   					  )
   @GeneratedValue(generator = "student_sequence", strategy=GenerationType.AUTO)
   private Long studentId;
   private String firstname;
   private String lastname;
   @ManyToMany(cascade = CascadeType.PERSIST)
   private Set<Lecturers> lecturers;
   @ManyToOne
   private Lecturers courseAdvisor;
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name="department_name")
   private Departments department;
   private String level;
}
