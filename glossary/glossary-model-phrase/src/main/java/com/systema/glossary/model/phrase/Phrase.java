package com.systema.glossary.model.phrase;

import java.math.BigDecimal;

public class Phrase {
	
	public Phrase(BigDecimal id, String acronym, String expression, String description) {
		this.id = id;
		this.acronym = acronym;
		this.expression = expression;
		this.description = description;
	}
	
	protected BigDecimal id;
	
	protected String acronym;

	protected String expression;
	
	protected String description;
	
	public BigDecimal getId() { 
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