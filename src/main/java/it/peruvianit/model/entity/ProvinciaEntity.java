package it.peruvianit.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROVINCIA")
public class ProvinciaEntity {
	
	@Id
	@Column(name = "COD_PRV")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codPrv;
	
	@Column(name = "COD_REG")
	private String codReg;
	
	@Column(name = "DES_PRV")
	private String desPrv;
	
	@Column(name = "FLG_CAP_PRV")
	private String flgCapPrv;
	
	@Column(name = "COD_IST")
	private Integer codIst;

	public String getCodPrv() {
		return codPrv;
	}

	public void setCodPrv(String codPrv) {
		this.codPrv = codPrv;
	}

	public String getCodReg() {
		return codReg;
	}

	public void setCodReg(String codReg) {
		this.codReg = codReg;
	}

	public String getDesPrv() {
		return desPrv;
	}

	public void setDesPrv(String desPrv) {
		this.desPrv = desPrv;
	}

	public String getFlgCapPrv() {
		return flgCapPrv;
	}

	public void setFlgCapPrv(String flgCapPrv) {
		this.flgCapPrv = flgCapPrv;
	}

	public Integer getCodIst() {
		return codIst;
	}

	public void setCodIst(Integer codIst) {
		this.codIst = codIst;
	}
}
