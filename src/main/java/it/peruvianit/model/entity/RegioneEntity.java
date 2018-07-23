package it.peruvianit.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REGIONE")
public class RegioneEntity {
	
	@Id
	@Column(name = "COD_REG")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codReg;
	
	@Column(name = "DES_REG")
	private String desReg;
	
	@Column(name = "COD_ARE_GEO")
	private String codAreGeo;
	
	@Column(name = "COD_CIT")
	private String codCit;
	
	@Column(name = "COD_IST")
	private Integer codIst;
	
	@Column(name = "COD_REG_NAZ")
	private String codRegNaz;

	@Column(name = "COD_REG_IDE")
	private String codRegIde;

	public String getCodReg() {
		return codReg;
	}

	public void setCodReg(String codReg) {
		this.codReg = codReg;
	}

	public String getDesReg() {
		return desReg;
	}

	public void setDesReg(String desReg) {
		this.desReg = desReg;
	}

	public String getCodAreGeo() {
		return codAreGeo;
	}

	public void setCodAreGeo(String codAreGeo) {
		this.codAreGeo = codAreGeo;
	}

	public String getCodCit() {
		return codCit;
	}

	public void setCodCit(String codCit) {
		this.codCit = codCit;
	}

	public Integer getCodIst() {
		return codIst;
	}

	public void setCodIst(Integer codIst) {
		this.codIst = codIst;
	}

	public String getCodRegNaz() {
		return codRegNaz;
	}

	public void setCodRegNaz(String codRegNaz) {
		this.codRegNaz = codRegNaz;
	}

	public String getCodRegIde() {
		return codRegIde;
	}

	public void setCodRegIde(String codRegIde) {
		this.codRegIde = codRegIde;
	}
}
