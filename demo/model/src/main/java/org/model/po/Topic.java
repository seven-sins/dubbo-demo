package org.model.po;

import java.io.Serializable;

public class Topic implements Serializable {
	private static final long serialVersionUID = 5756151049847069014L;

	private Long id;

	private String title;

	private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
