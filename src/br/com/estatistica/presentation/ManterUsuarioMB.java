package br.com.estatistica.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.estatistica.business.IManterUsuarioCadAdmService;
import br.com.estatistica.common.entity.UsuarioCadAdm;

@ManagedBean(eager = true)
@RequestScoped
public class ManterUsuarioMB {
	
	private UsuarioCadAdm usuario;
	private IManterUsuarioCadAdmService manterUsuarioCadAdmService;
	
	public String salvar () throws Exception{
		
		this.getManterUsuarioCadAdmService().salvarUsuarioCadAdm(usuario);
  	
    	return "manterUsuario";
    	
    }
	
	public IManterUsuarioCadAdmService getManterUsuarioCadAdmService() {
		
		return manterUsuarioCadAdmService;
	}

	public void setManterUsuarioCadAdmService(
			IManterUsuarioCadAdmService manterUsuarioCadAdmService) {
		this.manterUsuarioCadAdmService = manterUsuarioCadAdmService;
	}
	
	public UsuarioCadAdm getUsuario() {
		if (usuario == null) {
			usuario = new UsuarioCadAdm();
		}
		return usuario;
	}

	public void setUsuario(UsuarioCadAdm usuario) {
		this.usuario = usuario;
	}
		
}