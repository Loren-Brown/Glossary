package com.systema.glossary.service.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

import com.systema.glossary.model.phrase.Phrase;
import com.systema.glossary.service.database.phrase.dao.PhraseDao;

@ComponentScan(basePackages = { "com.systema.glossary" })
@MapperScan("com.systema.glossary.service.database")
@Service("phrase-data-service")
public class PhraseDataService {
	
	@Autowired
	private PhraseDao phraseDao;

	public List<Phrase> getAllPhrases() {
		return phraseDao.getAllPhrases();
	}
}