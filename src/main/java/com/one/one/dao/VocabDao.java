package com.one.one.dao;

import com.one.one.entities.Vocab;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface VocabDao extends JpaRepository<Vocab, Integer>{
    
    @Modifying
    @Query(value = "update vocab set ch =0", nativeQuery = true)
    int setAllchtoZero();

    @Modifying
    @Query(value = "update vocab set ch=1 where id=?", nativeQuery = true)
    int setchtoOne(Integer id);
}
