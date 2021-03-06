package com.systema.glossary.service.phrase;

import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.mybatis.spring.annotation.MapperScan;

import com.systema.glossary.model.phrase.Phrase;
import com.systema.glossary.service.database.phrase.mapper.PhraseMapper;

@ComponentScan(basePackages = { "com.systema.glossary" })
@MapperScan("com.systema.glossary.service.database.phrase.mapper")
@Service("phrase-service")
public class PhraseServiceImpl implements PhraseService {
	
	@Autowired(required=false)
	public PhraseMapper phraseMapper;

	public Phrase createPhrase(Phrase phrase) {
		return phrase;
	}

	public void deletePhrase(BigDecimal id) {
		return;
	}

	public List<Phrase> getAllPhrases() {
		return phraseMapper.getAllPhrases();
		
//		List<Phrase> tempList = new ArrayList<Phrase>();
//		tempList.add(new Phrase(1L, "IDE", "Integrated Development Dnvironment",
//				"An integrated development environment (IDE) is a software application that provides comprehensive facilities to computer programmers for software development. An IDE normally consists of a source code editor, build automation tools, and a debugger."));
//		tempList.add(new Phrase(2L, "IDE", "Integrated Development Dnvironment",
//				"An integrated development environment (IDE) is a software application that provides comprehensive facilities to computer programmers for software development. An IDE normally consists of a source code editor, build automation tools, and a debugger."));
//		tempList.add(new Phrase(3L, "IDE", "Integrated Development Dnvironment",
//				"An integrated development environment (IDE) is a software application that provides comprehensive facilities to computer programmers for software development. An IDE normally consists of a source code editor, build automation tools, and a debugger."));
//
//		return tempList;
	}

	public Phrase getPhraseById(BigDecimal id) {
		Phrase tempPhrase = new Phrase(id, "IDE", "Integrated Development Dnvironment",
				"An integrated development environment (IDE) is a software application that provides comprehensive facilities to computer programmers for software development. An IDE normally consists of a source code editor, build automation tools, and a debugger.");

		return tempPhrase;
	}

	public List<Phrase> getPhraseListByTextMatch(String searchText) {

		List<Phrase> tempList = new ArrayList<Phrase>();
		tempList.add(new Phrase(new BigDecimal("1"), "IDE", "Integrated Development Dnvironment",
				"An integrated development environment (IDE) is a software application that provides comprehensive facilities to computer programmers for software development. An IDE normally consists of a source code editor, build automation tools, and a debugger."));
		tempList.add(new Phrase(new BigDecimal("2"), "IDE", "Integrated Development Dnvironment",
				"An integrated development environment (IDE) is a software application that provides comprehensive facilities to computer programmers for software development. An IDE normally consists of a source code editor, build automation tools, and a debugger."));
		tempList.add(new Phrase(new BigDecimal("3"), "IDE", "Integrated Development Dnvironment",
				"An integrated development environment (IDE) is a software application that provides comprehensive facilities to computer programmers for software development. An IDE normally consists of a source code editor, build automation tools, and a debugger."));

		return tempList;
	}
}