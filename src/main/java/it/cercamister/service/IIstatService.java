package it.cercamister.service;

import java.util.List;

import it.cercamister.dto.ComuneDTO;
import it.cercamister.dto.ProvinciaDTO;
import it.cercamister.dto.RegioneDTO;

public interface IIstatService {
	
	public List<RegioneDTO> listaRegioneDTO();
	
	public List<ProvinciaDTO> listaProvinciaDTO(String codiceRegione);
	
	public List<ComuneDTO> listaComuneDTO(String codiceProvincia);
	
}