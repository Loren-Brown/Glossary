package com.systema.glossary.service.phrase.model;

public class Phrase {
	
	public Phrase(Long id, String acronym, String expression, String description) {
		this.id = id;
		this.acronym = acronym;
		this.expression = expression;
		this.description = description;
	}
	
	protected long id;
	
	protected String acronym;

	protected String expression;
	
	protected String description;
	
	public Long getId() { 
		return this.id;
	}
	
	public String getAcronym() {
		return this.acronym;
	}
	
	public String getExpression() {
		return this.expression;
	}
	
	public String getDescription() {
		return this.description;
	}
	
}