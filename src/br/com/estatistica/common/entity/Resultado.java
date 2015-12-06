package br.com.estatistica.common.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESULTADO")
public class Resultado implements Serializable {

	private static final long serialVersionUID = 730616230055773783L;
	
	@Id
	@Column(name = "resu_nr_concurso", nullable = false)
    private Integer id;	
	
	@Column(name = "resu_dt_sorteio")
    private Date dtSorteio;
	
	@Column(name = "resu_nr_bola1")
    private Integer bola1;
	
	@Column(name = "resu_nr_bola2")
    private Integer bola2;
	
	@Column(name = "resu_nr_bola3")
    private Integer bola3;
	
	@Column(name = "resu_nr_bola4")
    private Integer bola4;
	
	@Column(name = "resu_nr_bola5")
    private Integer bola5;
	
	@Column(name = "resu_nr_bola6")
    private Integer bola6;
	
	@Column(name = "resu_nr_bola7")
    private Integer bola7;
	
	@Column(name = "resu_nr_bola8")
    private Integer bola8;
	
	@Column(name = "resu_nr_bola9")
    private Integer bola9;
	
	@Column(name = "resu_nr_bola10")
    private Integer bola10;
	
	@Column(name = "resu_nr_bola11")
    private Integer bola11;
	
	@Column(name = "resu_nr_bola12")
    private Integer bola12;
	
	@Column(name = "resu_nr_bola13")
    private Integer bola13;
	
	@Column(name = "resu_nr_bola14")
    private Integer bola14;
	
	@Column(name = "resu_nr_bola15")
    private Integer bola15;

	@Column(name = "resu_nr_ganhador15")
    private Integer qtdGanhadores15;
	
	@Column(name = "resu_nr_ganhador14")
    private Integer qtdGanhadores14;
	
	@Column(name = "resu_nr_ganhador13")
    private Integer qtdGanhadores13;
	
	@Column(name = "resu_nr_ganhador12")
    private Integer qtdGanhadores12;
	
	@Column(name = "resu_nr_ganhador11")
    private Integer qtdGanhadores11;
	
	@Column(name = "resu_tx_local")
    private String localSorteio;
	
	public Integer getId() {
		return id;
	}

	public Date getDtSorteio() {
		return dtSorteio;
	}

	public Integer getBola1() {
		return bola1;
	}

	public Integer getBola2() {
		return bola2;
	}

	public Integer getBola3() {
		return bola3;
	}

	public Integer getBola4() {
		return bola4;
	}

	public Integer getBola5() {
		return bola5;
	}

	public Integer getBola6() {
		return bola6;
	}

	public Integer getBola7() {
		return bola7;
	}

	public Integer getBola8() {
		return bola8;
	}

	public Integer getBola9() {
		return bola9;
	}

	public Integer getBola10() {
		return bola10;
	}

	public Integer getBola11() {
		return bola11;
	}

	public Integer getBola12() {
		return bola12;
	}

	public Integer getBola13() {
		return bola13;
	}

	public Integer getBola14() {
		return bola14;
	}

	public Integer getBola15() {
		return bola15;
	}

	public Integer getQtdGanhadores15() {
		return qtdGanhadores15;
	}

	public Integer getQtdGanhadores14() {
		return qtdGanhadores14;
	}

	public Integer getQtdGanhadores13() {
		return qtdGanhadores13;
	}

	public Integer getQtdGanhadores12() {
		return qtdGanhadores12;
	}

	public Integer getQtdGanhadores11() {
		return qtdGanhadores11;
	}

	public String getLocalSorteio() {
		return localSorteio;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDtSorteio(Date dtSorteio) {
		this.dtSorteio = dtSorteio;
	}

	public void setBola1(Integer bola1) {
		this.bola1 = bola1;
	}

	public void setBola2(Integer bola2) {
		this.bola2 = bola2;
	}

	public void setBola3(Integer bola3) {
		this.bola3 = bola3;
	}

	public void setBola4(Integer bola4) {
		this.bola4 = bola4;
	}

	public void setBola5(Integer bola5) {
		this.bola5 = bola5;
	}

	public void setBola6(Integer bola6) {
		this.bola6 = bola6;
	}

	public void setBola7(Integer bola7) {
		this.bola7 = bola7;
	}

	public void setBola8(Integer bola8) {
		this.bola8 = bola8;
	}

	public void setBola9(Integer bola9) {
		this.bola9 = bola9;
	}

	public void setBola10(Integer bola10) {
		this.bola10 = bola10;
	}

	public void setBola11(Integer bola11) {
		this.bola11 = bola11;
	}

	public void setBola12(Integer bola12) {
		this.bola12 = bola12;
	}

	public void setBola13(Integer bola13) {
		this.bola13 = bola13;
	}

	public void setBola14(Integer bola14) {
		this.bola14 = bola14;
	}

	public void setBola15(Integer bola15) {
		this.bola15 = bola15;
	}

	public void setQtdGanhadores15(Integer qtdGanhadores15) {
		this.qtdGanhadores15 = qtdGanhadores15;
	}

	public void setQtdGanhadores14(Integer qtdGanhadores14) {
		this.qtdGanhadores14 = qtdGanhadores14;
	}

	public void setQtdGanhadores13(Integer qtdGanhadores13) {
		this.qtdGanhadores13 = qtdGanhadores13;
	}

	public void setQtdGanhadores12(Integer qtdGanhadores12) {
		this.qtdGanhadores12 = qtdGanhadores12;
	}

	public void setQtdGanhadores11(Integer qtdGanhadores11) {
		this.qtdGanhadores11 = qtdGanhadores11;
	}

	public void setLocalSorteio(String localSorteio) {
		this.localSorteio = localSorteio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resultado other = (Resultado) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
		
}