package org.flexicode.web.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class DepartmentRequest {
    private String name;
    private String title;
    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}    
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
