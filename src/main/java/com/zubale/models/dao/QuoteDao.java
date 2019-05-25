package com.zubale.models.dao;

import com.zubale.models.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuoteDao extends JpaRepository<Quote, Long> {

    @Query("from Quote order by ")
    public List<Quote> findAllRegiones();
}
