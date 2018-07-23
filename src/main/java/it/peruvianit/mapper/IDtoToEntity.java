package it.peruvianit.mapper;

import it.peruvianit.dto.RegioneDTO;
import it.peruvianit.model.entity.RegioneEntity;
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
