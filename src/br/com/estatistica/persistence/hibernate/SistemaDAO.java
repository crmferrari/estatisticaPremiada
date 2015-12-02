package br.com.estatistica.persistence.hibernate;

import br.com.estatistica.common.entity.Sistema;
import br.com.estatistica.persistence.ISistemaDAO;

public class SistemaDAO extends CrudDAO<Sistema, Integer> implements ISistemaDAO{

	public SistemaDAO() {

		super(Sistema.class);
		
	}
}
