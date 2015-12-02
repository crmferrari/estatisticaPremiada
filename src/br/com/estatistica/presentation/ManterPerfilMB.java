package br.com.estatistica.presentation;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.estatistica.business.IManterPerfilService;
import br.com.estatistica.common.entity.Perfil;
import br.com.estatistica.common.entity.Sistema;

@ManagedBean(eager = true)
@RequestScoped
public class ManterPerfilMB {
	
	private Perfil perfil;
	private List<Sistema> listaSistemas;
	private IManterPerfilService manterPerfilService;
	private List<Perfil> listaPerfis;
	
	public String salvar () throws Exception{
		
		this.getManterPerfilService().salvarPerfil(perfil);
		this.atualizaPerfis();
		
    	return "manterPerfil";
    	
    }
	
	public void atualizaPerfis() throws Exception{
		
		listaPerfis = this.getManterPerfilService().listaPerfisSistema(perfil.getIdSistema());
		
	}
	
	public IManterPerfilService getManterPerfilService() {
		
		return manterPerfilService;
	}

	public void setManterPerfilService(
			IManterPerfilService manterPerfilService) {
		this.manterPerfilService = manterPerfilService;
	}
	
	public Perfil getPerfil() {
		if (perfil == null) {
			perfil = new Perfil();
		}
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	public List<Sistema> getListaSistemas() throws Exception {
		return this.getManterPerfilService().listSistemas();
	}

	public void setListaSistemas(List<Sistema> listaSistemas) {
		this.listaSistemas = listaSistemas;
	}
	
	public List<Perfil> getListaPerfis() throws Exception {
		return listaPerfis;
	}

	public void setListaPerfis(List<Perfil> listaPerfis) {
		this.listaPerfis = listaPerfis;
	}	
}