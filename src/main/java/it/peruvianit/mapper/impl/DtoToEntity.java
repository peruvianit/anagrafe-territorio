package it.peruvianit.mapper.impl;

import org.springframework.stereotype.Component;

import it.peruvianit.dto.RegioneDTO;
import it.peruvianit.mapper.IDtoToEntity;
import it.peruvianit.model.entity.RegioneEntity;

@Component
public class DtoToEntity implements IDtoToEntity {

	@Override
	public RegioneEntity regioneDTOToRegioneEntity(RegioneDTO regioneDTO) {
		RegioneEntity regioneEntity = null;
		
		if ( regioneDTO != null ) {
			regioneEntity = new RegioneEntity();
			
			
			regioneEntity.setCodReg(regioneDTO.getCodiceRegione());
			regioneEntity.setDesReg(regioneDTO.getDescrizioneRegione());
			regioneEntity.setCodAreGeo(regioneDTO.getCodiceAreaGeografica());
			regioneEntity.setCodCit(regioneDTO.getCodiceCit());
			regioneEntity.setCodIst(regioneDTO.getCodiceIstat());
			regioneEntity.setCodRegNaz(regioneDTO.getCodiceRegioneNazionale());
			regioneEntity.setCodRegIde(regioneDTO.getCodiceRegioneIde());
		}
		
		return regioneEntity;
	}

}
