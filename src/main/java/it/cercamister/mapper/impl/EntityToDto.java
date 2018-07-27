package it.cercamister.mapper.impl;

import org.springframework.stereotype.Component;

import it.cercamister.dto.ComuneDTO;
import it.cercamister.dto.ProvinciaDTO;
import it.cercamister.dto.RegioneDTO;
import it.cercamister.mapper.IEntityToDto;
import it.cercamister.model.entity.ComuneEntity;
import it.cercamister.model.entity.ProvinciaEntity;
import it.cercamister.model.entity.RegioneEntity;

@Component
public class EntityToDto implements IEntityToDto {

	@Override
	public RegioneDTO regioneEntityToRegioneDTO(RegioneEntity regioneEntity) {
		RegioneDTO regioneDTO = null;
		
		if ( regioneEntity != null ) {
			regioneDTO = new RegioneDTO();
			
			regioneDTO.setCodiceRegione(regioneEntity.getCodReg());
			regioneDTO.setDescrizioneRegione(regioneEntity.getDesReg());
			regioneDTO.setCodiceAreaGeografica(regioneEntity.getCodAreGeo());
			regioneDTO.setCodiceCit(regioneEntity.getCodCit());
			regioneDTO.setCodiceIstat(regioneEntity.getCodIst());
			regioneDTO.setCodiceRegioneNazionale(regioneEntity.getCodRegNaz());
			regioneDTO.setCodiceRegioneIde(regioneEntity.getCodRegIde());
		}
		
		return regioneDTO;
	}

	@Override
	public ProvinciaDTO provinciaEntityToProvinciaDTO(ProvinciaEntity provinciaEntity) {
		ProvinciaDTO provinciaDTO = null;
		
		if ( provinciaEntity != null ) {
			provinciaDTO = new ProvinciaDTO();
			
			provinciaDTO.setCodiceProvincia(provinciaEntity.getCodPrv());
			provinciaDTO.setCodiceRegione(provinciaEntity.getCodReg());
			provinciaDTO.setDescrizioneProvincia(provinciaEntity.getDesPrv());
			provinciaDTO.setFlagCapProvincia(provinciaEntity.getFlgCapPrv());
			provinciaDTO.setCodiceIstat(provinciaEntity.getCodIst());
		}
		
		return provinciaDTO;
	}

	@Override
	public ComuneDTO comuneEntityToComuneDTO(ComuneEntity comuneEntity) {
		ComuneDTO comuneDTO = null;
		
		if ( comuneEntity != null ) {
			comuneDTO = new ComuneDTO();
			
			comuneDTO.setCodiceComune(comuneEntity.getCodCom());
			comuneDTO.setCodiceProvincia(comuneEntity.getCodPrv());
			comuneDTO.setDescrizioneComune(comuneEntity.getDesCom());
			comuneDTO.setCodiceCap(comuneEntity.getCodCap());
			comuneDTO.setFlagProvincia(comuneEntity.getFlgPrv());
			comuneDTO.setCodiceCatComune(comuneEntity.getCodCatCom());
			comuneDTO.setCodiceIstat(comuneEntity.getCodIst());
			comuneDTO.setCodiceProvinciaNis(comuneEntity.getCodPrvNis());
			comuneDTO.setIstatAlfa(comuneEntity.getIstatAlfa());
			comuneDTO.setIstatNum(comuneEntity.getIstatNum());
			comuneDTO.setCodiceComune(comuneEntity.getCodCom());
			comuneDTO.setIstat103(comuneEntity.getIstat103());
			comuneDTO.setIstat107(comuneEntity.getIstat107());
			comuneDTO.setIstat110(comuneEntity.getIstat110());
			comuneDTO.setCodiceRegioneNazionale(comuneEntity.getCodRegNaz());
		}
		
		return comuneDTO;
	}

	
}
