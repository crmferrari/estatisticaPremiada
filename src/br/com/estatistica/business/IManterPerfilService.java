package br.com.estatistica.business;

import java.util.List;

import br.com.estatistica.common.entity.Perfil;
import br.com.estatistica.common.entity.Sistema;

public interface IManterPerfilService {
	
	public Perfil salvarPerfil(Perfil perf) throws Exception;	
	public List<Sistema> listSistemas() throws Exception;
	public List<Perfil> listaPerfis() throws Exception;
	public List<Perfil> listaPerfisSistema(Integer idSistema) throws Exception;
}