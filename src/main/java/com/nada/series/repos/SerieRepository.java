package com.nada.series.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nada.series.entities.Serie;

public interface SerieRepository extends JpaRepository<Serie,Long> {

}
