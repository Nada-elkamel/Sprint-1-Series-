package com.nada.series.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nada.series.entities.Serie;
import com.nada.series.repos.SerieRepository;

@Service
public class SerieServiceImpl implements SerieService {

	@Autowired
	SerieRepository serieRepository;
 
	@Override
	public Serie saveSerie(Serie s) {
		return serieRepository.save(s);
	}

	@Override
	public Serie updateSerie(Serie s) {
		return serieRepository.save(s);
	}

	@Override
	public void deleteSerie(Serie s) {
		serieRepository.delete(s);		
	}

	@Override
	public void deleteSerieById(Long id) {
		serieRepository.deleteById(id);		
	}

	@Override
	public Serie getSerie(Long id) {
		return serieRepository.findById(id).get();
	}

	@Override
	public List<Serie> getAllSeries() {
		return serieRepository.findAll();
	}

	@Override
	public Page<Serie> getAllSeriesParPage(int page, int size) {
		return serieRepository.findAll(PageRequest.of(page, size));
	}

}
