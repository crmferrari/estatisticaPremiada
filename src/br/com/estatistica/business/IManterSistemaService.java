package br.com.estatistica.business;

import java.util.List;

import br.com.estatistica.common.entity.Sistema;

public interface IManterSistemaService {
	
	public Sistema salvarSistema(Sistema sistema) throws Exception;	
	public List<Sistema> listAll() throws Exception;
	
}