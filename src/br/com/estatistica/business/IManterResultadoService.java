package br.com.estatistica.business;

import br.com.estatistica.common.entity.Resultado;

public interface IManterResultadoService {
	
	public Resultado salvarResultado(Resultado resultado) throws Exception;	
	
}