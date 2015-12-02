package br.com.estatistica.common.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class UsuarioCadAdm implements Serializable {

	private static final long serialVersionUID = 730616230055773783L;
	
	@Id
	@Column(name = "USUA_NR_TITULO", nullable = false)
    private BigInteger nrTitulo;	
	
	@Column(name = "USUA_TX_NOME")
    private String nomeUsuario;
	
	@Column(name = "USUA_TX_EMAIL")
    private String emailUsuario;
	
	@Column(name = "USUA_TX_OBSERVACAO")
    private String observacoes;
	
	@Column(name = "USUA_TX_EXTERNO")
    private String usuarioExterno;

	@Column(name = "USUA_TX_LOTACAO")
    private String usuarioLotacao;
	
	@Column(name = "SENHA")
    private String usuarioSenha;
	
	public BigInteger getNrTitulo() {
		return nrTitulo;
	}

	public void setNrTitulo(BigInteger nrTitulo) {
		this.nrTitulo = nrTitulo;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getUsuarioExterno() {
		return usuarioExterno;
	}

	public void setUsuarioExterno(String usuarioExterno) {
		this.usuarioExterno = usuarioExterno;
	}

	public String getUsuarioLotacao() {
		return usuarioLotacao;
	}

	public void setUsuarioLotacao(String usuarioLotacao) {
		this.usuarioLotacao = usuarioLotacao;
	}

	public String getUsuarioSenha() {
		return usuarioSenha;
	}

	public void setUsuarioSenha(String usuarioSenha) {
		this.usuarioSenha = usuarioSenha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nrTitulo == null) ? 0 : nrTitulo.hashCode());
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
		UsuarioCadAdm other = (UsuarioCadAdm) obj;
		if (nrTitulo == null) {
			if (other.nrTitulo != null)
				return false;
		} else if (!nrTitulo.equals(other.nrTitulo))
			return false;
		return true;
	}		
}