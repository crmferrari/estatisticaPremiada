package br.com.estatistica.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.estatistica.business.IManterResultadoService;
import br.com.estatistica.common.entity.Resultado;

@ManagedBean(eager = true)
@RequestScoped
public class ManterResultadoMB {
	
	private Resultado resultado;
	private IManterResultadoService manterResultadoService;
	
	public String salvar () throws Exception{
		
		this.getManterResultadoService().importarResultados();
    	return "manterResultado";
    	
    }
	
	public IManterResultadoService getManterResultadoService() {
		
		return manterResultadoService;
	}

	public void setManterResultadoService(
			IManterResultadoService manterResultadoService) {
		this.manterResultadoService = manterResultadoService;
	}
	
	public Resultado getResultado() {
		if (resultado == null) {
			resultado = new Resultado();
		}
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}		
}