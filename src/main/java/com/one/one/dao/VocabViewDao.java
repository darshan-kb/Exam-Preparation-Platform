package com.one.one.dao;

import java.util.List;

import com.one.one.entities.Vocab_View;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VocabViewDao extends JpaRepository<Vocab_View,Integer> {
    
    @Query(value = "SELECT * FROM vocab_view  ORDER BY RAND ( ) LIMIT 4", nativeQuery = true)
    List<Vocab_View> pickRandow4();
}
