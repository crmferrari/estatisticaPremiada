package br.com.estatistica.presentation;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.estatistica.business.IManterSistemaService;
import br.com.estatistica.common.entity.Sistema;

@ManagedBean(eager = true)
@RequestScoped
public class ManterSistemaMB {
	
	private Sistema sistema;
	private IManterSistemaService manterSistemaService;
	private List<Sistema> listaSistemas;
	
	public String salvar () throws Exception{
		
		this.getManterSistemaService().salvarSistema(sistema);
		listaSistemas = this.getListaSistemas();
    	return "manterSistema";
    	
    }
	
	public IManterSistemaService getManterSistemaService() {
		
		return manterSistemaService;
	}

	public void setManterSistemaService(
			IManterSistemaService manterSistemaService) {
		this.manterSistemaService = manterSistemaService;
	}
	
	public Sistema getSistema() {
		if (sistema == null) {
			sistema = new Sistema();
		}
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public List<Sistema> getListaSistemas() throws Exception {
		return this.getManterSistemaService().listAll();
	}

	public void setListaSistemas(List<Sistema> listaSistemas) {
		this.listaSistemas = listaSistemas;
	}
		
}