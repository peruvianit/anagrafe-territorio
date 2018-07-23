package it.peruvianit.service;

import java.util.List;

import it.peruvianit.dto.ComuneDTO;
import it.peruvianit.dto.ProvinciaDTO;
import it.peruvianit.dto.RegioneDTO;

public interface IIstatService {
	
	public List<RegioneDTO> listaRegioneDTO();
	
	public List<ProvinciaDTO> listaProvinciaDTO(String codiceRegione);
	
	public List<ComuneDTO> listaComuneDTO(String codiceProvincia);
	
}