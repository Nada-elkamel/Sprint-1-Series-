package com.nada.series.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nada.series.entities.Serie;

public interface SerieService {

	Serie saveSerie(Serie s);
	Serie updateSerie(Serie s);
	void deleteSerie(Serie s);
	void deleteSerieById(Long id);
	Serie getSerie(Long id);
	List<Serie> getAllSeries();
	Page<Serie> getAllSeriesParPage(int page, int size);
}
