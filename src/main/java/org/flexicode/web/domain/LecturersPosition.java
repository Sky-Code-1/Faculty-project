package org.flexicode.web.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.STRING, with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_VALUES)
public enum LecturersPosition {
   HOD,
   COURSE_AVISOR,
   DEAN,
   FACULTY_COUNCILOR,
   EXAM_OFFICER,
   CLEARANCE_OFFICER
}
