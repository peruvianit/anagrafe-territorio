package it.peruvianit.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMUNE")
public class ComuneEntity {
	
	@Id
	@Column(name = "COD_COM")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codCom;
	
	@Column(name = "COD_PRV")
	private String codPrv;
	
	@Column(name = "DES_COM")
	private String desCom;
	
	@Column(name = "COD_CAP")
	private String codCap;
	
	@Column(name = "FLG_PRV")
	private String flgPrv;
	
	@Column(name = "COD_CAT_COM")
	private String codCatCom;
	
	@Column(name = "FLG_STA_COM")
	private Integer flgStaCom;
	
	@Column(name = "COD_IST")
	private Integer codIst;
	
	@Column(name = "COD_PRV_NIS")
	private String codPrvNis;
	
	@Column(name = "ISTAT_ALFA")
	private String istatAlfa;
	
	@Column(name = "ISTAT_NUM")
	private Integer istatNum;
	
	@Column(name = "ISTAT_103")
	private Integer istat103;
	
	@Column(name = "ISTAT_107")
	private Integer istat107;
	
	@Column(name = "COD_REG_NAZ")
	private String codRegNaz;
	
	@Column(name = "ISTAT_110")
	private Integer istat110;

	public String getCodCom() {
		return codCom;
	}

	public void setCodCom(String codCom) {
		this.codCom = codCom;
	}

	public String getCodPrv() {
		return codPrv;
	}

	public void setCodPrv(String codPrv) {
		this.codPrv = codPrv;
	}

	public String getDesCom() {
		return desCom;
	}

	public void setDesCom(String desCom) {
		this.desCom = desCom;
	}

	public String getCodCap() {
		return codCap;
	}

	public void setCodCap(String codCap) {
		this.codCap = codCap;
	}

	public String getFlgPrv() {
		return flgPrv;
	}

	public void setFlgPrv(String flgPrv) {
		this.flgPrv = flgPrv;
	}

	public String getCodCatCom() {
		return codCatCom;
	}

	public void setCodCatCom(String codCatCom) {
		this.codCatCom = codCatCom;
	}

	public Integer getFlgStaCom() {
		return flgStaCom;
	}

	public void setFlgStaCom(Integer flgStaCom) {
		this.flgStaCom = flgStaCom;
	}

	public Integer getCodIst() {
		return codIst;
	}

	public void setCodIst(Integer codIst) {
		this.codIst = codIst;
	}

	public String getCodPrvNis() {
		return codPrvNis;
	}

	public void setCodPrvNis(String codPrvNis) {
		this.codPrvNis = codPrvNis;
	}

	public String getIstatAlfa() {
		return istatAlfa;
	}

	public void setIstatAlfa(String istatAlfa) {
		this.istatAlfa = istatAlfa;
	}

	public Integer getIstatNum() {
		return istatNum;
	}

	public void setIstatNum(Integer istatNum) {
		this.istatNum = istatNum;
	}

	public Integer getIstat103() {
		return istat103;
	}

	public void setIstat103(Integer istat103) {
		this.istat103 = istat103;
	}

	public Integer getIstat107() {
		return istat107;
	}

	public void setIstat107(Integer istat107) {
		this.istat107 = istat107;
	}

	public String getCodRegNaz() {
		return codRegNaz;
	}

	public void setCodRegNaz(String codRegNaz) {
		this.codRegNaz = codRegNaz;
	}

	public Integer getIstat110() {
		return istat110;
	}

	public void setIstat110(Integer istat110) {
		this.istat110 = istat110;
	}
}
