package com.one.one.dao;

import java.util.List;

import com.one.one.entities.Idiom_View;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IdiomViewDao extends JpaRepository<Idiom_View,Integer>{
    
    @Query(value = "SELECT * FROM idiom_view  ORDER BY RAND ( ) LIMIT 4", nativeQuery = true)
    List<Idiom_View> pickRandow4();
}
