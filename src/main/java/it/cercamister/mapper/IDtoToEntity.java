package it.cercamister.mapper;

import it.cercamister.dto.RegioneDTO;
import it.cercamister.model.entity.RegioneEntity;
/**
 * 
 * @author Sergio Arellano
 * 
 *
 */
public interface IDtoToEntity {
	
	/**
	 * 
	 * @param allenatoreDTO 
	 * 
	 * @return Entity Allenatore
	 */
	public RegioneEntity regioneDTOToRegioneEntity(RegioneDTO regioneDTO);
}
