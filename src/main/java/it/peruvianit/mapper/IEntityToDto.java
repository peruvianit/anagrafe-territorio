package it.peruvianit.mapper;

import it.peruvianit.dto.ComuneDTO;
import it.peruvianit.dto.ProvinciaDTO;
import it.peruvianit.dto.RegioneDTO;
import it.peruvianit.model.entity.ComuneEntity;
import it.peruvianit.model.entity.ProvinciaEntity;
import it.peruvianit.model.entity.RegioneEntity;
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
