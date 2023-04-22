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
public class Students {
   @Id
   private Long studentId;
   private String firstName;
   private String lastName;
   @ManyToMany
   private Set<Lecturers> lecturers;
//   private Lecturers courseAdvisor;
   @ManyToOne
   private Departments departments;
   private String level;
}
