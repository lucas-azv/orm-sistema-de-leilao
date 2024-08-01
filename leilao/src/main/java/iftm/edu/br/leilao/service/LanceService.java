package iftm.edu.br.leilao.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iftm.edu.br.leilao.model.Lance;
import iftm.edu.br.leilao.repository.LanceRepository;

@Service
public class LanceService {

	@Autowired
	private LanceRepository repo;

	public void delete(Long id) {
		repo.deleteById(id);
	}

	public Lance busca(Long id) {
		return repo.findById(id).get();
	}

	public Lance atualiza(Lance lance, Long id) {
		lance.setId(id);
		return repo.save(lance);
	}

	public List<Lance> lances() {
		List<Lance> lista = new ArrayList<Lance>();
		repo.findAll().forEach(p -> lista.add(p));
		return lista;
	}

	public Lance salva(Lance lance) {
		return repo.save(lance);
	}

}
