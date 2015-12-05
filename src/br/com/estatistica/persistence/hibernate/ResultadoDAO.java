package br.com.estatistica.persistence.hibernate;

import br.com.estatistica.common.entity.Resultado;
import br.com.estatistica.persistence.IResultadoDAO;

public class ResultadoDAO extends CrudDAO<Resultado, Integer> implements IResultadoDAO{

	public ResultadoDAO() {

		super(Resultado.class);
		
	}
}
