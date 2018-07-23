package it.peruvianit.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.peruvianit.dto.ComuneDTO;
import it.peruvianit.dto.ProvinciaDTO;
import it.peruvianit.dto.RegioneDTO;
import it.peruvianit.service.IIstatService;

@RestController
@RequestMapping("/v1.0/istat")
public class IstatRestController {

	@Autowired
	IIstatService iIstatService;
	
	@GetMapping(value = "/regioni")
	public List<RegioneDTO> listaRegioneDTO() {
		return iIstatService.listaRegioneDTO();
	}
	
	@GetMapping(value = "/provincie/{codiceRegione}")
	public List<ProvinciaDTO> listaProvinciaDTO(@PathVariable("codiceRegione") String codiceRegione) {
		return iIstatService.listaProvinciaDTO(codiceRegione);
	}
	
	@GetMapping(value = "/comuni/{codiceProvincia}")
	public List<ComuneDTO> listaComuneDTO(@PathVariable("codiceProvincia") String codiceProvincia) {
		return iIstatService.listaComuneDTO(codiceProvincia);
	}
}
