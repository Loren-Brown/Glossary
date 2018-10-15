package com.systema.glossary.service.database.phrase.mapper;

import com.systema.glossary.model.phrase.Phrase;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

@Mapper
public interface PhraseMapper {

	@Select("select * from phrase")
    List<Phrase> getAllPhrases();

}