package it.peruvianit.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import it.peruvianit.dto.ComuneDTO;
import it.peruvianit.dto.ProvinciaDTO;
import it.peruvianit.dto.RegioneDTO;
import it.peruvianit.exception.IstatException;
import it.peruvianit.exception.ProvinciaNotFoundException;
import it.peruvianit.exception.RegioneNotFoundException;
import it.peruvianit.mapper.IEntityToDto;
import it.peruvianit.model.entity.ComuneEntity;
import it.peruvianit.model.entity.ProvinciaEntity;
import it.peruvianit.model.entity.RegioneEntity;
import it.peruvianit.model.repository.IComuneRepository;
import it.peruvianit.model.repository.IProvinciaRepository;
import it.peruvianit.model.repository.IRegioneRepository;
import it.peruvianit.service.IIstatService;

@Service
public class IstatServiceImpl implements IIstatService{

	@Autowired
	private IRegioneRepository iRegioneRepository;
	
	@Autowired
	private IProvinciaRepository iProvinciaRepository;
	
	@Autowired
	private IComuneRepository iComuneRepository;
	
	@Autowired
	private IEntityToDto iEntityToDto;

	@Override
	public List<RegioneDTO> listaRegioneDTO() {
		List<RegioneDTO> listRegioneDTO = new ArrayList<>();		
		List<RegioneEntity> listRegioneEntity = iRegioneRepository.findAll(new Sort(Sort.Direction.ASC, "desReg"));
		
		if ( listRegioneEntity.size() > 0 ) {
			for (RegioneEntity regioneEntity : listRegioneEntity) {
				listRegioneDTO.add(iEntityToDto.regioneEntityToRegioneDTO(regioneEntity));
			}
		}else {
			throw new RegioneNotFoundException("Non ci sono regioni");
		}
		
		return listRegioneDTO;
	}

	@Override
	public List<ProvinciaDTO> listaProvinciaDTO(String codiceRegione) {
		
		if ( codiceRegione == null ) {
			throw new IstatException("Il paramentro codice regione è obbligatorio");
		}
		
		List<ProvinciaDTO> listProvinciaDTO = new ArrayList<>();		
		List<ProvinciaEntity> listProvinciaEntity = iProvinciaRepository.findByCodRegOrderByDesPrv(codiceRegione);
		
		if ( listProvinciaEntity.size() > 0 ) {
			for (ProvinciaEntity provinciaEntity : listProvinciaEntity) {
				listProvinciaDTO.add(iEntityToDto.provinciaEntityToProvinciaDTO(provinciaEntity));
			}
		}else {
			throw new ProvinciaNotFoundException("Non ci sono provincie con il codice regione :" + codiceRegione);
		}
		
		return listProvinciaDTO;
	}

	@Override
	public List<ComuneDTO> listaComuneDTO(String codiceProvincia) {

		if ( codiceProvincia == null ) {
			throw new IstatException("Il paramentro codice provincia è obbligatorio");
		}
		
		List<ComuneDTO> listComuneDTO = new ArrayList<>();		
		List<ComuneEntity> listComuneEntity = iComuneRepository.findByCodPrvOrderByDesCom(codiceProvincia);
		
		if ( listComuneEntity.size() > 0 ) {
			for (ComuneEntity comuneEntity : listComuneEntity) {
				listComuneDTO.add(iEntityToDto.comuneEntityToComuneDTO(comuneEntity));
			}
		}else {
			throw new ProvinciaNotFoundException("Non ci sono provincie con il codice regione :" + codiceProvincia);
		}
		
		return listComuneDTO;
	}
}
