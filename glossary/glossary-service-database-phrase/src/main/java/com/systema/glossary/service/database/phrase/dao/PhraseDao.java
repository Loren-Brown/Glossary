package com.systema.glossary.service.database.phrase.dao;

import com.systema.glossary.model.phrase.Phrase;

import java.util.List;

public interface PhraseDao {

    public List<Phrase> getAllPhrases();

}