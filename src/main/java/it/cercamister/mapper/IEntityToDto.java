package it.cercamister.mapper;

import it.cercamister.dto.ComuneDTO;
import it.cercamister.dto.ProvinciaDTO;
import it.cercamister.dto.RegioneDTO;
import it.cercamister.model.entity.ComuneEntity;
import it.cercamister.model.entity.ProvinciaEntity;
import it.cercamister.model.entity.RegioneEntity;
/**
 * 
 * @author Sergio Arellano
 * 
 *
 */
public interface IEntityToDto {
	
	public RegioneDTO regioneEntityToRegioneDTO(RegioneEntity regioneEntity);
	
	public ProvinciaDTO provinciaEntityToProvinciaDTO(ProvinciaEntity provinciaEntity);
	
	public ComuneDTO comuneEntityToComuneDTO(ComuneEntity comuneEntity);
}
